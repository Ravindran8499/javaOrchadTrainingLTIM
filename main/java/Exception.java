package src.main.java;

import java.util.*;


public class Exception {
    public void ArithmeticExceptionExample(int num1 , int num2){
        int div = 0;
        try {
            div = num1/num2;
        } catch (ArithmeticException e) {
            System.out.println("Division by Zero Error..!!!" + e);
        }
    }

    // public void NumberFormatExceptionExample(int num1 , int num2){}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exception e = new Exception();
        int num1=0;
        int num2=0;
        try{
             num1 = Integer.parseInt(sc.nextLine());
             num2 = Integer.parseInt(sc.nextLine());

        }catch(NumberFormatException nfe){
            System.out.println("Number Format Exception : "+nfe);
        }
        e.ArithmeticExceptionExample(num1,num2);
        sc.close();

    }
}
