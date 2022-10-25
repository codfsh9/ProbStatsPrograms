import java.text.DecimalFormat;

public class Seafood extends FishMarket {

    public int index;
    public double weight;
    public double pricePerPound;
    public String type;

    //Round the double variables to 2 decimal places.
    private static final DecimalFormat df = new DecimalFormat("0.00");


    public Seafood(int index, String type, double weight, double pricePerPound) {
        this.index = index;
        this.type = type;
        this.weight = weight;
        this.pricePerPound = pricePerPound;

    }

    //Override toString so values are correct when outputting
    @Override
    public String toString() {
        return (this.getSeafoodIndex() + "," + this.getSeafoodType() + "," + this.getSeafoodWeight() +
                "," + this.getSeafoodPrice());
    }

    private String getSeafoodPrice() {
        return df.format(pricePerPound);
    }

    private String getSeafoodWeight() {
        return df.format(weight);
    }

    private String getSeafoodType() {
        return type;
    }

    private int getSeafoodIndex() {
        return index;
    }
}
