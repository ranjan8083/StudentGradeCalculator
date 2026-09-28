import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // read student name 
        // read marks for different subjects and store them in an array 
        //calculate total marks and percentage
        // print the result and grade based on the performance 
        Scanner sc = new Scanner(System.in);
        String [] subject = {"Hindi","English","Maths","science","computer"};
        int [] marks = new int[subject.length];
        int total=0;
        String grade;
        System.out.println("Enter student Name :");
        String name = sc.nextLine();
        for(int i =0;i<subject.length;i++){
            System.out.println("Enter marks in "+subject[i]);
            marks[i]=sc.nextInt();
            total+=marks[i];
        }
        double percentage = ((double) total/(subject.length*100))*100;
        System.out.println(percentage);
        if(percentage>=90){
            grade="A+";
        }
        else if(percentage>=80){
            grade="A";
        }
        else if (percentage >=70){
            grade="B+";
        }
        else if (percentage >=60){
            grade="B";
        }
        else if(percentage>= 50){
            grade="C+";
        }
        else if(percentage>=40){
            grade="C";
        }
        else{
            grade="FAIL";
        }
        //Result Printing
        System.out.print("===============================\n");
        System.out.print("       Student Grade Report\n");
        System.out.print("===============================\n");
        System.out.println("Student Name : "+name+"\n");
        System.out.print("-----------------------------------\n");
        System.out.print("Subjects                     Marks\n");
        System.out.print("-----------------------------------\n");
        for(int i =0;i<subject.length;i++){
            System.out.print(subject[i]+"                    "+marks[i]+"\n");
        }
        System.out.print("-----------------------------------\n");
        System.out.println("Total Marks            :"+total+"\n");
        System.out.print("Percentage               :"+percentage+"\n");
        System.out.print("Grade                    :"+grade +"\n");
         System.out.println("===============================\n");
        System.out.print("       THANK YOU\n");
        System.out.print("===============================\n");
        sc.close();

    } 
}
