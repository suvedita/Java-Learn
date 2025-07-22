import java.util.Scanner;

public class Menu_driven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose, num, num1, num2, sum, multiple, x, y;
        while (true) {
            
        
            System.out.println("--Menu--");
            System.out.println("1. Check Even or Odd");
            System.out.println("2. Addition of Two number");
            System.out.println("3. Multiplication of Two number");
            System.out.println("4. Exit");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("Enter the number : ");
                    num = sc.nextInt();
                    if (num % 2 == 0) {
                        System.out.println(num + " is a Even Number.");
                    } else {
                        System.out.println(num + " is an Odd Number.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the number : ");
                    num1 = sc.nextInt();
                    System.out.print("Enter the number : ");
                    num2 = sc.nextInt();
                    sum = num1 + num2;
                    System.out.println("Sum is " + sum);
                    break;
                case 3:
                    System.out.print("Enter the number : ");
                    x = sc.nextInt();
                    System.out.print("Enter the number : ");
                    y = sc.nextInt();
                    multiple = x * y;
                    System.out.println("Multiplication is " + multiple);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
    }
}
