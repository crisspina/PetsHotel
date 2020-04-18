package pethotel;
//import Room.Deluxe;

import CounterService.HotelCounter;
import Room.RoomType;
//import Room.Superior;
//import Room.Standard;
import Customers.Customers;
import Customers.Pet;
import Customers.PetType;
import Room.Room;
import Room.RoomInformation;
import java.util.Scanner;

public class PetHotel extends Room {

    private Room stdRooms[];
    private Room supRooms[];
    private Room dRooms[];
    private RoomType rType;
    private Room runningRoomNumber;
    private String name;
    private HotelCounter h;
    //private counterService counter;

    public PetHotel() {
        createRoom();
        createRoomrunningNumber();
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

    public void createRoom() {

        this.dRooms = new Room[RoomInformation.MAX_DELUXE];
        this.stdRooms = new Room[RoomInformation.MAX_STANDARD];
        this.supRooms = new Room[RoomInformation.MAX_SUPERIOR];
        

    }

    public void createRoomrunningNumber() {
        for (int i = 0; i < supRooms.length; i++) {
            supRooms[i] = new Room("Sup" + (i + 1)) {};
        }
        for (int i = 0; i < dRooms.length; i++) {
            dRooms[i] = new Room("De" + (i + 1)) {};
        }
        for (int i = 0; i < stdRooms.length; i++) {
            stdRooms[i] = new Room("Std" + (i + 1)) {} ;
        }

    }

    @Override
    public String toString() {
        return "HotelName : " + getHotelName() + "\n" + " We have "
                + dRooms.length + " delux rooms, " + supRooms.length + " superior rooms and "
                + stdRooms.length + " standard rooms";
    }

 

}
