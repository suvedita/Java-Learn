package loops.While_Loop;

import java.util.Scanner;

public class Factorial {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
     int fact=1 , n;
    n = sc.nextInt();
   
    while (n>=1) {
        fact = fact * n--;
       
    }
     System.out.println(fact);
   } 
}
