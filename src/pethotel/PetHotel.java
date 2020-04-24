package pethotel;
//import Room.Deluxe;

import CounterService.HotelCounter;
import Room.RoomType;

import Customers.ReservedCustomers;
import Room.HotelRoom;
import Room.Room;
import Room.RoomInformation;
import java.util.Scanner;

public class PetHotel {


    private HotelRoom hr;
    private String name;
    private HotelCounter h;
    private ReservedCustomers[] rc;

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

    public ReservedCustomers[] getRc() {
        return rc;
    }

    
    @Override
    public String toString() {
        return "PetHotel{" + "hr=" + hr + ", name=" + name + ", h=" + h + ", rc=" + rc + '}';
    }

   
    }

 


