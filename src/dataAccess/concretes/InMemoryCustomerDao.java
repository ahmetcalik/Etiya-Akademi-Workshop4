package dataAccess.concretes;

import dataAccess.abstracts.CustomerDao;
import entities.Customer;

import java.util.ArrayList;
import java.util.List;

public class InMemoryCustomerDao implements CustomerDao {

    List<Customer> customers = new ArrayList<>();
    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }


    @Override
    public void deleteCustomer(Customer customer) {
        customers.remove(customer);
    }

    @Override
    public Customer updateCustomer(int id) {
        return customers.stream().filter(customer -> customer.getCustomerId() == id)
                .findFirst().orElseThrow();
    }

    @Override
    public List<Customer> getCustomer() {
        return customers;
    }
}
