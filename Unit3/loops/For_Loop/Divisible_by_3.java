package loops.For_Loop;

public class Divisible_by_3 {
    public static void main(String[] args) {
        int i;
        for ( i = 1; i <=100; i++) {
            if (i%3==0) {
                System.out.print(i + " ");
            }
        }
    }
}
