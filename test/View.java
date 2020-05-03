import Customers.Customers;
import Customers.Pet;
import Dao.CustomerDao;
import Room.HotelRoom;

import dataaccess.CustomerDaoImp;
import java.io.InputStream;
import java.util.Scanner;
import static javafx.application.Platform.exit;
import pethotel.PetHotel;


public class View{
    public static void main(String[] args) {
     Menu.menuOperation();
    }
    
//    public static String mainMenu(){
//    String menulist = "-------------PET HOTEL-----------------"
//                    +"\n "+ " FOR DAILY RESERVED " +" \n" +" to reserved the hotel service press menu number"
//                    +"\n"+" 1. view hotel information "
//                    +"\n"+" 2. Register as a hotel customer "
//                    +"\n"+" 3. exit";
//    return menulist;
//    
//    }
//    public static void menuOperation(){
//        System.out.println(Mainmenu());
//        Scanner sc = new Scanner(System.in);
//        int select = 0;
//        select = sc.nextInt();
//        do{
//        switch(select){
//            case 1: viewHotelInformation();
//            break;
//            case 2: register();
//            break;
//        }
//        
//        }while(select!=3);
//            exit();
            
    }

   

