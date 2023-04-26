package functions;
//Overloading using data types

import java.util.*;

class calculator_function {
    public static int add(int a,int b){
        int c= a + b;
        return c;
    }

    public static float add(float a,float b){
        float d = a + b;
        return d;
    }
    public static void main (String [] args){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a ");
        // a = sc.next();
        // System.out.println("Enter b ");
        // b = sc.next();
        System.out.println(add(22,33)); 
       System.out.println(add(2.4f,5.7f)); 
    }
}
