//2/25/25 
//Luke Eapen
//Digits
import java.util.*;
public class digits{
    public static void main(String[]args){

    
    int number;
    int ones;
    int tens;
    int hundreds;
    int thousands;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a four digits number");
   
   
    number = input.nextInt();
    //number = 4280
    ones = number % 10;
    tens = (number /10)%10;
    hundreds = (number/10/10)%10;
    thousands = (number/10/10/10)%10;
    System.out.println("The ones digits is"+ones);
    System.out.println("The tens digits is "+tens);
    System.out.println("The hundreds digits is"+hundreds);
    System.out.println("The thousands digits is"+thousands);
 
   
    
    }
    
}