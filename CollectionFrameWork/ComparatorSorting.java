package DailyTask;
/*
 let assume there is a system which accept a different data like
 (Name , Age , Salary ) sort the Data based on all factor
 of input
 */

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

class SortBasedOnSalary implements Comparator<Employee>{

    @Override
    public int compare(Employee obj1, Employee obj2) {
        return Integer.compare(obj2.Emp_Salary, obj1.Emp_Salary);
    }
}

class SortBasedOnAge implements Comparator<Employee>{

    @Override
    public int compare(Employee obj, Employee obj1) {
        return Integer.compare(obj1.Emp_Age, obj.Emp_Age);
    }
}

class SortBasedOnName implements Comparator<Employee>{

    @Override
    public int compare( Employee obj,Employee obj1) {
        return obj.Emp_Name.compareTo(obj1.Emp_Name);
    }
}

class Employee {
    public  String Emp_Name ;
    public int Emp_Age;
    public int Emp_Salary;

    Employee(String name , int age , int salary){
        this.Emp_Name= name ;
        this.Emp_Age=age;
        this.Emp_Salary = salary;
    }

    public String toString(){
        return "\nName : "+Emp_Name+" Age : "+Emp_Age+" Salary: "+Emp_Salary+" ";
    }
}


public class ComparatorSorting {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a number of Employees to Sort : ");
        int n = sc.nextInt();

        List<Employee> employees = new ArrayList<>(n);

        for(int i = 0 ; i<n; i++){
            System.out.println("Enter a Data of Employee "+(i+1)+" :");

            System.out.println("Enter a Name of Employee : ");
            String name = sc1.nextLine();

            System.out.println("Enter a Age of Employee : ");
            int age = sc.nextInt();

            System.out.println("Enter a Salary of Employee : ");
            int salary = sc.nextInt();

            employees.add(new Employee(name , age ,salary));
        }
        System.out.println("Employee List Based on Alphabetical Order : ");
        employees.sort(new SortBasedOnName());
        System.out.println(employees);

        System.out.println("Employee List Based on Age : ");
        employees.sort(new SortBasedOnAge());
        System.out.println(employees);

        System.out.println("Employee List Based on Salary : ");
        employees.sort(new SortBasedOnSalary());
        System.out.println(employees);



    }
}
