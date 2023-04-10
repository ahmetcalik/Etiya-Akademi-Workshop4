package services.concretes;

import dataAccess.abstracts.EmployeeDao;
import entities.Employee;
import services.abstracts.EmployeeService;

import java.util.List;

public class EmployeeManager implements EmployeeService {
    private final EmployeeDao employeeDao;

    public EmployeeManager(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public void addEmployee(Employee employee) {
        if (employee.getEmployeeId() == ' ') {
            System.out.println("Çalışan Id Boş Olamaz!");
        } else {
            employeeDao.addEmployee(employee);
        }
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeDao.deleteEmployee(employee);
    }

    @Override
    public Employee updateEmployee(int id) {
        Employee employee = employeeDao.updateEmployee(id);
        employee.setEmployeeId(id);
        return employee;
    }
    @Override
    public List<Employee> getEmployee() {
        return employeeDao.getEmployee();
    }
}
