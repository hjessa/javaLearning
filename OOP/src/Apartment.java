public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared){
        return Math.abs((this.squares*this.pricePerSquare) - (compared.squares*compared.pricePerSquare));
    }

    public boolean moreExpensiveThan(Apartment compared){
        int thisPrice = this.squares*this.pricePerSquare;
        int comparedPrice = compared.squares*compared.pricePerSquare;

        return thisPrice>comparedPrice;
    }
}