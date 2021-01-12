
/*		Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value.
		And you need to output the maximum average value.	*/


package SubARray_Problems;

public class SubArray_Problem1 {

	public static int maximum_average_value(int a[], int k)
	{
		int curSum =0;
		int maxSum =Integer.MIN_VALUE;
		for(int window = 0; window < k; window++)
			curSum += a[window];
		for(int newWindow = k; newWindow <= a.length ; newWindow++)
		{
			maxSum = Math.max(curSum, maxSum);
			if(newWindow == a.length) break;
			
			curSum -= a[newWindow-k];
			curSum += a[newWindow];
			
		}

		return maxSum / k;
	}
	
	public static void main(String[] args) {
		
		int k =3;
		System.out.println(maximum_average_value(new int[] {4, 2, 2, 7, 8, 100, 2, 8, 20}, k));
		
		
	}

}
