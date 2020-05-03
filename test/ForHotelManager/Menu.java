
package ForHotelManager;

import java.util.Scanner;
import pethotel.PetHotel;

public class Menu {
    
    public static void createHotel(){
        System.out.println("------For Manager------");
        Scanner sc = new Scanner(System.in);
        System.out.print("input your hotel name: ");
        String hotelName = sc.nextLine();
    PetHotel h1 = new PetHotel(hotelName);
        System.out.println(h1);
}
}
