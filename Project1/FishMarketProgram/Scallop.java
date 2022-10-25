public class Scallop extends Seafood {

    int scIndex;
    String scType;
    double scallopWeight;
    double scallopPrice;


    public Scallop(int scIndex, String scType, double scallopWeight, double scallopPrice) {
        super(scIndex, scType, scallopWeight, scallopPrice);
        this.scIndex = index;
        this.scType = type;
        this.scallopWeight = weight;
        this.scallopPrice = pricePerPound;

    }
}
