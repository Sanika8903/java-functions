package functions;
import java.util.*;

public class binary_to_decimal {
    
    public static void convert(int n){
        int pow = 0;
        int dec = 0;
        while(n>0){
            int num = n % 10;
            dec = dec + (num*(int)(Math.pow(2,pow)));
            n = n/10;
            pow++;
        }
        System.out.println(dec);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        convert(n);
    }
}
