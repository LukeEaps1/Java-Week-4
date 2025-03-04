

import java.util.*;
public class Main {
  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter in a degree of farenheit to be converted into a degree of Celsius");
         double C;
        double F;
      
        F = scan.nextInt();
        C = (5.0 / 9) * (F - 32);
      
        System.out.println("In Celsius the degree is  " + C);
    }
}

