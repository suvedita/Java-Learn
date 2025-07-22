public class Paramid {
    
    public static void main(String[]args){
        int i, j, l, k;
        for(i=1 ; i<=4 ; i++){
            for(j=3 ; j>=i ; j--){
                System.out.print("   ");
        }
        for(k=1 ; k<=i ; k++){
            System.out.print(" * ");
        }
        for(l=2 ; l<=i ; l++){
            System.out.print(" * ");
        }
        System.out.println();
    }
}
}