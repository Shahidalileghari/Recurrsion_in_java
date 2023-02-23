package labtask_10;

import java.util.Scanner;

class Q1{
    	   public int fact(int n)
    	   {
    		   if(n==0)
    		   {
    			   return 1;
    		   }
    		   
    		   return n*fact(n-1);
    	   }
       }
public class Task_1 {

	public static void main(String[] args) {
	 
		Q1 q=new Q1();
		Scanner scanner=new Scanner(System.in);
      System.out.println("Enter a number to calculate factorial");
      int number=scanner.nextInt();
      
      int result=q.fact(number);
      
         System.out.println("Factorial of "+number+"!"+"="+result);
	}

}
