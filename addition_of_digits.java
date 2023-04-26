package functions;
import java.util.*;

public class addition_of_digits {
    
    public static void additionDigit(int n){
        int sum = 0;
        while(n>0){
            int num = n%10;
            n = n/10;
            sum = sum + num;
        }
        System.out.println("The sum is: " + sum);  
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        additionDigit(n);
    }
}
