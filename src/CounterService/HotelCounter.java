package CounterService;

import Activities.Activities;
import Activities.ActivitiesFee;
import Customers.ReservedCustomers;
import Room.HotelRoom;
import Room.Room;
import Room.RoomInformation;
import Room.RoomType;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import pethotel.PetHotel;

public class HotelCounter implements Payment, ReserveOperation, Check {

    private int countDe, countStd, countSup;
    private HotelRoom hRoom;

    
    public HotelCounter(){
    this.countDe=hRoom.getCountDe();
    this.countStd=hRoom.getCountStd();
    this.countSup=hRoom.getCountSup();
    }
    public int checkBill(ReservedCustomers c) {
        int price = 0;
      
       
        switch (c.getResRoom()) {
            case DELUXE:
                price += RoomInformation.DELUXE_ROOM_PER_NIGHT;
                break;
            case STANDARD:
                price += RoomInformation.STANDARD_ROOM_PER_NIGHT;
                break;
            default:
                price += RoomInformation.SUPERIOR_ROOM_PER_NIGHT;
                break;
        }
        for (int i = 0; i < c.resAct.length; i++) {
            switch (c.resAct[i]) {
                case GROOMING:
                    price += ActivitiesFee.GROOMING;
                    break;
                case PLAYTIME:
                    price += ActivitiesFee.PLAYTIME;
                    break;
                case EXERCISE:
                    price += ActivitiesFee.EXERCISE;
                    break;
                case MESSAGEANDSPA:
                    price += ActivitiesFee.MESSAGEANDSPAR;
                    break;
                case GARDEN:
                    price += ActivitiesFee.GARDEN;
                    break;
                case PHOTOSET:
                    price += ActivitiesFee.PHOTOSET;
                    break;
                default:
                    price += 0;
                    break;
            }

            printSlip(c);
            return price;
        }
        return -1; //กรณีที่ไม่ตรงจองห้องไม่ทำอะไรเลย
    }

        @Override
    public void printSlip(ReservedCustomers c) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("slip.txt");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        PrintWriter pw = new PrintWriter(fos);
        pw.println("YOUR RESERVED INFORMATION");
          switch (c.getResRoom()) {
            case DELUXE:
               pw.println("Deluxe Room"+RoomInformation.DELUXE_ROOM_PER_NIGHT+"baht");
                break;
            case STANDARD:
                pw.println("Standard Room"+RoomInformation.STANDARD_ROOM_PER_NIGHT+"baht");
                break;
            default:
               pw.println("Superior Room"+RoomInformation.SUPERIOR_ROOM_PER_NIGHT+"baht");
                break;
        }
          
          pw.print("Reserved Acitvities for your pet");
        for (int i = 0; i < c.resAct.length; i++) {
            switch (c.resAct[i]) {
                case GROOMING:
                    pw.println("Grooming"+ActivitiesFee.GROOMING+"baht");
                    break;
                case PLAYTIME:
                   pw.println("Playtime"+ActivitiesFee.PLAYTIME+"baht");
                    break;
                case EXERCISE:
                    pw.println("Exercise"+ActivitiesFee.EXERCISE+"baht");
                    break;
                case MESSAGEANDSPA:
                     pw.println("Message and spa"+ActivitiesFee.MESSAGEANDSPAR+"baht");
                    break;
                case GARDEN:
                    pw.println("Garden"+ActivitiesFee.GARDEN+"baht");
                    break;
                case PHOTOSET:
                     pw.println("Photoset"+ActivitiesFee.PHOTOSET+"baht");
                    break;
                default :
                    pw.println("You reserved no activity for your pet");
               
            }
            
        }
            
    }
    
//     public static Comparator<PersonContact> firstnameComparator() {
//        return (Comparator<PersonContact>) (PersonContact p1, PersonContact p2) -> p1.getPerson().getFirstName().compareTo(p2.getPerson().getFirstName());
//    }
//
//    public static Comparator<PersonContact> lastnameComparator() {
//        return (Comparator<PersonContact>) (PersonContact p1, PersonContact p2) -> p1.getPerson().getLastName().compareTo(p2.getPerson().getLastName());
// 
        @Override
    public void addPet(ReservedCustomers c) {
        if (!(checkIsFull(c)||checkReserveHistory(c))) {
            if (c.getResRoom().equals(RoomType.DELUXE)) {
                for (int i = 0; i < hRoom.getDRoomLength(); i++) {
                   555555555 hr.get.dRooms[i]=c;
                    countDe++;
            }
            }
            
        }
        System.out.println("CANNOT ADD PET");
    }

    public void deletePet(ReservedCustomers c) {

    }

    @Override
    public int searchPet(ReservedCustomers c) {
        if (c.getResRoom().equals(RoomType.DELUXE)) {
            for (int i = 0; i < countDe; i++) {
                if (c.getCustomers().equals(hRoom.getdRooms(i).getRc().getCustomers())) {
                    return i;
                }
                System.out.println("not found");
                return  -1;
            }
        }
        if (c.getResRoom().equals(RoomType.SUPERIOR)) {
            for (int i = 0; i < countSup; i++) {
                if (c.getCustomers().equals(hRoom.getSupRooms(i).getRc().getCustomers())) {
                    return i;
                }
                System.out.println("not found");
                return  -1;
            }
        }
        if (c.getResRoom().equals(RoomType.STANDARD)) {
            for (int i = 0; i < countStd; i++) {
               
                if (c.getCustomers().equals(hRoom.getStdRooms(i).getRc().getCustomers())) {
                    return i;
                }
                System.out.println("not found");
                return  -1;
            }
        }
        System.out.println("customers didn't reserved any room");
        return -1;
    }

    
    @Override
    public boolean checkReserveHistory(ReservedCustomers c) {
        if (searchPet(c) != -1) {
            System.out.println("YOU HAVE ALREADY RESERVED");
            return true;
        }
        return false;
    }

    @Override
    public boolean checkIsFull(ReservedCustomers c) {
        switch (c.resRoom) {
            case DELUXE:
                return countDe==RoomInformation.MAX_DELUXE;
                
            case STANDARD:
                 return countStd==RoomInformation.MAX_STANDARD;
                
            default:
                 return countSup==RoomInformation.MAX_SUPERIOR;
               
        }
        
    }

    

  

    
}
