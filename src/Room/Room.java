
package Room;

import Customers.ReservedCustomers;


public class Room {
    private String runningRoomNumber; 
    private RoomType roomType;
    private ReservedCustomers rc;
    private RoomStatus status;
    private long cusId;

//    public Room() {
//    }
    
//    public Room(String Rnum){
//    this.runningRoomNumber=Rnum;
//    }

//    public Room(ReservedCustomers rc) {
//        this.rc = rc;
//    }
//    

    public Room(String runningRoomNumber, RoomType roomType) {
        this.runningRoomNumber = runningRoomNumber;
        this.roomType = roomType;
        this.status=RoomStatus.AVAILABLE;
    }

  
    public RoomType getRoomType() {
        return roomType;
    }


    public ReservedCustomers getRc() {
        return rc;
    }

    public void setRc(ReservedCustomers rc) {
        this.rc = rc;
        setCusID();
    }
    
    public void setCusID(){
    this.cusId=rc.getCustomers().getCustomerID();
    }

    public long getCusId() {
        return cusId;
    }
    
    public RoomStatus getStatus() {
        return status;
    }

    public void setStatus(RoomStatus status) {
     this.status=status;  
    }
    
//    @Override
//    public String toString() {
//        return "Room{" + "runningRoomNumber=" + runningRoomNumber +" roomType=" + roomType +
//                ", reserved customers=" + getRc()+"Room status= "+getStatus() + '}';
//    }
    
}
