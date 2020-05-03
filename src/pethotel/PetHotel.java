package pethotel;

import CounterService.HotelCounter;
import Customers.Pet;
import Customers.PetType;
import Customers.ReservedCustomers;
import Room.HotelRoom;
import Room.RoomType;
import java.util.ArrayList;
import java.util.Scanner;

public class PetHotel {

    private HotelRoom hr;
    private String name;
    private HotelCounter h;
    private static ArrayList<ReservedCustomers> custList;
  
    public PetHotel() {
        setHotelName();
    }

    public void setHotelName() {
        Scanner sc = new Scanner(System.in);
        String scString = sc.nextLine();
        this.name = scString;
    }

    public String getHotelName() {
        return name;
    }

    public HotelRoom getHr() {
        return hr;
    }

    public  ArrayList<ReservedCustomers> getResCust() {
        return custList;
    }

    public  void setResCust() {
       this.custList= new ArrayList();
    }
    
    public static void addCustomersList(ReservedCustomers resCust){
       custList.add(resCust);
       
    }
     @Override
    public String toString() {
        return "PetHotel{" + "hr=" + hr + ", name=" + name + ", h=" + h + /*+" ,rc" + rc*/ +'}';
    }

    
    }
