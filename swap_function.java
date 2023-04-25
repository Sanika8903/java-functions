package functions;
import java.util.*;

public class swap_function {
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a is " + a);
        System.out.println("b is " + b);
    }

   public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a");
    int a = sc.nextInt();
    System.out.println("Enter b");
    int b = sc.nextInt();
    swap(a,b);
   } 
}
