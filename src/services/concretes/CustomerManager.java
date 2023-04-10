package services.concretes;

import dataAccess.abstracts.CustomerDao;
import entities.Customer;
import entities.Employee;
import services.abstracts.CustomerService;

import java.util.List;

public class CustomerManager implements CustomerService {
    private final CustomerDao customerDao;

    public CustomerManager(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void addCustomer(Customer customer) {
        if (customer.getCustomerId() == ' ') {
            System.out.println("Müşteri Id Boş Olamaz!");
        } else {
            customerDao.addCustomer(customer);
        }
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customerDao.deleteCustomer(customer);
    }

    @Override
    public Customer updateCustomer(int id) {
        Customer customer = customerDao.updateCustomer(id);
        customer.setCustomerId(id);
        return customer;
    }
    @Override
    public List<Customer> getCustomer() {
        return customerDao.getCustomer();
    }

}
