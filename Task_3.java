package labtask_10;




public class Task_3 {
	
     
 private static void Fib(int number,int number2, int n)
 	{
	 if(n==1)
	 {
		 return ;
	 }
 		int sum=number+number2;
 		number=number2;
 		number2=sum;
 		
 		System.out.print(" "+sum);
 		
 		Fib(number, number2, n-1);
 	}
	public static void main(String[] args) {
		
		int a=0,b=1;
		System.out.println("Printing fibonacci series");
		System.out.print(a+" "+b);
		Fib(0, 1, 5);
       
	}

}
