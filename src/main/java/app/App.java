package app;

import model.Employee;
import repository.EmplyRepo;
import service.Position;
import java.util.ArrayList;
import java.util.List;

import static service.Position.DEVELOPER;

public class App {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        EmplyRepo emplyRepo = new EmplyRepo(employeeList);

        Employee employee1 = new Employee("Kawtar", 1L, 3000.0, DEVELOPER);
        Employee employee2 = new Employee("Houda", 3L, 3000.0, DEVELOPER);
        Employee employee3 = new Employee("Firdaous", 2L, 5000.0, Position.MANAGER);
        Employee employee4 = new Employee("Ayman", 4L, 70000.0, Position.ADMINISTRATION);
        Employee employee5 = new Employee("Achraf", 7L, 70000.0, Position.ADMINISTRATION);

        emplyRepo.addEmpl(employee1);
        emplyRepo.addEmpl(employee2);
        emplyRepo.addEmpl(employee3);
        emplyRepo.addEmpl(employee4);
        emplyRepo.addEmpl(employee5);

        System.out.println(employeeList);
        System.out.println(emplyRepo.findEmployeeById(2l));
        System.out.println( emplyRepo.getEmployeesAboveSalaryThreshold(5000.0));

        Double salary = employee5.calculateSalary(DEVELOPER);
        System.out.println(salary);
    }
}
