package pethotel;

import CounterService.HotelCounter;
import Customers.ReservedCustomers;
import Room.HotelRoom;
import java.util.ArrayList;
import java.util.Scanner;

public class PetHotel {

    private HotelRoom hr;
    private String name;
    private HotelCounter h;
    private ReservedCustomers[] rc; //อยากทำให้เป็นarray list

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

    @Override
    public String toString() {
        return "PetHotel{" + "hr=" + hr + ", name=" + name + ", h=" + h + /*+" ,rc" + rc*/ +'}';
    }

    public ArrayList<ReservedCustomers> getReservedHistory() {
        ArrayList<ReservedCustomers> resCus = new ArrayList();
        resCus.add(new ReservedCustomers());
        
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

