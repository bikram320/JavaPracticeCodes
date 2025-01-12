package CollectionFrameWork;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Student implements Comparable<Student>{
    public String Stu_Name ;
    public int Stu_Age;
    Student(String name , int age){
        this.Stu_Name = name;
        this.Stu_Age = age;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.Stu_Age,o.Stu_Age);
    }
    @Override
    public String toString(){
        return "Student : Name :"+Stu_Name+" Age: "+Stu_Age+" \n";
    }
}

public class ComparableInJava {
    public static void main(String[]args){

        List<Student> students = new ArrayList<>();
        students.add(new Student("Albert" , 18));
        students.add(new Student("Issac" , 19));
        students.add(new Student("Thomas" , 17));
        students.add(new Student("Vinci" , 20));
        students.add(new Student("Stephen" , 16));

        Collections.sort(students);

        System.out.println(students);
    }
}
