package functions;
import java.util.*;

public class BinomialCoeff_function {
    public static int fact(int n){
        int num = 1;
        for(int i = 0; i<n;i++){
            num =num * (n-i);
        }
        return num;
    }

    public static float binomial_coefficient(int n, int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int c = n-r;
        int fact_c = fact(c);
        float result = (float)((fact_n)/(fact_r * fact_c));
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        System.out.println("Enter value of r");
        int r = sc.nextInt();
        System.out.println("The binomial coefficient is " + binomial_coefficient(n,r));
    }
}
