package Customers;


import java.util.Objects;
import java.util.Scanner;

public class Customers {
    private long IdNumber;
    private String fName;
    private String lName;
    private String phoneNumber;
    private Pet pet;

    public Customers(){
        
    }

    public Customers(long IdNumber, String fName, String lName, String phoneNumber) {
        this.IdNumber = IdNumber;
        this.fName = fName;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
    }
    
    public Customers(long CustomerIDnum, String fName, String lName, String phoneNumber,Pet pet) {
        this.IdNumber = CustomerIDnum;
        this.fName = fName;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
        this.pet = pet;
    }

    public long getIdNumber() {
        return IdNumber;
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

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Pet getPet() {
        return pet;
    }

    public long getCustomerID() {
        return IdNumber;
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
        if (this.IdNumber != other.IdNumber) {
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
        if (!Objects.equals(this.pet, other.pet)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "Customers{" + "CustomerID=" + IdNumber + ", fName=" + fName + ", lName=" + lName + ", phoneNumber=" + phoneNumber +"your pet= "+getPet()+'}';
    }
    
    
}
