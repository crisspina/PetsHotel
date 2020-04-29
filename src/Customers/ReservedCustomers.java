
package Customers;

import Activities.Activities;
import CounterService.ReservedStatus;
import Room.RoomType;

public class ReservedCustomers  {
    private RoomType resRoom;
    private Activities resAct[];
    private final int numberOfActivities=6;
    private Customers customer;
    private ReservedStatus status;
    private int amount;

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

    public ReservedStatus getStatus() {
        return status;
    }
    
    public void setStatus(ReservedStatus rs){
            this.status=rs;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
    
    @Override
    public String toString() {
        return "ReservedCustomers{" + "resRoom=" + getResRoom() + ", resAct=" + getResAct() + ", customer=" + getCustomers() + ", status=" + getStatus() +"amount money" + getAmount()+ '}';
    }
    
    
}
