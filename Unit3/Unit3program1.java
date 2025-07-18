import java.util.Scanner;

public class Unit3program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int Var1 , Var2 , Sum;
        System.out.print("Var 1 : ");
        Var1 = sc.nextInt();
        System.out.print("Var 2 : ");
        Var2 = sc.nextInt();

        
        Sum = Var1 + Var2;
        System.out.println("Sum = "+ Sum);
    }
}
