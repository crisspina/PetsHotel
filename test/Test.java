
import Customers.Pet;
import Dao.CustomerDao;
import dataaccess.CustomerDaoImp;
import java.util.Scanner;

public class Test {

    private static void CheckStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private CustomerDao custDao =  new CustomerDaoImp();
    

    static String menu = "----------<<PETS HOTEL>>----------\n"
            + "1. Create new Customer\n"
            + "2. Check room and room status\n" //ห้องขนาดเท่านี้ว่างกี่ห้อง
            + "3. Add pet in your lish\n" //เพิ่มได้ทีละตัว
            + "4. Book Room and Activites\n" //ต่อสัตว์1ตัว
            + "5. Check your Status\n"
            + "6. Cancel Booking\n"
            + "0. exit\n"
            + ">>>>>Select menu: ";
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        Pet p = new Pet();
//        p.petScan();
        int select;
        do {
            select = menuSelection();
            switch (select) {
                case 1:
                    CreateNewCustomer();
                    break;
                case 2:
                    CheckRoomStatus();
                    break;
                case 3:
                    AddPet();
                    break;
                case 4:
                    Booking();
                    break;
                case 5:
                    CheckStatus();
                    break;
                case 6:
                    CancelBooking();
            }
        } while (select != 0);
        System.out.println(">>>>>Exit<<<<<");
    }

    public static int menuSelection() {
        System.out.print(menu);
        int select = input.nextInt();
        input.nextLine();
        return select;
 }
//Integer.parseInt(input.nextLine());
   
//        Pet p = new Pet();
//        p.petScan();
//        Customers c = new Customers();
//        c.cusScan();

    private static void CreateNewCustomer() {
        View v =new View();
        v.printCustomer();
    }

      private static void CancelBooking() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private static void CheckRoomStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void AddPet() {
        Pet p = new Pet();
        p.petScan();

    }

    private static void Booking() {

//         ReservedCustomers rc = new ReservedCustomers();
//        rc.setReservedActivities();
   }

//        ReservedCustomers rc = new ReservedCustomers();
//        rc.setReservedActivities();
//    }
//
//
//    private static void CheckStatus() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

}

