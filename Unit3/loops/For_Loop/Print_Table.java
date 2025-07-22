package loops.For_Loop;
import java.util.Scanner;
public class Print_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num , i;
        System.out.print("Enter the Number : ");
        num = sc.nextInt();
        for(i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }
}
