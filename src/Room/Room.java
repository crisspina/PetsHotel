
package Room;

import Customers.ReservedCustomers;


public abstract class Room implements RoomInformation{
    private String runningRoomNumber; //ต้องมีมั้ย
    private boolean avaliable;
    private static int pricePerNight;
    private RoomType roomType;
   // private ReservedCustomers pet;

    public Room() {
    }
    
    public Room(String Rnum){
    this.runningRoomNumber=Rnum;
    }
//    public abstract boolean isFull();

    public RoomType getRoomType() {
        return roomType;
    }

//    public ReservedCustomers getPet() {
//        return ReservedCustomers.getCustomers().getPet();
//    }
    
    
    public boolean avaliable(){
    this.avaliable=true;
    return this.avaliable;
    }
    
  
}
