/*
                        Java Assignment 5
Q5. Store the emp id and name of 10 employees of a company in a HashMap
{Key(emp id):Value(emp name)}
Now iterate loop over the Hashmap such as if we provide emp id then emp name will come.
Conditions:
1 . Emp id will be only numbers if user give other than number then throw number format exception which 
    will handle in a catch block.
2 . If user gave one emp id that is not in Map it will throw exception and 
prints message "Employee is not present"
 */


import java.io.*;  
import java.util.*;

class Emp_NotPresent{  
 void method()throws IOException{  
  System.out.println("Employee is not present");  
 }  
} 
public class Java_Assignment_5 {
    
    public static void main(String[] args)throws IOException
    {
        Scanner sc =new Scanner(System.in);
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        for(int i=1;i<=10;i++)
        {
        System.out.println("Enter the Emp_Id and Emp_Name of Employee_" +i);
        map.put(sc.nextInt(),sc.next());
        }
        
        System.out.println("10 Employees of a company : " + map);
        System.out.println("Enter the Emp_id to be search ");
        
        try{
             int emp_id=Integer.parseInt(sc.next());
            if(map.containsKey(emp_id))
            {
                String emp_name=map.get(emp_id);
                System.out.println("Employee name with Emp_id " + emp_id +"  is  "+emp_name);
            }
            else
            {
                Emp_NotPresent m=new Emp_NotPresent();  
                 m.method();  
               
            }
        }
        catch(NumberFormatException ex){  
            System.out.println("Invalid Emp_Id Entered !!");  
        }
        
    }
    
}
