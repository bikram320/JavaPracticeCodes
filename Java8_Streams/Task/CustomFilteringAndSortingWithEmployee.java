package Java8_Streams.Task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Employee{
    private String name ;
    private Float salary;

    public Employee(String name , Float sal){
        this.name=name;
        this.salary=sal;
    }

    public String getName() {
        return name;
    }

    public Float getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", salary=" + salary ;
    }
}

public class CustomFilteringAndSortingWithEmployee {
    public static void main(String[] args) {
        /*
        this task is for a list of Employee objects, filter by salary > 25000 and sort by name.
         */
        List<Employee> employees = Arrays.asList(
                new Employee("Ram",20000f),
                new Employee("Shyam",40000f),
                new Employee("Hari",45000f),
                new Employee("Krishna",10000f),
                new Employee("Laxman",26000f)
        );
        System.out.println("Employee With More than 25000 Salary in Sorted As per their Name :");
       employees.stream()
                .filter(emp -> emp.getSalary() > 25000f)
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);

    }
}
