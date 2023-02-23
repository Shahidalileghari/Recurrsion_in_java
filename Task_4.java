package labtask_10;
      class Q4{
    	  public static int binary(int number, int low, int high, int a[])
    	  {
    		  if(low<=high)
    		  {
    			  int mid=(low+high)/2;
    			  if(a[mid]==number)
    			  {
    				  return mid;
    			  }
    			  else if( number<a[mid])
    			  {
    				high=mid-1;  
    			  }
    			  else {
					low=mid+1;
				}
    			 return binary(number, low, high, a) ;
    		  }
    		  return -1;
    	  }
      }
public class Task_4 {
              
	public static void main(String[] args) {
        Q4 q=new Q4();
		int a[]= {21,4,5,6,8,76,12,34};
		
		int low=0,high=a.length-1;
		System.out.println(" Applying binary search");
		System.out.print("Index of number "+8+ " is :"+Q4.binary(8, low, high, a));
	}

}
