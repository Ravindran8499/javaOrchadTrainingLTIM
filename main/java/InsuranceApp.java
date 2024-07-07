
import java.io.*;
import java.util.*;
// import java.lang.*;

public class InsuranceApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isTRue = true;
        while(isTRue){
        System.out.println("1. Premium Calculation");
        System.out.println("2. Maturity Amount Calculation");
        System.out.println("3. Convert Policy Details to Upper Case");
        System.out.println("4. Convert Policy Details to Lower Case");
        System.out.println("5. Exit");
        int choice = sc.nextInt();
        
        double premium = 0;
        switch(choice){
            case 1:
                System.out.println("Enter Customer's Age");
                int custAge = sc.nextInt();
                System.out.println("Enter Sum Assured");
                int sumAssured = sc.nextInt();
                if(custAge<25){
                    premium = 0.05*sumAssured;
                }else if(custAge>=25 && custAge<=40){
                    premium = 0.10*sumAssured;
                }else if(custAge>40){
                    premium = 0.20*sumAssured;
                }
                System.out.println("Premium : "+premium);
                break;
                
                case 2:
                    System.out.println("Enter insurance premium");
                    double premium_insurance = sc.nextDouble();
                    System.out.println("Enter The Policy Term");
                    double policyTerm = sc.nextInt();
                    System.out.println("Enter The Interest Rate");
                    double interestRate = sc.nextInt();
                    double Maturity_Amount = premium_insurance * policyTerm * (1+(interestRate/100));
                    System.out.println(Maturity_Amount);
                    break;
                    
                    
                case 3:
                   System.out.println("Enter Customer's Policy");
                   String policyUpper = sc.next();
                   System.out.println(policyUpper.toUpperCase());
                   break;
                   
                   
                case 4:
                   System.out.println("Enter Customer's Policy");
                   String policyLower = sc.next();
                   System.out.println(policyLower.toLowerCase());
                   break;
                   
                case 5:
                    System.out.println("Goodbyee!");
                    isTRue = false;
        }
        
        }
    }
}