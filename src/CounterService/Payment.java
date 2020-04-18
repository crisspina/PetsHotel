
package CounterService;
import  Activities.ActivitiesFee;

public interface Payment extends ActivitiesFee {
    public int checkBill();
    public void printSlip();
}
