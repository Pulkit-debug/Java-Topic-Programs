package SubARray_Problems;

public class Smallest_Sub_Array_forA_Given_Sum {
	public static int minSubArraySize(int a[], int targetSum)
	{
		int currentWindowSum =0;
		int minWindowSize =Integer.MAX_VALUE;
		int windowStart =0;
		int index=0;
		for(int windowEnd = 0; windowEnd < a.length; windowEnd++)
		{
			
			currentWindowSum += a[windowEnd];
			
			while(currentWindowSum >= targetSum)
			{
				minWindowSize = Math.min(minWindowSize, (windowEnd  - windowStart) + 1);
				
				currentWindowSum -= a[windowStart];
				windowStart++;
				index = windowEnd;
			}
			
		}
		
		return minWindowSize;
	}
	public static void main(String[]  args)
	{
		int targetSum =8;
		System.out.println(minSubArraySize(new int[] {4, 2, 2, 7, 8, 1, 2, 8, 10}, targetSum));
		
		
	}
}
