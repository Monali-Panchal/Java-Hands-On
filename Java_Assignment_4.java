/*              Java Assignment 4
Q4  Create a custom exception for error code,try to take two inputs A and B , Task is to divide A with
 B . result should be integer always otherwise it will throw the custom exception error message "incorrect
denominator".

 */

import java.util.*;

class ErrorCode_400  extends Exception  
{  
    public ErrorCode_400 (String errorMessage)  
    {   
        super(errorMessage);  
    }  
}  

public class Java_Assignment_4 {
    
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number");
        int A = sc.nextInt();
        System.out.println("Enter second number");
        int B = sc.nextInt();
        
        try
        {
            int result=divide(A,B);
            System.out.println("The Result is = "+result);
        }
        catch(ErrorCode_400 e)
        {
            System.out.println(e);  
        }
        
        
    }
    static int divide (int a ,int b) throws ErrorCode_400{  
       if(b == 0){  
        throw new ErrorCode_400("Incorrect Denominator");    
    } 
       return a/b;
     }
}
