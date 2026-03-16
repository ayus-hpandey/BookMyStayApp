/**
 * this represent abstract class
 */
public abstract class Room {
    protected int numberOfBeds;
    protected int squareFeet;
    protected double pricePerNight;
    Room(int numberOfBeds, int squareFeet, double pricePerNight){
        this.numberOfBeds=numberOfBeds;
        this.squareFeet=squareFeet;
        this.pricePerNight=pricePerNight;
    }
    public void displayRoom(){
        System.out.println("beds: "+numberOfBeds);
        System.out.println(squareFeet+" square Feet");
        System.out.println("price per night: "+pricePerNight);
    }

}
