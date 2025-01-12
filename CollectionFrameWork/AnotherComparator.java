package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class CompareSalary implements Comparator<Employee>{
    @Override
    public int compare(Employee obj1 , Employee obj2){
       return Integer.compare(obj1.Emp_Salary,obj2.Emp_Salary);
    }
}

class CompareName implements Comparator<Employee>{
    @Override
    public int compare(Employee e1 , Employee e2){
        return e1.Emp_Name.compareTo(e2.Emp_Name);
    }
}

class Employee{
    String Emp_Name ;
    int Emp_Salary;
    Employee(String name , int salary) {
        this.Emp_Name = name;
        this.Emp_Salary = salary;
    }
    public String toString(){
        return "Employee : Name : "+Emp_Name+" and Salary: "+Emp_Salary+" \n";
    }
}

public class AnotherComparator {
    public static void main(String []args){
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("John",50000));
        employees.add(new Employee("Jack" , 34000));
        employees.add(new Employee("Joe",60000));
        employees.add(new Employee("Andrew",76000));
        employees.add(new Employee("Joe",49000));
        employees.add(new Employee("Leo",30000));

        employees.sort(new CompareSalary());
        System.out.println("Sorting based on Salary : ");
        System.out.println(employees);

        System.out.println("Sorting based on Name :");
        employees.sort(new CompareName());
        System.out.println(employees);
    }
}
