/**
 * main class
 * Use case 3 : room initialization
 * description: this class demonstrate how many rooms are available and which type of room are available
 *
 * @author ayush pandey
 * version 3.0
 */
public class UseCase3RoomInventory {
    public static void main(String[] args){

        SingleRoom singleRoom=new SingleRoom();
        DoubleRoom doubleRoom=new DoubleRoom();
        SuiteRoom suiteRoom=new SuiteRoom();
        RoomInventory inventory=new RoomInventory();
        System.out.println("Single Room:");
        singleRoom.displayRoom();
        System.out.println("Available: "+inventory.getRoomAvailability().get("Single room"));
        System.out.println("Double Room:");
        doubleRoom.displayRoom();
        System.out.println("Available: "+inventory.getRoomAvailability().get("Double room"));
        System.out.println("Suite Room:");
        doubleRoom.displayRoom();
        System.out.println("Available: "+inventory.getRoomAvailability().get("Suite room"));
    }
}
