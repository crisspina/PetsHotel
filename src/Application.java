


import Dao.CustomerDao;
import dataaccess.CustomerDaoImp;
import java.util.Scanner;


public class Application {
    
        static String menu = "----------<<PETS HOTEL>>----------\n"
            + "1. list all customers\n" // name id
            + "3. List all pets\n"   //(petlish)name age type
            + "4. List All activities\n"   
            + "5. l"
            + "5. List all room\n" //list room and status
            + "0. exit\n"
            + ">>>>>Select menu: " ;
        static Scanner input = new Scanner(System.in);
        
        
          public static void main(String[] args) {
        int select;
        do {
            select = menuSelection();
            switch (select) {
                case 1: //list all customers
                    listCustomer();
                    break;
                case 2: //list all pets
                    addCustomer();
                    break;
                case 3: //list all activities
                    listProduct();
                    break;
                case 4: //list all room

                    break;
                case 5://show wishlist
            }
        } while (select != 0);
        System.out.println("Good by");
    }
          
           public static int menuSelection() {
        System.out.print("\n----------------------------\n");
        System.out.print(menu);
        return input.nextInt();//Integer.parseInt(input.nextLine());
    }

    private static void listCustomer() {
        CustomerDao custDao = new CustomerDaoImp();
        GeneralList<Customer> custs = custDao.getAll();
        int i = 0;
        for (Customer temp : custs) {
            System.out.println(i++ + ". " + temp);
        }
    }

    private static void listProduct() {
        ProductDao prodDao = new ProductDaoImp();
        GeneralList<Product> prods = prodDao.getAll();
        int i = 0;
        for (Product temp : prods) {
            System.out.println(i++ + ". " + temp);
        }
    }

    private static void addCustomer() {
        System.out.print("Customer id: ");
        int id=input.nextInt();input.nextLine();
        System.out.print("Customer name: ");
        String name=input.nextLine();
        CustomerDao custDao = new CustomerDaoImp();
        custDao.insert(new Customers(id,name));
        
// z
    }
      
    
}
