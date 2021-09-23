/*
                    Java Assignment-3
Q3 Input : Two arrays, A and B ,of equal size N.
   Find out the minimum value of  minimum value of A[0] * B[0] + A[1] * B[1] +…+ A[n-1] * B[n-1],
   where shuffling of elements of arrays A and B is allowed.
 */

import java.util.*;

public class Java_Assignment_3 {
   
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Size of the Array A and B");
        int index=sc.nextInt();
         System.out.println(" Array A ");
         int[] arr1=new int[index];
         for(int i=0;i<index;i++)
         {
             arr1[i]=sc.nextInt();
         }
          System.out.println(" Array B ");
         int[] arr2=new int[index];
         for(int i=0;i<index;i++)
         {
             arr2[i]=sc.nextInt();
         }
         
         int value = minValue(arr1,arr2,index);
         System.out.println("The Minimum Sum is : -  "+value);
        
    }
    
	static int minValue(int a1[], int b1[], int size)
	{
		Arrays.sort(a1);
		Arrays.sort(b1);

		int result = 0;
		for (int i = 0; i < size; i++)
			result = result + (a1[i] * b1[size - i - 1]);

		return result;
	}
	
}
    

