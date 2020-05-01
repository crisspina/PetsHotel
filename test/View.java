
import Customers.Customers;
import Customers.PetType;
import Dao.CustomerDao;
import Room.RoomType;
import dataaccess.CustomerDaoImp;
import java.util.Scanner;


public class View {
    public void printCustomer(){
        Customers C = null ;
        Scanner sn = new Scanner(System.in);
        System.out.println("-Create new Customer-");
        System.out.print("Enter first name: ");
        String fName = sn.nextLine();
        
        System.out.print("Enter last name: ");
        String lName = sn.nextLine();
        
        System.out.print("Enter phone number: ");
        String phoneNumber = sn.nextLine();
        
        System.out.print("Enter Customer ID: ");
        int CustomerID = sn.nextInt();
        
        System.out.println("---------------------");
        
       C = new Customers(CustomerID, fName, lName, phoneNumber); 
//        Customers c = new Customers();
//        c.cusScan();
         CustomerDao custDao = new CustomerDaoImp();
         custDao.insert(C);
    }
    
    public void printRoom(){
        Scanner sn = new Scanner(System.in);
        RoomType type1;
        System.out.println("-Check room and room status-");
        
        int choice;
        System.out.println("Room type: ");
        System.out.println("\t 1.Standard Room");
        System.out.println("\t 2.Deluxe Room");
        System.out.println("\t 3.Superior Room ");
        System.out.print("Enter your number room type: ");
        choice = sn.nextInt();
        switch (choice) {
                case 1:
                    type1 = RoomType.STANDARD;
                    break;
                case 2:
                    type1 = RoomType.DELUXE;
                    break;
                case 3:
                    type1 = RoomType.SUPERIOR;
                    break;
        }
        System.out.println("---------------------");
    }
    
    public void printPet(){       
        Scanner sn = new Scanner(System.in);
        PetType type2;
        System.out.print("Enter pet name: ");
        String name = sn.nextLine();
        
        System.out.print("Enter pet age: ");
        String age = sn.nextLine();
        
        int choice;
            System.out.println("Pet type: ");
            System.out.println("\t 1. DOG ");
            System.out.println("\t 2. CAT ");
            System.out.println("\t 3. RABBIT");
            System.out.println("\t 4. RACOON ");
            System.out.print("Enter your number pet type: ");            
            choice = sn.nextInt();
            switch (choice) {
                case 1:
                    type2 = PetType.DOG;
                    break;
                case 2:
                    type2 = PetType.CAT;
                    break;
                case 3:
                    type2 = PetType.RABBIT;
                    break;
                case 4:
                    type2 = PetType.RACOON;
                    break;
            }
                
         if(addMai()){
                petScan();
            }else{}
        System.out.println("---------------------");
    }
    
    public boolean addMai() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Do you want to add another pet: \n"
                + "\t  1 : Yes \n"
                + "\t  2 : No \n"
                + "Answers number: ");
        int choose = sn.nextInt();
        if (choose == 1) {
            return true;
        }
        return false;
    }
        
}


//        System.out.println("First name: " + fName);
//        System.out.println("Last name: " + lName);
//        System.out.println("Phone number: " + phoneNumber);
//        System.out.println("Customer ID: " + CustomerID);

//        System.out.println("Pet name: " + name);
//        System.out.println("Pet age: " + age);
//        System.out.println("Pet type: " + type);