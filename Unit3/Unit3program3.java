import java.util.Scanner;

public class Unit3program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int per;
        System.out.print("Enter the percentage : ");
        per = sc.nextInt();
        
        if(per>=90){
            System.out.println("Grade A+");
        }
        else if (per>=80) {
            System.out.println("Grade A");
            
        }
        else if (per>=70) {
            System.out.println("Grade B+");
            
        }
        else if (per>=60) {
            System.out.println("Grade B");
            
        }
        else if (per>=50) {
            System.out.println("Grade C+");
            
        }
        else if (per>=40) {
            System.out.println("Grade C");
            
        }
        else if (per<=40) {
            System.out.println("Grade : Prd le Nalayak");
            
        }
       
    }
    
}
