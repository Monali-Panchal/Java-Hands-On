/*
                    Java Assignment - 1
Q1 Write a program that accepts three numbers from the user and
  prints "increasing" if the numbers are in increasing order,
 "decreasing" if the numbers are in decreasing order, 
  and "Neither increasing or decreasing order" otherwise.
 */

import java.util.Scanner;

public class Java_Assignment {
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1=sc.nextInt();
         System.out.println("Enter the second number : ");
        int num2=sc.nextInt();
         System.out.println("Enter the third number : ");
        int num3=sc.nextInt();
        
       if(num1 < num2 && num2 < num3)  
       {
           System.out.println("Increasing");
       }
       else if(num1 > num2 && num2 >num3)
       {
           System.out.println("Decreasing");
       }
       else
       {
           System.out.println("Neither Increasing or Decreasing order");
       }
    }  
}
