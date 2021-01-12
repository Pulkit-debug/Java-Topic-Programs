package SubARray_Problems;
import java.util.*;
public class maximum_Contiguous_SubArray_Sum {

	public static int maxSumSubarray(int a[], int k) 
    {
        int maxValue = Integer.MIN_VALUE;
        int curValue = 0;
        for(int i =0;i<a.length;i++)
        {
            curValue += a[i];
            if(i >= k-1) {
                maxValue = Math.max(maxValue, curValue);
                curValue -= a[i-(k-1)];
                
            }
        }
        return maxValue;
        
    }
	public static void main(String[] args) {
		// we have to find the maximum sum of a contigous subarray of a given length
		Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(maxSumSubarray(new int[] {4, 2, 1, 7, 8, 1, 2, 8, 1, 0}, k));

	}

}
