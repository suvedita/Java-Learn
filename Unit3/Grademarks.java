import java.util.Scanner;
public class Grademarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x;
        System.out.print
        ("Enter grade : ");
        x = sc.next().charAt(0);
        switch (x) {
            case 'A':
            case 'a':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'b':
                System.out.println("Good");
                break;
                 case 'C':
            case 'c':
                System.out.println("Average");
                break;
                 case 'D':
            case 'd':
                System.out.println("Fail");
                break; 
            default:
                 System.out.println("Wrong grade");
                break;
        }
    }
}
