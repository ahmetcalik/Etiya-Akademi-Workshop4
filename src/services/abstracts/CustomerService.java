package services.abstracts;

import entities.Customer;
import java.util.List;

public interface CustomerService {
    void addCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    Customer updateCustomer(int id);
    List<Customer> getCustomer();
}
