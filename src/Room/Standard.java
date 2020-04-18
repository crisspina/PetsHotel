
package Room;

public class Standard extends Room{

   
    
    public Standard() {
    }

    public Standard(String rNumber){
    this.runningRoomNumber=rNumber;
    }
    
    public static int getSTANDARD_ROOM_PER_NIGHT() {
        return STANDARD_ROOM_PER_NIGHT;
    }
    
    public String getRoomrunningNumber(){
    return runningRoomNumber;
    }
    
    
    @Override
    public boolean isFull() {
        return !(this.avaliable);
    }

    @Override
    public String toString() {
        return "Standard{" + "runningRoomNumber=" + getRoomrunningNumber() + '}';
    }
    
    
}
