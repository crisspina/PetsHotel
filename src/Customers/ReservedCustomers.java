
package Customers;

import Activities.Activities;
import Room.RoomType;

public class ReservedCustomers extends Customers {
    public RoomType resRoom;
    public Activities resAct[];
    public Customers customers;
    
    
   public ReservedCustomers(String fName, String lName, String phoneNumber, Pet pet) {
        super(fName, lName, phoneNumber, pet);
    }

    public ReservedCustomers(RoomType resRoom, Activities[] resAct, Customers customers, String fName, String lName, String phoneNumber, Pet pet) {
        super(fName, lName, phoneNumber, pet);
        this.resRoom = resRoom;
        this.resAct = resAct;
        this.customers = customers;
    }
    
    public ReservedCustomers(RoomType resRoom, Activities[] resAct, String fName, String lName, String phoneNumber, Pet pet) {
        super(fName, lName, phoneNumber, pet);
        this.resRoom = resRoom;
        this.resAct = new Activities[5];
    }

    public Customers getCustomers(){
    return customers;
    }

    public RoomType getResRoom() {
        return resRoom;
    }

    public Activities[] getResAct() {
        return resAct;
    }
    @Override
    public String toString() {
        return "ReservedCustomers{" + "resRoom=" + resRoom + ", resAct=" + resAct + ", customers=" + customers + '}';
    }
    
    
}
