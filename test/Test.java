
import Customers.Customers;
import Customers.Pet;
import Customers.PetType;
import Customers.ReservedCustomers;
import Room.HotelRoom;
import Room.RoomType;
import pethotel.PetHotel;


public class Test {
     
    public static void main(String[] args) {
        System.out.print("input your hotel name :");
        PetHotel h1 = new PetHotel();
        System.out.println(h1);

        System.out.println("---------------------");
        Pet p1 = new Pet("pretty", "12", PetType.DOG);
        Pet p2 = new Pet("obog","4",PetType.RABBIT);
        Customers c1 = new Customers("kiki", "phaeng", "0816903023", p1);
        Customers c2 = new Customers("park","chaeyong","0844078181",p2);
       
        
        System.out.println(c1);

        System.out.println("-----------------");
        System.out.println(p1);
        System.out.println("------------------");
        HotelRoom hr = new HotelRoom();
        System.out.println(hr);

    }
}
