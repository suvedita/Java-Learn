package loops.For_Loop;

import java.util.Scanner;

public class sum_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, sum=0,rem;
        System.out.print("Enter the number: ");
        n= sc.nextInt();
        for(i=1;i<=5;i++){
            rem = n%10;
            n=n/10;
            sum=sum+rem;

        }
        System.out.println("Sum is : "+sum);
    }
    
}
