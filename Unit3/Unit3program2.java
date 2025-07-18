/*public class Unit3program2{ 
    public static void main(String[] args) {
        int a = 5 ,  b = 5;
        
        if (a==5) {
            a--;
            System.out.println(true);
            
        }
        else{
            System.out.println(false);
        }
    }
    
}*/

import java.util.Scanner;

public class Unit3program2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age ;
        String name;
        System.out.print("Enter your Name : ");
        name = sc.nextLine();
        System.out.print("Enter your age : ");
        age= sc.nextInt();
        if (age>=18) {
            System.out.println(  name + "(" + age + ") You are eligible");
            
        }
        else{
            System.out.println(name +" You are not eligible");
        }
    }
}