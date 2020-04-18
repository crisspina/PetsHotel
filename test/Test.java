
import Customers.Customers;
import Customers.Pet;
import Customers.PetType;
import pethotel.PetHotel;


public class Test {
     
    public static void main(String[] args) {
        System.out.print("input your hotel name :");
        PetHotel h1 = new PetHotel();
        System.out.println(h1);

        System.out.println("---------------------");
        Pet p1 = new Pet("pretty", "12", PetType.DOG);
        Customers c1 = new Customers("kiki", "phaeng", "0816903023", p1);

        System.out.println(c1);

        System.out.println("-----------------");

        PetHotel hotel = new PetHotel();
        System.out.println(p1);

    }
}
