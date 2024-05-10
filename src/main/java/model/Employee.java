package model;

import service.Payable;
import service.Position;

import java.util.Objects;

import static serviceImpl.EmplService.salaryCalculation;


public class Employee implements Payable {
    private String name;
    private Long id;
    private Double salary;
    private Enum<Position> position;

    public Employee(String name, Long id, Double salary, Enum<Position> position) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.position=  position;

    }

    @Override
    public double calculateSalary(Enum<Position> position) {
        return salaryCalculation(position);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Enum<Position> getPosition() {
        return position;
    }

    public void setPosition(Enum<Position> position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", position=" + position ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(id, employee.id) && Objects.equals(salary, employee.salary) && Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, salary, position);
    }
}
