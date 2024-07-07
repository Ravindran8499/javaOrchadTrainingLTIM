package src.main.java;
// import java.io.*;
import java.util.*;
public class SubscriptionChecker {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Welcome To Subscription Checker!");
        System.out.println("Enter Number Of Days Until Subscription gets Over: ");
        int noOfDays = sc.nextInt();
        if(noOfDays==0){
            System.out.println("Your subscription has ended. Please renew.");
        }else if(noOfDays>=1 && noOfDays<=5){
            System.out.println("Your susbcription is about to end. Please consider renewing");
        }else if(noOfDays>5 && noOfDays<=30){
            System.out.println("Your susbcription is active");
        }else{
            System.out.println("Invalid input. Please Enter a number between 0 and 30.");
        }

    }
}
