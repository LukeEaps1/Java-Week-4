//2/25/25 
//Luke Eapen
//Digits
 
public class digits{
    public static void main(String[]args){

    
    int number;
    int ones;
    int tens;
    int hundreds;
    number = 258;
    ones = number % 10;
    tens = (number /10)%10;
    hundreds = (number/10/10)%10;
    System.out.println(ones);
    System.out.println(tens);
    System.out.println(hundreds);


    }
    
}