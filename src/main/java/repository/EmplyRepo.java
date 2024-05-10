package repository;

import model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmplyRepo {

    private List<Employee> employeeList;

    public EmplyRepo(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void addEmpl(Employee employee) {
        employeeList.add(employee);
    }

    public Optional<Employee> findEmployeeById(double id) {
        Optional<Employee> employee = employeeList.stream().filter(e -> e.getId() == id).findFirst();
        return employee;
    }

    public List<Employee> getEmployeesAboveSalaryThreshold(double threshhold) {

        List<Employee> employees = employeeList.stream()
                .filter(employee -> (employee.getSalary().compareTo(threshhold) >= 0))
                .collect(Collectors.toList());
        return employees;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}