
package Customers;

import Activities.Activities;
import Room.RoomType;

public class ReservedCustomers  {
    private RoomType resRoom;
    private Activities resAct[];
    private final int numberOfActivities=6;
    private Customers customer;

    public ReservedCustomers(RoomType resRoom, Customers customer) {
        this.resRoom = resRoom;
        this.customer = customer;
        setReservedActivities(); 
    }
    
    public void setReservedActivities(){
        this.resAct= new Activities[this.numberOfActivities];
        /*resAct[1]=Activities.EXERCISE;
        resAct[2]=Activities.MESSAGEANDSPA;
        กิ๊ฟมาทำ*/
    }
 
    public RoomType getResRoom() {
        return resRoom;
    }

    public Activities[] getResAct() {
        for(Activities resActs: resAct)
            System.out.println(resActs);
        return resAct;
    }

    public Customers getCustomers() {
        return customer;
    }
    
    
    
    @Override
    public String toString() {
        return "ReservedCustomers{" + "resRoom=" + getResRoom() + "resAct =" + getResAct() + ", customers=" + getCustomers() + '}';
    }
    
    
}
