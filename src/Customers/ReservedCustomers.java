package Customers;

import Activities.Activities;
import CounterService.ReservedStatus;
import Room.RoomType;
import java.util.Scanner;

public class ReservedCustomers {

    private RoomType resRoom;
    private Activities resAct[];
    private int countAct;
    private final int numberOfActivities = 6;
    private Customers customer;
    private ReservedStatus status;
    private int amount;

    public ReservedCustomers() {

    }

    public ReservedCustomers(RoomType resRoom, Customers customer) {
        this.resRoom = resRoom;
        this.customer = customer;
    }

    public RoomType getResRoom() {
        return resRoom;
    }

    public Activities[] getResAct() {
        return resAct;
    }

    public Customers getCustomers() {
        return customer;
    }

    public ReservedStatus getStatus() {
        return status;
    }

    public void setStatus(ReservedStatus rs) {
        this.status = rs;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer: " + getCustomers());
        sb.append("\n");
        sb.append("reserved room: " + getResRoom());
        sb.append("\n");
        sb.append("reserved activities");
        for (int i = 0; i <= countAct; i++) {
            sb.append(resAct[i]);
        }
        sb.append("\n");
        sb.append("amount due: " + getAmount());
        sb.append("status: " + getStatus());

        return sb.toString();
    }

}
