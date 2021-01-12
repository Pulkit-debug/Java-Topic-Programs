package tests.onlinePracticeTest;
import java.util.*;
public class test1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int a[] = new int[n];
	      for(int i = 0;i<n;i++) a[i] = sc.nextInt();

	      int res[] = new int[n];
	      int resIndex = 0;
	      int numCheck = 0;
	      int sum = 0;
	      for(int i = 0;i<n;i++) {
	            numCheck = a[i];
	            sum = 0;
	          for(int j = 0;j<n;j++) {
	              if(j != i) sum += a[j];
	          }
	          if(sum % 7 == 0) {
	            //   sum += numCheck;
	            //   if(sum % 7 != 0) {
	                  res[resIndex] = numCheck;
	                  resIndex++;
	            //   }
	          }
	      }

	    // Collections.sort(al);
	    int min = Integer.MAX_VALUE;
	    for(int i = 0;i<res.length;i++) {
	        if(res[i] < min && res[i] != 0) min = res[i];
	        System.out.print(res[i] + " ");
	    }
	    
	    boolean flag = false;
	    int index = 0;
	    for(int i = 0;i<a.length;i++) {
	        if(min == a[i]) {
	            flag = true;
	            index = i;
	            break;
	        }
	        
	    }
	    if(flag) System.out.println(index);
	    else System.out.println("-1");


	}

}
