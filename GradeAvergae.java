//Luke Eapen
//2/27/2025
//GradeAverage

import java.util.*;
public class GradeAvergae {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a grade");
    int grade1;
    int grade2;
    int grade3;
    int grade4;
    int grade5;
    double average;


    grade1 = input.nextInt();
    System.out.println("Enter a grade");
    grade2 = input.nextInt();
    System.out.println("Enter a grade");
    grade3 = input.nextInt();
    System.out.println("Enter a grade");
    grade4 = input.nextInt();
    System.out.println("Enter a grade");
    grade5 = input.nextInt();
    System.out.println("Enter a grade");

    average = (grade1+grade2+grade3+grade4+grade5)/5.0;
    System.out.println("The grade average is" + (grade1+grade2+grade3+grade4+grade5)/5.0);

    }
}