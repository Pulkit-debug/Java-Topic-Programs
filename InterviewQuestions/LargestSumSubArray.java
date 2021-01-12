package InterviewQuestions;

public class LargestSumSubArray {
	public static void main(String[] args) {
//		int a[] = {1, 4, -2, 4, -1, 3, 5, -6};
//		int n = a.length;
//		
//		int maxsum =Integer.MIN_VALUE;
//		for (int i =0;i<n;i++) {
//			
//			for (int j=i;j<n;j++) {
//				int cursum = 0;
//				for (int k = i; k<=j;k++) {
//				
//					cursum += a[k];
//					
//				}
//				
//				if(cursum > maxsum) {
//					
//					maxsum = cursum;
//				}
//			}
//		}
//		
//		System.out.println("Maximum sum of subarray is : " + maxsum);	
//}
		//}
	
//		int a[] = {-1, 4, -2, -4, -1, 3, 5, -6};
//		int n = a.length;
//		int sum[] = new int[n];
//		sum[0] = a[0];
//		for(int i =1;i<n;i++) {
//			
//			sum[i] = sum[i-1] + a[i];
//		}
//		
//		int maxsum =Integer.MIN_VALUE;
//		for (int i =0;i<n;i++) {
//			
//			for (int j=i;j<n;j++) {
//				
////				for (int k = i; k<=j;k++) {
////				
////					cursum += a[k];
////					
////				}
//				int cursum = sum[j] -sum[i] +a[i];
//				
//				if(cursum > maxsum) {
//					
//					maxsum = cursum;
//				}
//			}
//		}	
//		
//		System.out.println("Maximum sum of subarray is : " + maxsum);		
//	
//	
//	
//	}
//	
//
//}
	
		// { ------KADEN'S ALGORITHEM------ }
		
		int a[] = {-1, 4, -2, -4, -1, 3, 5, -6};
		int n = a.length;
	
		int cursum = 0;
		int maxsum = Integer.MIN_VALUE;
		for(int i =0;i<n;i++) {
			
			cursum += a[i];
			
			if(cursum > maxsum) {
				
				maxsum = cursum;
				
			}
			
			if(cursum < 0) {
				
				cursum = 0;
			}
			
		}
		
		System.out.println("Maximum sum of subarray is : " + maxsum );		

		
}
	
}