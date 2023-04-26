package functions;
import java.util.*;

public class multiplcation_table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. to print the table ");
        int n = sc.nextInt();
        for(int i =1;i<=10;i++){
            System.out.println(n+ " x "+i+" = "+n*i);
        }
    }
}
