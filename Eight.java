//Luke Eapen
//3/3/26

import java.util.*;
public class Eight {
    
    public static void main(String[]args){

    int number1;
    int number2;
    int answer1;
    int answer2;
   
    
    Scanner input = new Scanner ( System.in);

    System.out.println("Put this in number 1");
    number1 = input.nextInt();
    System.out.println("Put this in number 2");
    number2 = input.nextInt();
     
    answer1 = number1/number2;
    answer2 = number1 % number2;

    System.out.println(number1 + "/" + number2 + "=" + answer1);
    System.out.println(number1 + "%" + number2 + "=" + answer2);
    




    }
}