package functions;
import java.util.*;

public class multi_function {
    public static int multiplication(int a,int b){
        int multi = a*b;
        return multi;
    }

   public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a");
    int a = sc.nextInt();
    System.out.println("Enter b");
    int b = sc.nextInt();
    System.out.println("Multiplication is " + multiplication(a, b));
   } 
}
