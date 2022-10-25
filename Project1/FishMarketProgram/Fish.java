public class Fish extends Seafood {

    int fIndex;
    String fType;
    double fishWeight;
    double fishPrice;


    public Fish(int fIndex, String fType, double fishWeight, double fishPrice) {
        super(fIndex, fType, fishWeight, fishPrice);
        this.fType = type;
        this.fIndex = index;
        this.fishWeight = weight;
        this.fishPrice = pricePerPound;
    }

}
