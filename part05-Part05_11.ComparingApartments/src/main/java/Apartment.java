
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;
    

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
   
    
    public boolean largerThan(Apartment compared){
        
        // compare squares
        
        return this.squares > compared.squares;
            
        
    }
    
    public int priceDifference(Apartment compared){
        
        int priceDifference = (this.princePerSquare * this.squares) - (compared.princePerSquare * compared.squares);
        
        if(priceDifference < 0) {
            return priceDifference * -1;
        }
        return priceDifference;
  
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int priceApartment = this.princePerSquare * this.squares;
        int comparedPriceApartment = compared.princePerSquare * compared.squares;
        if(priceApartment > comparedPriceApartment){
            return true;
        } else {
            return false;
        }
    
    }

}
