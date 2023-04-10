package services.abstracts;

import entities.Cars;
import entities.Employee;

import java.util.List;

public interface EmployeeService {

    void addEmployee(Employee employee);

    void deleteEmployee(Employee employee);

    Employee updateEmployee(int id);

    List<Employee> getEmployee();

}
