/**
 * main class
 * Use case 4 : room search
 * description: this class demonstrate availability of rooms without modifying
 *
 * @author ayush pandey
 * version 4.0
 */
public class UseCase4RoomSearch {
    public static void main(String[] args){

        SingleRoom singleRoom=new SingleRoom();
        DoubleRoom doubleRoom=new DoubleRoom();
        SuiteRoom suiteRoom=new SuiteRoom();
        RoomInventory inventory=new RoomInventory();
        RoomSearchService searchService= new RoomSearchService();
        searchService.searchAvailableRooms(inventory,singleRoom,doubleRoom,suiteRoom);

    }
}
