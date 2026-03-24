/**
 * use case 3: centralized room inventory management
 * this class acts as the single source of truth for room availability in the hotel
 * version 3.0
 */

import java.util.HashMap;
import java.util.Map;


public class RoomInventory {
    private Map<String,Integer>roomAvailability;
    public RoomInventory(){
roomAvailability=new HashMap<>();
initializeInventory();
    }
    private void initializeInventory(){
        roomAvailability.put("Single",5);
        roomAvailability.put("Double",3);
        roomAvailability.put("Suite",2);
    }
    public Map<String,Integer> getRoomAvailability(){
        return roomAvailability;
    }
    public void updateAvailability(String room,int count){
        roomAvailability.put(room,count);
    }
}
