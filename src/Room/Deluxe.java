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
public class Deluxe extends Room{


    public Deluxe() {
    }
    
    public Deluxe(String rNumber) {
      this.runningRoomNumber=rNumber;
    }
  
    public static int getSTANDARD_ROOM_PER_NIGHT() {
        return DELUXE_ROOM_PER_NIGHT;
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
        return "Deluxe{" + "runningRoomNumber=" + getRoomrunningNumber() + '}';
    }

    
    
  


}
