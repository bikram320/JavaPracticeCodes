package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstArrayList {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        ArrayList<String> StudentName   = new ArrayList<>();
        ArrayList<Integer> StudentMark = new ArrayList<>();
        for(int i =0 ; i<3 ; i++){
            System.out.println("Enter a Name of student :");
            StudentName.add(sc.nextLine());
            System.out.println("Enter a Mark of Student :");
            StudentMark.add(sc1.nextInt());
        }
        StudentMark.remove(1);
        StudentName.remove(1);
        StudentName.set(1,"John");
        StudentMark.set(1,100);
        for(int i = 0 ; i<StudentName.size(); i++){
            System.out.println("Name : "+StudentName.get(i)+" Mark : "+StudentMark.get(i));
        }
        System.out.println(StudentMark.indexOf(2));


    }
}
