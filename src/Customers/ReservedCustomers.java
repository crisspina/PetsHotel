
package Customers;

import Activities.Activities;
import CounterService.ReservedStatus;
import Room.RoomType;
import java.util.Scanner;

public class ReservedCustomers {
    private RoomType resRoom;
    private Activities resAct[];
    private int countAct;
    private final int numberOfActivities=6;
    private Customers customer;
    private ReservedStatus status;
    private int amount;

    public ReservedCustomers() {
    }

    public ReservedCustomers(RoomType resRoom, Customers customer) {
        this.resRoom = resRoom;
        this.customer = customer;
        setReservedActivities(); 
    }

    ReservedCustomers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setReservedActivities(){

        Scanner sn = new Scanner(System.in);
         int choice;
        do{
            System.out.println("Activities: ");
            System.out.println("\t 1. GROOMING");
            System.out.println("\t 2. PLAYTIME");
            System.out.println("\t 3. GARDEN");
            System.out.println("\t 4. EXERCISE");
            System.out.println("\t 5. MESSAGEANDSPA");
            System.out.println("\t 6. PHOTOSET");
            System.out.println("\t 7. CONFIRM");
            System.out.print("Enter your number activities: ");
            choice = sn.nextInt();
            switch (choice){
                case 1:
                    this.resAct[countAct++] = Activities.GROOMING;
                    break;
                case 2:
                    this.resAct[countAct++] = Activities.PLAYTIME;
                    break;
                case 3:
                    this.resAct[countAct++] = Activities.GARDEN;
                    break;
                case 4:
                    this.resAct[countAct++] = Activities.EXERCISE;
                    break;
                case 5:
                    this.resAct[countAct++] = Activities.MESSAGEANDSPA;
                    break;
                case 6:
                    this.resAct[countAct++] = Activities.PHOTOSET;
                    break;
                default : System.out.println("Enter a value between 1-7");
            }
        System.out.println("-------------------");
        System.out.println("Activities: " + resAct[countAct]);
     }
        while((countAct<=this.numberOfActivities)&&(choice!=7));
}
    public RoomType getResRoom() {
        return resRoom;
    }

    public Activities[] getResAct() {
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
    public String toString(){
        StringBuilder sb =new StringBuilder();
    sb.append("Customer: "+getCustomers());
    sb.append("\n");
    sb.append("reserved room: " +getResRoom());
    sb.append("\n");       
    sb.append("reserved activities");
        for (int i = 0; i <= countAct; i++) {
            sb.append(resAct[i]);
        }
    sb.append("\n");
    sb.append("amount due: " +getAmount());
    sb.append("status: " +getStatus());
    
    return sb.toString();
    }
 

  
}
