package PracticeQuestion;
import java.util.Scanner;  
public class Divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number : ");
        num = sc.nextInt();
        if (num%3==0 && num%5==0) {
            System.out.println(num+ " is divisible by 3 and 5. ");
        }
        else{
            System.out.println(num+ " is not divisible by 3 and 5. ");
        }
    }
    
}
