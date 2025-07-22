package loops.While_Loop;

import java.util.Scanner;

public class Calculate_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean istrue = true;
        int num, sum = 0;
        char ch;
        while (istrue) {
            System.out.print("Enter the number : ");
            num = sc.nextInt();
            sum = sum + num;
            // System.out.println("sum is " + sum);
            System.out.print("Do you want to enter more number ?(Y/N) : ");
            ch = sc.next().charAt(0);
            if (ch == 'N' || ch == 'n') {
                istrue = false;
            } else if (ch == 'Y' || ch == 'y') {
                System.out.println("Okay");
            } else {
                System.out.println("Please give  answer in Y or N. ");
            }
        }
        System.out.println("Sum = " + sum);
    }
}
