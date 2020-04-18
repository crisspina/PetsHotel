
package Room;


public abstract class Room implements RoomInformation{
    private String runningRoomNumber; //ต้องมีมั้ย
    private boolean avaliable;
    private static int pricePerNight;
    private RoomType roomType;
    //private Pet pet;

    public Room() {
    }
    
    public Room(String Rnum){
    this.runningRoomNumber=Rnum;
    }
//    public abstract boolean isFull();

    public RoomType getRoomType() {
        return roomType;
    }
    
    
    public boolean avaliable(){
    this.avaliable=true;
    return this.avaliable;
    }
    
  
}
