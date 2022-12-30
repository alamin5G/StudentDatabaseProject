package Database;

import java.util.Scanner;

public class StuduentDatabase {
    public static void main(String[] args) {

        //Ask how many new users we want?
        System.out.println("Enter number of new Students to enroll: ");
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        Student[] students = new Student[numberOfStudents];

        // Create n number of new students

        for (int n = 0; n < numberOfStudents; n++) {
            System.out.println("Student - " + (n+1) + ": ");
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuitionFee();
        }

        for (int i = 0; i <numberOfStudents; i++) {
            String info = students[i].showInfo();
            System.out.println("Info of Student-"+(i+1)+"\n"+info);
            System.out.println("");
        }

    }
}