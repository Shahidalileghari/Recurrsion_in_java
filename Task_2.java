package labtask_10;



class Q2{
       public static void print(int number)
       {
    	   if(number<1)
    		   return;
    	   
    	   print(number-1);
    	   System.out.print(" "+number +" ");
       }
}
public class Task_2 {

	public static void main(String[] args) {
		 
		
		  
		   System.out.println("Printing series of number");
		   
		   Q2.print(4);

	}

}
