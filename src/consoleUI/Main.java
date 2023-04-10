package consoleUI;

import dataAccess.abstracts.CarDao;
import dataAccess.abstracts.CustomerDao;
import dataAccess.abstracts.EmployeeDao;
import dataAccess.concretes.InMemoryCarDao;
import dataAccess.concretes.InMemoryCustomerDao;
import dataAccess.concretes.InMemoryEmployeeDao;
import entities.Cars;
import entities.Customer;
import entities.Employee;
import services.abstracts.CarService;
import services.abstracts.CustomerService;
import services.abstracts.EmployeeService;
import services.concretes.CarManager;
import services.concretes.CustomerManager;
import services.concretes.EmployeeManager;

public class Main {
    public static void main(String[] args) {
        CustomerDao inMemoryCustomerDao = new InMemoryCustomerDao();
        EmployeeDao inMemoryEmployeeDao = new InMemoryEmployeeDao();
        CarDao inMemoryCarDao = new InMemoryCarDao();

        CustomerService customerService = new CustomerManager(inMemoryCustomerDao);
        EmployeeService employeeService = new EmployeeManager(inMemoryEmployeeDao);
        CarService carService = new CarManager(inMemoryCarDao);

        Customer customer1 = new Customer(1,"Ahmet","ÇALIK",27,"Male");
        Employee employee1 = new Employee(5,"Burak","DAĞ",33,"Male");
        Cars car1 = new Cars(1,"Honda","Civic",2022,"Diesel");
        Cars car2 = new Cars(2,"Tesla","Y",2018,"Electric");

        customerService.addCustomer(customer1);
        employeeService.addEmployee(employee1);
        carService.addCar(car1);
        carService.addCar(car2);
        //carService.deleteCar(car2);
/*      carService.updateCar(2).setBrand("Audi"); carService.updateCar(2).setModel("R8");
        carService.updateCar(2).setManufactureYear(2014); carService.updateCar(2).setMotorType("Gasoline");
*/
        for (Employee employee: employeeService.getEmployee()){
            System.out.println("Çalışan Bilgisi(Ad-Soyad): " + employee.getEmployeeFirstName()  + "-" + employee.getEmployeeLastName());
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Çalışanın Araç Kiraladığı Müşteriler: ");

            for (Customer customer: customerService.getCustomer()){
                System.out.println(customer.getCustomerId()  + "-" + customer.getCustomerFirstName()  + "-" + customer.getCustomerLastName()
                        + "-" + customer.getCustomerAge()  + "-" + customer.getCustomerGender());
            }
            System.out.println("-------------------------------------------------------------------------------");

            System.out.println("Kiralanmış Araçların Listesi: ");
            System.out.println("-------------------------------------------------------------------------------");
            for(Cars car: carService.getCars()){
                System.out.println(car.getBrand() + "-" + car.getModel() + "-" + car.getManufactureYear() + "-" + car.getMotorType());
            }
        }

    }
}