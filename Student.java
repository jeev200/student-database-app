package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600; 
    private static int id = 1000;

    //Constructor: prompt user to enter student name and year
    public Student(){
        Scanner scanners = new Scanner(System.in);
        System.out.println("Enter the first name of the student");
        this.firstName = scanners.nextLine();
        System.out.println("Enter the Last name of the student");
        this.lastName = scanners.nextLine();
        System.out.println("1 - Fresher\n2 - Sophmore\n3-Junior\n4-Senior\nEnter the class level of the student");
        this.gradeYear = scanners.nextInt();
        
        setStudentID();
    }
    //Generate a ID
    public void setStudentID(){
        //GradeLevel+ID
        id++;
        this.studentID = gradeYear+""+id;

    }

    //Enroll in courses
      public void enroll(){
        //Get inside a loop, user hits Q
        do{
            System.out.println("Enroll the courses(or enter q to quit)");
            Scanner in = new Scanner(System.in);
            String course = in.next();
            if(!course.equals("q")){
                courses = courses + "\n"+course;
                tuitionBalance = tuitionBalance+costOfCourse;
            }
            else{
                break;
            }
        }while(1!=0);
      }
    //View balances
      public void viewBalance(){
        System.out.println("Your tuition Balance is $ "+tuitionBalance);
      }
    //pay tuition
      public void payTuition(){
        viewBalance();
        System.out.println("Enter the payment amount ");
        Scanner in = new Scanner(System.in);
        int payments = in.nextInt(); 
        tuitionBalance = tuitionBalance - payments;
        System.out.println("Your payment of $"+payments+" is done successfully");
        viewBalance();
      }
    //Show status
    public String showInfo(){
       String status = "Name : "+firstName+" "+lastName+
                       "\nGrade Level: "+gradeYear+
                       "\nCourses Enrolled : "+courses+
                       "\nStudentId : "+studentID+
                       "\nBalance : $"+tuitionBalance+"\n";
       return status;
    }
}