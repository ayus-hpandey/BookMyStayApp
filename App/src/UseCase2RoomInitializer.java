/**
 * main class
 * Use case 2 : room initialization
 * description: this class demonstrate how many rooms are available and which type of room are available
 *
 * @author ayush pandey
 * version 2.0
 */
public class UseCase2RoomInitializer {
    public static void main(String[] args){
        int singleAvailable=5;
        int doubleAvailable=3;
        int suiteAvailable=2;
        SingleRoom singleRoom=new SingleRoom();
        DoubleRoom doubleRoom=new DoubleRoom();
        SuiteRoom suiteRoom=new SuiteRoom();
        System.out.println("Single Room:");
        singleRoom.displayRoom();
        System.out.println("Available: "+singleAvailable);
        System.out.println("Double Room:");
        doubleRoom.displayRoom();
        System.out.println("Available: "+doubleAvailable);
        System.out.println("Suite Room:");
        doubleRoom.displayRoom();
        System.out.println("Available: "+suiteAvailable);
    }
}
