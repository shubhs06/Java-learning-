package FunctionalProgarming.Employees;

import java.util.List;

public class TestingEmployee {
    public static void main(String[] args) {
        List <Employee> employees = List.of(
            new Employee("Shubham", 1000000),
            new Employee("sham", 14000),
            new Employee("anand", 15000),
            new Employee("ram", 10000000),
            new Employee("abhi", 10004)
        );

        employees.stream()
            .sorted((emp1 , emp2) -> Integer.compare(emp1.getSalary(),emp2.getSalary()))
            .forEach(System.out::println);
    }
}
