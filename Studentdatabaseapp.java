package studentdatabaseapp;

import java.util.Scanner;

public class Studentdatabaseapp {
    public static void main(String[] args){

        
        //Ask how many we want to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner scanners = new Scanner(System.in);
        int noOfStudents = scanners.nextInt();
        Student[] students = new Student[noOfStudents];

        //Create n number of new students
        for(int n=0;n<noOfStudents;n++){
            students[n]= new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].showInfo());
        }
        
    }
}
