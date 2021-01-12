package Practice_Problems;
import java.util.Arrays;
import java.util.Scanner;
public class Array_without_Two_Greater_Elements {
	public static void main(String[] arga)
	{
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Test Case : ");
		    int t = sc.nextInt();
		   	// maximum number of the array 
		    
		    for(int i =0;i<t;i++)
		    {
		    	 int max1=0, max2 =0;
		    	int new1=0, new2=0;	// for storing the index value
		    	
		        int n = sc.nextInt();
		        int a[] = new int[n];    
		        for(int j =0;j<n;j++)
		        a[j] = sc.nextInt();
		        
		        // Finding the two greatest numbers
		        for(int j =0;j<n;j++)
		        {
		            if(a[j] > max1)
		            {
		                max2 = max1;
		                new2 = new1;
		                max1 = a[j];
		                new1 = j;
		      
		            }
		            if(a[j] > max2 && a[j] <max1)
		            {
		                max2 = a[j];
		                new2 = j;
		            }
		        }
		        
		        System.out.println("Two max numbers are : " + max1 + " " + max2);
		        
		        System.out.println("Indexes of maximum numbers are : " + new1 + " " + new2);
		        
		        System.out.println("Time to Delete the Greatest MFk'S");
		        for(int k =new1; k <n-1;k++)
		        {
		        	a[k] = a[k+1];
		        }
		        for(int k =new2; k <n-1;k++)
		        {
		        	a[k] = a[k+1];
		        }
		        
		        n = n-1;	// Two elements will be gone after deletion :D Peace
		        System.out.println("After Deletion the array is : ");
		        Arrays.sort(a);
		        for(int p =0;p<n;p++)
		        {
		        	System.out.print(a[p] + " ");
		        }
		    }
		    
		    // Time Complexity for the above program is O(n)
	//	    12 23 28 43 44 59 60 68 70 85 88 92 124 125 136 168 171 173 179 199 212 230 277 282 306 314 316 325 328 336 337 363 365 368 369 371 374 387 394 414 422 427 430 435 457 493 506 527 531 538 541 546 568 583 650 691 730 737 751 764 778 783 785 789 794 803 809 815 847 858 863 874 887 896 916 920 926 927 930 957
	    
		    }
		    
	}

