import java.util.Scanner;

public class StudentsMarks_Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of the Student: ");
        String Name=sc.nextLine();
        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for Subject " + i + " (0-100): ");
            int marks = sc.nextInt();

            while (marks < 0 || marks > 100) {
                System.out.print("Invalid marks! Please enter a value between 0 and 100: ");
                marks = sc.nextInt();
            }

            total += marks;
        }

        double average = (double) total / subjects;
        double percentage = (total / (subjects * 100.0)) * 100;

        System.out.println("\n----- Student Performance Summary -----");
        System.out.println("Name Of Student    : " + Name);
        System.out.println("Total Marks     : " + total);
        System.out.println("Average Marks   : " + String.format("%.2f", average));
        System.out.println("Percentage      : " + String.format("%.2f", percentage) + "%");

        System.out.print("Grade           : ");
        if (percentage >= 90) {
            System.out.println("A+");
        } else if (percentage >= 75) {
            System.out.println("A");
        } else if (percentage >= 60) {
            System.out.println("B");
        } else if (percentage >= 40) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}

