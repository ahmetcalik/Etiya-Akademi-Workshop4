package dataAccess.abstracts;

import entities.Employee;
import java.util.List;

public interface EmployeeDao {
    void addEmployee(Employee employee);

    void deleteEmployee(Employee employee);
    Employee updateEmployee(int id);
    List<Employee> getEmployee();
}
