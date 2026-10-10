
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // read student name 
        // read marks for different subjects and store them in an array 
        //calculate total marks and percentage
        // print the result and grade based on the performance 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Students");
        int n = sc.nextInt();
        sc.nextLine();
        String[] subject = {"Hindi", "English", "Maths", "science", "computer"};
        int[][] marks = new int[n][subject.length];
        int[] total = new int[n];
        String grade;
        String[] names = new String[n];
        int overall=0;
        for (int j = 0; j < n; j++) {
            System.out.println("Enter student Name :");
            names[j] = sc.nextLine();
            for (int i = 0; i < subject.length; i++) {
                System.out.println("Enter marks in " + subject[i]);
                marks[j][i] = sc.nextInt();
                while (marks[j][i] < 0 || marks[j][i] > 100) {
                    System.out.println("Invalid marks!\n Enter marks again in " + subject[i]);
                    marks[j][i] = sc.nextInt();
                }
                total[j] += marks[j][i];
            }
            sc.nextLine();
        }
        for(int i =0;i<n;i++){
        double percentage = ((double) total[i] / (subject.length * 100)) * 100;
        //System.out.println(percentage);
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
        //Result Printing
        System.out.print("===============================\n");
        System.out.print("       Student Grade Report\n");
        System.out.print("===============================\n");
        System.out.println("Student Name : " + names[i] + "\n");
        System.out.print("-----------------------------------\n");
        System.out.print("Subjects                     Marks\n");
        System.out.print("-----------------------------------\n");
        int max=0;
        int min=100;
        for (int k = 0; k < subject.length; k++) {
            System.out.print(subject[k] + "                    " + marks[i][k] + "\n");
            if(marks[i][k]>max){
                max=marks[i][k];
            }
            if (marks[i][k]<min){
                min=marks[i][k];
            }
        }
        System.out.print("-----------------------------------\n");
        System.out.println("Total Marks            :" + total[i] + "\n");
        System.out.printf("Percentage               :%.2f%n" ,percentage);
        System.out.print("Grade                    :" + grade + "\n");
        System.out.print("Max.                     :" + max + "\n");
        System.out.print("Min.                   :" + min + "\n");
        System.out.println("===============================\n");
        overall+=total[i];
    }
     System.out.print("===============================\n");
     System.out.print("       Class Summary\n");
     System.out.println("Total Students            :" + n + "\n");
     System.out.print("class average:                    :" + (double)overall/n + "\n");

     System.out.print("===============================\n");
     System.out.print("       THANK YOU\n");
     System.out.print("===============================\n");
    sc.close();
    }
}
