// Create array of object of class Student_Detail with attributes Enrollment_no, Name, Sem, CPI for 5 
// students, scan their information and print it

import java.util.Scanner;

public class Student_Detail {
    public static int c = 1;
    int enrollment_no;
    String name;
    int sem;
    double cpi;

    public Student_Detail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details for student " + c);
        System.out.println("Enter enrollment number ");
        enrollment_no = sc.nextInt();
        System.out.println("Enter name ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.println("Enter semester ");
        sem = sc.nextInt();
        System.out.println("Enter cpi");
        cpi = sc.nextFloat();
        c++;
        System.out.println("====================");

    }

    public void displayDetails() {
        System.out.println("Name " + name);
        System.out.println("enrollment_no " + enrollment_no);
        System.out.println("semester " + sem);
        System.out.println("cpi " + cpi);
    }

    public static void main(String[] args) {
        Student_Detail[] student = new Student_Detail[5];
        for (int i = 0; i < 5; i++) {
            student[i] = new Student_Detail();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Details of student " + i + 1);
            student[i].displayDetails();
            System.out.println("====================");
        }
    }
}