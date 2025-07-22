package loops.While_Loop;

import java.util.Scanner;

public class Posi_Negi_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num , pos=0, neg=0, zero=0;
        char ch;
        while (true) {
            System.out.print("Enter the number : ");
            num = sc.nextInt();
            if (num>0) {
                pos++;
            }
            else if (num<0) {
                neg++;
            }
            else if (num==0) {
                zero++;
            }
            System.out.print(" you want to enter more number ? ");
            ch = sc.next().charAt(0);
            if (ch == 'N' || ch == 'n') {
                break;
            }
            else if (ch == 'Y' || ch == 'y') {
                System.out.println("Okay");
            }
            else {
                System.out.println("Please give  answer in Y or N.");
            }
        }
        System.out.println("There are " +pos+ " positive numbers");
        System.out.println("There are " +neg+ " negative numbers");
        System.out.println("There are " +zero+ " zero numbers");
    }
}
