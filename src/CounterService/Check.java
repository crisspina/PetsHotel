
package CounterService;

import Customers.ReservedCustomers;


public interface Check{
    
    public boolean checkReserveHistory(ReservedCustomers c);
    public boolean checkIsFull(ReservedCustomers c);
   
    
}
