package functions;
import java.util.*;

public class factorial_function {
    public static int fact(int n){
        int num = 1;
        for(int i = 0; i<n;i++){
            num =num * (n-i);
        }
        return num;
    }

  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no. to calculate factorial");
    int n = sc.nextInt();
    System.out.println("Factorial is " + fact(n));
  }  
}
