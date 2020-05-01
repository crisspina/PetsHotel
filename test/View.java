
import Customers.Customers;
import Dao.CustomerDao;
import dataaccess.CustomerDaoImp;
import java.util.Scanner;


public class View {
    public void printCustomer(){
        Customers C = null ;
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Enter first name: ");
        String fName = sn.nextLine();
        
        System.out.print("Enter last name: ");
        String lName = sn.nextLine();
        
        System.out.print("Enter phone number: ");
        String phoneNumber = sn.nextLine();
        
        System.out.print("Enter Customer ID: ");
        int CustomerID = sn.nextInt();
        
        System.out.println("---------------------");
        System.out.println("First name: " + fName);
        System.out.println("Last name: " + lName);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Customer ID: " + CustomerID);
        
       C = new Customers(CustomerID, fName, lName, phoneNumber); 
//        Customers c = new Customers();
//        c.cusScan();
         CustomerDao custDao = new CustomerDaoImp();
        custDao.insert(C);
    }
        
}
