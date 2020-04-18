
package CounterService;

import Customers.ReservedCustomers;
import Room.RoomType;
 import pethotel.PetHotel;


public class HotelCounter implements Payment,ReserveOperation,Check{

    private int countDe,countStd,countSup;
    private ReservedCustomers cus;
    private PetHotel h;
  
    public int checkBill(ReservedCustomers c) {
      int price;
     price = 12+23+34+45;
     return price;
    }

    public void printSlip() {
       
    }


    public void addPet(ReservedCustomers c) {
        for (int i = 0; i < 5; i++) {
       
        }
    }


    public void deletePet(ReservedCustomers c) {
            }

    public int searchPet(ReservedCustomers c) {
        for (int i = 0; i < countDe; i++) {
            if (c.getResRoom().equals(RoomType.DELUXE)) {
                return i;
            }
        }
        for (int i = 0; i < countSup; i++) {
            if (c.getResRoom().equals(RoomType.SUPERIOR)) {
                return i;
            }
        }
        for (int i = 0; i < countStd; i++) {
            if (c.getResRoom().equals(RoomType.SUPERIOR)) {
                return i;
        }
        
    }
        return -1;
    }
// public int searchForName(String name){
//        for (int i = 0; i < count; i++) {
//            //if(friend[i] instanceof PersonContact)
//          if (friends[i].getType() == ContactType.PERSON) { 
//                if (((PersonContact)friends[i]).getPerson().getFirstName().equals(name)) {
//                    return i;
//                }
//            }else{
//                if (((BusinessContact)friends[i]).getCompany().getName().equals(name)) {
//                    return i;
//                }
//            }
//        }
//        return -1;
//    }
    @Override
    public boolean checkReserveHistory() {
       
    }

    
}
