/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Room;

/**
 *
 * @author User
 */
public class Superior extends Room{

 
    public Superior() {
     
    }
    
    public Superior(String rNumber){
    this.runningRoomNumber=rNumber;

    }
    public static int getSUPERIOR_ROOM_PER_NIGHT() {
        return SUPERIOR_ROOM_PER_NIGHT;
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
        return "Superior{" + "runningRoomNumber=" + getRoomrunningNumber() + '}';
    }
    
    
}
