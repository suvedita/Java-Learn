package PracticeQuestion;

import java.util.Scanner;

public class VoteEligibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age ;
        String name;
        System.out.print("Enter your Name : ");
        name = sc.nextLine();
        System.out.print("Enter your age : ");
        age= sc.nextInt();
        if (age>=18) {
            System.out.println(  name + " (" + age + ") You are eligible");
            
        }
        else{
            System.out.println(name +" (" + age + ") You are not eligible");
        }
    }
}
