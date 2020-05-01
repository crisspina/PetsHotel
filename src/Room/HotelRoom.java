package Room;

import Customers.Customers;
import Customers.ReservedCustomers;
import java.util.Iterator;

public class HotelRoom{

    private Room[] dRooms;
    private Room[] supRooms;
    private Room[] stdRooms;
    private int countDe, countStd, countSup;
  

    public HotelRoom() {
        createRoom();
        createRoomrunningNumber();
    }

    public void createRoom() {
        this.dRooms = new Room[RoomInformation.MAX_DELUXE];
        this.stdRooms = new Room[RoomInformation.MAX_STANDARD];
        this.supRooms = new Room[RoomInformation.MAX_SUPERIOR];
    }

    public void createRoomrunningNumber() {
        for (int i = 0; i < supRooms.length; i++) {
            supRooms[i] = new Room("Sup" + (i + 1), RoomType.SUPERIOR);
        }
        for (int i = 0; i < dRooms.length; i++) {
            dRooms[i] = new Room("De" + (i + 1), RoomType.DELUXE);
        }
        for (int i = 0; i < stdRooms.length; i++) {
            stdRooms[i] = new Room("Std" + (i + 1), RoomType.STANDARD);
        }

    }

    
    public Room getdRooms(int index) {
        return dRooms[index];
    }

    public Room getSupRooms(int index) {
        return supRooms[index];
    }

    public Room getStdRooms(int index) {
        return stdRooms[index];
    }

    public void setdRoom(int index, ReservedCustomers c) {
        this.dRooms[index].setRc(c);
    }

    public void setSupRoom(int index, ReservedCustomers c) {
        this.supRooms[index].setRc(c);
    }

    public void setStdRoom(int index, ReservedCustomers c) {
        this.stdRooms[index].setRc(c);
    }

    public int getDRoomLength() {
        return this.dRooms.length;
    }

    public int getStdRoomLength() {
        return this.stdRooms.length;
    }

    public int getSupRoomLength() {
        return this.supRooms.length;
    }

    public int getCountDe() {
        return countDe;
    }

    public int getCountStd() {
        return countStd;
    }

    public int getCountSup() {
        return countSup;
    }

    public void addCountDe() {
        this.countDe = countDe++;
    }

    public void addCountStd() {
        this.countStd = countStd++;
    }

    public void addCountSup() {
        this.countSup = countSup++;
    }

    public void minusCountDe() {
        this.countDe = countDe--;
    }

    public void minusCountStd() {
        this.countStd = countStd--;
    }

    public void minusCountSup() {
        this.countSup = countSup--;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hotle Room");
        sb.append("\n");
        sb.append("We have " + RoomInformation.MAX_DELUXE + " rooms");
        sb.append("\n");
        sb.append("There are: ");
        for (int i = 0; i < dRooms.length; i++) {
            sb.append(dRooms[i].toString());
        }
        sb.append("\n");
        sb.append("We have " + RoomInformation.MAX_SUPERIOR + " rooms");
         sb.append("\n");
         for (int i = 0; i < supRooms.length; i++) {
            sb.append(supRooms[i].toString());
        }
        sb.append("\n"); 
        sb.append("There are: ");
        for (int i = 0; i < supRooms.length; i++) {
            sb.append(supRooms[i].toString());
        }
        sb.append("\n");
        sb.append("We have " + RoomInformation.MAX_STANDARD + " rooms");
        sb.append("\n");
        sb.append("There are: ");
        for (int i = 0; i < stdRooms.length; i++) {
            sb.append(stdRooms[i].toString());
        }
        sb.append("\n");
        return sb.toString();
    }

}

