/**
 * this class provide functions to view available rooms
 * version 4.0
 */

import java.util.Map;

public class RoomSearchService {
    public void searchAvailableRooms(RoomInventory inventory, SingleRoom singleRoom, DoubleRoom doubleRoom,SuiteRoom suiteRoom){
        Map<String,Integer>availability=inventory.getRoomAvailability();
        if(availability.get("Single room")>0){
            singleRoom.displayRoom();
            System.out.println("Available Single room: "+availability.get("Single room"));
        }
        if(availability.get("Double room")>0){
            doubleRoom.displayRoom();
            System.out.println("Available Double room: "+availability.get("Double room"));
        }
        if(availability.get("Suite room")>0){
            suiteRoom.displayRoom();
            System.out.println("Available Suite room: "+availability.get("Suite room"));
        }

    }
}
