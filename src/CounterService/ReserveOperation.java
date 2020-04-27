
package CounterService;

import Customers.ReservedCustomers;

public interface ReserveOperation {
public void reserved(ReservedCustomers c);
public void cancelled(ReservedCustomers c);
public int search(ReservedCustomers c);
public ReservedStatus setStatus(checkIsFull());
}
