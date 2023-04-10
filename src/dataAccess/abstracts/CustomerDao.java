package dataAccess.abstracts;

import entities.Customer;
import java.util.List;

public interface CustomerDao {
    void addCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    Customer updateCustomer(int id);
    List<Customer> getCustomer();
}
