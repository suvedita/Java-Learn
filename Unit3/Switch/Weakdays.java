import java.util.Scanner;

public class Weakdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weakday;
        System.out.println("Enter number : ");
        weakday = sc.nextInt();
        switch (weakday) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong Input");

        }

    }
}