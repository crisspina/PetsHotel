
package Customers;

import Activities.Activities;
import CounterService.ReservedStatus;
import Room.RoomType;
import java.util.Scanner;

public class ReservedCustomers  {
    private RoomType resRoom;
    private Activities resAct;
    private final int numberOfActivities=6;
    private Customers customer;
    private ReservedStatus status;
    private int amount;

    public ReservedCustomers(){
        
    }
    public ReservedCustomers(RoomType resRoom, Customers customer) {
        this.resRoom = resRoom;
        this.customer = customer;
        setReservedActivities(); 
    }
    
    public void setReservedActivities(){
        Scanner sn = new Scanner(System.in);
        
        int choice;
            System.out.println("Activities: ");
            System.out.println("\t 1. GROOMING");
            System.out.println("\t 2. PLAYTIME");
            System.out.println("\t 3. GARDEN");
            System.out.println("\t 4. EXERCISE");
            System.out.println("\t 5. MESSAGEANDSPA");
            System.out.println("\t 6. PHOTOSET");
            System.out.print("Enter your number activities: ");
            choice = sn.nextInt();
            switch (choice){
                case 1:
                    resAct = Activities.GROOMING;
                    break;
                case 2:
                    resAct = Activities.PLAYTIME;
                    break;
                case 3:
                    resAct = Activities.GARDEN;
                    break;
                case 4:
                    resAct = Activities.EXERCISE;
                    break;
                case 5:
                    resAct = Activities.MESSAGEANDSPA;
                    break;
                case 6:
                    resAct = Activities.PHOTOSET;
                    break;
            }
        System.out.println("-------------------");
        System.out.println("Activities: " + resAct);
    }
 
    public RoomType getResRoom() {
        return resRoom;
    }

    public Activities[] getResAct() {
        return null;
//        for(Activities resActs: resAct)
//            System.out.println(resActs);
//        return resAct;
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
