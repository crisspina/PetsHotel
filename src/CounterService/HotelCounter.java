package CounterService;

import Activities.Activities;
import Activities.ActivitiesFee;
import Customers.ReservedCustomers;
import Room.RoomInformation;
import Room.RoomType;

public class HotelCounter implements Payment, ReserveOperation, Check {

    private int countDe, countStd, countSup;
    private ReservedCustomers cus;
    //private PetHotel h;

    public int checkBill(ReservedCustomers c) {
        int price = 0;
        if (c.getResRoom().equals(RoomType.DELUXE)) {
            price += RoomInformation.DELUXE_ROOM_PER_NIGHT;
        } else if (c.getResRoom().equals(RoomType.STANDARD)) {
            price += RoomInformation.STANDARD_ROOM_PER_NIGHT;
        } else {
            price += RoomInformation.SUPERIOR_ROOM_PER_NIGHT;
        }
        for (int i = 0; i < c.resAct.length; i++) {
            if (c.resAct[i].equals(Activities.GROOMMING)) {
                price += ActivitiesFee.GROOMING;
            } else if (c.resAct[i].equals(Activities.PLAYTIME)) {
                price += ActivitiesFee.PLAYTIME;
            } else if (c.resAct[i].equals(Activities.EXERCISE)) {
                price += ActivitiesFee.EXERCISE;
            } else if (c.resAct[i].equals(Activities.MESSAGEANDSPA)) {
                price += ActivitiesFee.MESSAGEANDSPAR;
            } else if (c.resAct[i].equals(Activities.GARDEN)) {
                price += ActivitiesFee.GARDEN;
            } else if (c.resAct[i].equals(Activities.PHOTOSET)) {
                price += ActivitiesFee.PHOTOSET;
            } else {
                price +=0;
            }
            
            printSlip();
            return price;
        }
        return -1; //กรณีที่ไม่ตรงจองห้องไม่ทำอะไรเลย
    }

    public void printSlip() {

    }

    public void addPet(ReservedCustomers c) {

    }

    public void deletePet(ReservedCustomers c) {

    }

    public int searchPet(ReservedCustomers c) {
//        for (int i = 0; i < countDe; i++) {
//            if (c.getResRoom().equals(RoomType.DELUXE)) {
//                return i;
//            }
//        }
//        for (int i = 0; i < countSup; i++) {
//            if (c.getResRoom().equals(RoomType.SUPERIOR)) {
//                return i;
//            }
//        }
//        for (int i = 0; i < countStd; i++) {
//            if (c.getResRoom().equals(RoomType.SUPERIOR)) {
//                return i;
//            }
//
//        }
//        return -1;
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

    @Override
    public int checkBill() {
        
    }

    @Override
    public void addPet() {
        
    }

    @Override
    public void deletePet() {
        
    }

    @Override
    public void searchPet() {
      
    }

    @Override
    public boolean checkRoom() {
      
    }

}
