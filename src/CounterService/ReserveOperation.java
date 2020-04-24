
package CounterService;

import Customers.ReservedCustomers;
import Room.HotelRoom;

public interface ReserveOperation {
public void addPet(ReservedCustomers c);

public void deletePet(ReservedCustomers c);
public int searchPet(ReservedCustomers c);
}
