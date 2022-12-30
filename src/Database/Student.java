package Database;

import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String  studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private final int costOfCourse = 600;
    private static int id = 1000;


    //Constructor : prompts user to enter student name and years
    public Student(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Student first name: ");
        this.firstName = input.nextLine();
        System.out.println("Enter Student Last name: ");
        this.lastName = input.nextLine();
        System.out.println("Enter  Student Year:\n 1 - Freshmen\n 2 - Sophmore \n 3 - Junior \n4 - Senior. ");
        this.gradeYear = input.nextInt();


        setStudentID();

    }

    //Generate an ID

    private void setStudentID(){
        //Grade Level + ID
        id++;
        this.studentID =  gradeYear +  "" + id;
    }

    // Enroll in courses
    public void enroll(){
        //Get inside a loop, user hits 0;
        do{
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner input = new Scanner(System.in);
            String course = input.nextLine();
            if (!course.equalsIgnoreCase("Q")){
                courses = courses + " \n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }else {
                break;
            }
        }while (1 != 0);
        System.out.println("Enrolled in : " + courses);
        System.out.println("Your Current Due Tuition Fee is: " + tuitionBalance);
    }

    // View balance
    public void viewBalance(){
        System.out.println("Your due balance is : $" + tuitionBalance);

    }

    // Pay tuition
    public void payTuitionFee(){
        System.out.println("Enter your payment: ");
        Scanner input = new Scanner(System.in);
        int payment = input.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
    }


    // Show status
    public String showInfo(){
        return "ID: "+studentID+"\nName : " + firstName + " " + lastName + "\nGrade Year: " + gradeYear + "\nCourse Enrolled: " + courses
                + "\nDue Balance: $" + tuitionBalance;
    }
}
