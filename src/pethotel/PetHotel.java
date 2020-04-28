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
    private ArrayList<ReservedCustomers> resCus; 

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
    
    public static ArrayList<ReservedCustomers> recievedCustomer(){
     ArrayList<ReservedCustomers> resCus = new ArrayList<ReservedCustomers>();
     resCus.add(new ReservedCustomers(RoomType.DELUXE,Customers("oh","sehun","0711111111",Pet("vivi","6",PetType.DOG))));   
     resCus.add(new ReservedCustomers(RoomType.DELUXE,Customers("prince","tae","0855555555",Pet("zara","2",PetType.DOG))));
        for (ReservedCustomer : resCus )
     return resCus;
    }
    //อิหยังวะ งงมากๆ เเล้วpetทำไมแดง

    public static void getReservedHistory(recievedCustomer c){
       this.resCus=recievedCustomer();
      
    }
    
    //อันนี้ก็แปลก เเบบจะเอาอาเรย์ลิสจากเมทตอทข้างบนมาเท่ากับอันข้างล่าง อ่อตอนเเรกจะเอาให้มันปริ้นออกมาใช้for each loopเเต่เชื่อมดาต้าเบสมะๆๆๆ งงๆๆๆๆ 
     @Override
    public String toString() {
        return "PetHotel{" + "hr=" + hr + ", name=" + name + ", h=" + h + /*+" ,rc" + rc*/ +'}';
    }

    
    }


//     @Override
//    public ArrayList<Payment> getAllPayment() {
//        ArrayList<Payment> allPayment = new ArrayList();
//        try (PreparedStatement pstmt = conn.prepareStatement(SQL_GET_ALL_PAYMENT);
//                ResultSet rs = pstmt.executeQuery()) {
//            while (rs.next()) {
//                Payment payment = new Payment();
//                payment.setPaymentID(rs.getInt(1));
//                payment.setCustomerID(rs.getInt(2));
//                payment.setPaymentDate(rs.getString(3));
//                payment.setAmount(rs.getDouble(4));
//                payment.setBookedHouseID(rs.getInt(5));
//                allPayment.add(payment);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(PaymentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return allPayment;
//    }

