package dataAccess.concretes;

import dataAccess.abstracts.EmployeeDao;
import entities.Employee;
import java.util.ArrayList;
import java.util.List;

public class InMemoryEmployeeDao implements EmployeeDao {

    List<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public Employee updateEmployee(int id) {
        return employees.stream().filter(employee -> employee.getEmployeeId() == id)
                .findFirst().orElseThrow();
    }

    @Override
    public List<Employee> getEmployee() {
        return employees;
    }

}
