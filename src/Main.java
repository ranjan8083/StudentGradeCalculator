
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        // Validate number of students
        do {
            System.out.print("Enter number of Students: ");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Number of students must be greater than 0.");
            }
        } while (n <= 0);

        sc.nextLine();

        String[] subject = {
            "Hindi", "English", "Maths", "Science", "Computer"
        };

        int[][] marks = new int[n][subject.length];
        int[] total = new int[n];
        String[] names = new String[n];

        // Input student details
        for (int j = 0; j < n; j++) {

            System.out.print("Enter student name: ");
            names[j] = sc.nextLine();

            for (int i = 0; i < subject.length; i++) {

                System.out.print("Enter marks in " + subject[i] + ": ");
                marks[j][i] = sc.nextInt();

                while (marks[j][i] < 0 || marks[j][i] > 100) {
                    System.out.println("Invalid marks! Enter marks between 0 and 100.");
                    marks[j][i] = sc.nextInt();
                }

                total[j] += marks[j][i];
            }

            sc.nextLine();
        }

        int overall = 0;
        int highestIndex = 0;
        int lowestIndex = 0;

        // Calculate class statistics
        for (int i = 0; i < n; i++) {

            overall += total[i];

            if (total[i] > total[highestIndex]) {
                highestIndex = i;
            }

            if (total[i] < total[lowestIndex]) {
                lowestIndex = i;
            }
        }

        // Display individual student reports
        for (int i = 0; i < n; i++) {

            double percentage =
                (double) total[i] / (subject.length * 100) * 100;

            String grade;

            if (percentage >= 90) {
                grade = "A+";
            } else if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B+";
            } else if (percentage >= 60) {
                grade = "B";
            } else if (percentage >= 50) {
                grade = "C+";
            } else if (percentage >= 40) {
                grade = "C";
            } else {
                grade = "FAIL";
            }

            int max = 0;
            int min = 100;

            System.out.println("\n=================================");
            System.out.println("       Student Grade Report");
            System.out.println("=================================");
            System.out.println("Student Name: " + names[i]);
            System.out.println("---------------------------------");
            System.out.printf("%-20s %s%n", "Subject", "Marks");
            System.out.println("---------------------------------");

            for (int k = 0; k < subject.length; k++) {

                System.out.printf("%-20s %d%n", subject[k], marks[i][k]);

                if (marks[i][k] > max) {
                    max = marks[i][k];
                }

                if (marks[i][k] < min) {
                    min = marks[i][k];
                }
            }

            System.out.println("---------------------------------");
            System.out.println("Total Marks : " + total[i]);
            System.out.printf("Percentage  : %.2f%%%n", percentage);
            System.out.println("Grade       : " + grade);
            System.out.println("Highest Subject Mark: " + max);
            System.out.println("Lowest Subject Mark : " + min);
            System.out.println("=================================");
        }

        // Calculate class averages
        double averageTotal = (double) overall / n;

        double averagePercentage =
            (double) overall / (n * subject.length * 100) * 100;

        // Class summary
        System.out.println("\n=================================");
        System.out.println("          CLASS SUMMARY");
        System.out.println("=================================");
        System.out.println("Total Students: " + n);

        System.out.printf("Average Total Marks: %.2f / %d%n",
            averageTotal, subject.length * 100);

        System.out.printf("Class Average Percentage: %.2f%%%n",
            averagePercentage);

        System.out.println("---------------------------------");
        System.out.println("Highest Scorer: " + names[highestIndex]);
        System.out.println("Highest Total : " + total[highestIndex]);

        System.out.println("---------------------------------");
        System.out.println("Lowest Scorer : " + names[lowestIndex]);
        System.out.println("Lowest Total  : " + total[lowestIndex]);

        System.out.println("=================================");
        System.out.println("           THANK YOU");
        System.out.println("=================================");

        sc.close();
    }
}
