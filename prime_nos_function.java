package functions;
import java.util.*;

public class prime_nos_function {

    public static Boolean isPrime(int a){
        if (a == 2){
            return true;
        }
        for (int i = 2 ; i<=Math.sqrt(a) ; i++  ){
            if (a % i == 0){
                return false;
            }
            } 
            return true;
        }

        public static void print_no(int n){
            for (int i =2; i<=n; i++){
                if (isPrime(i)){
                    System.out.print(i + " ");
                }
            }
        }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper limit of range to print prime no.s");
        int n = sc.nextInt();
        // System.out.println(isPrime(n));
        print_no(n);
    }
}
