/*           Java Assignment - 2
 Q2 Write a Java Program to Find Largest Number Using Ternary Operator
 */

import java.util.Scanner;
public class Java_Assignment_2 {
    
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        int largest =(num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        
        System.out.println("Largest Number among "+num1+" , "+num2+" , "+num3+ " is "+largest);
    }
    
}
