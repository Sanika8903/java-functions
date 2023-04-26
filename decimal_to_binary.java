package functions;
import java.util.*;

public class decimal_to_binary {
    
    public static void convert(int n){
        int pow = 0;
        int bin = 0;
        while(n>0){
            int num = n%2;
            n = n/2;
            bin = bin + (num*(int)Math.pow(10,pow));
            pow++;
        }
        System.out.println(bin);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        convert(n);
    }
}
