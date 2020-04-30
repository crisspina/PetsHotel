package Customers;


import java.util.Objects;
import java.util.Scanner;

public class Customers {
    private int CustomerID;
    private String fName;
    private String lName;
    private String phoneNumber;


    public Customers(){
        
    }
    
    public Customers(int CustomerID, String fName, String lName, String phoneNumber, Pet pet) {
        this.CustomerID = CustomerID;
        this.fName = fName;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
    }
    
    public void cusScan(){
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Enter first name: ");
        fName = sn.nextLine();
        
        System.out.print("Enter last name: ");
        lName = sn.nextLine();
        
        System.out.print("Enter phonenumber: ");
        phoneNumber = sn.nextLine();
        
        System.out.println("---------------------");
        System.out.println("First name: " + fName);
        System.out.println("Last name: " + lName);
        System.out.println("Phone number: " + phoneNumber);;
        System.out.println("Customer ID: " + CustomerID);
    }

    public int getCustomerID() {
        return CustomerID;
    }
    
    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customers other = (Customers) obj;
        if (this.CustomerID != other.CustomerID) {
            return false;
        }
        if (!Objects.equals(this.fName, other.fName)) {
            return false;
        }
        if (!Objects.equals(this.lName, other.lName)) {
            return false;
        }
        if (!Objects.equals(this.phoneNumber, other.phoneNumber)) {
            return false;
        }
        return true;
    }

  

    @Override
    public String toString() {
        return "Customers{" + "CustomerID=" + CustomerID + ", fName=" + fName + ", lName=" + lName + ", phoneNumber=" + phoneNumber + '}';
    }
    
    
}
