package Room;

import Customers.Customers;
import Customers.ReservedCustomers;
import java.util.Iterator;

public class HotelRoom implements Comparable<ReservedCustomers> {

    private Room[] dRooms;
    private Room[] supRooms;
    private Room[] stdRooms;
    private int countDe, countStd, countSup;
    private RoomType roomType;

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

    public RoomType getRoomType() {
        return roomType;
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

    public void setCountDe() {
        this.countDe = countDe++;
    }

    public void setCountStd() {
        this.countStd = countStd++;
    }

    public void setCountSup() {
        this.countSup = countSup++;
    }

    @Override
    public int compareTo(ReservedCustomers o) {
        switch (o.getResRoom()) {
            case DELUXE:
                for (int i = 0; i < countDe; i++) {
                    if (dRooms[i].getRc().getfName().equals(o.getCustomers().getfName())
                            && dRooms[i].getRc().getlName().equals(o.getCustomers().getlName())) {
                        return 1;
                    }
                    System.out.println("CUSTOMERS DID NOT RESERVED");
                    return -1;
                }
            case SUPERIOR:
                for (int i = 0; i < countDe; i++) {
                    if (supRooms[i].getRc().getfName().equals(o.getCustomers().getfName())
                            && supRooms[i].getRc().getlName().equals(o.getCustomers().getlName())) {
                        return 1;
                    }
                    System.out.println("CUSTOMERS DID NOT RESERVED");
                    return -1;
                }
        }
        return -1;
    }

}


