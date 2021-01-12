package Practice_Problems;
import java.util.*;
public class Balanced_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int a[]  = new int[n];
            
            for(int i =0;i<n;i++)
            a[i] = sc.nextInt();
            
            int greater =0, smaller =0;
            int mid = ((n-1)/2) + 1;
//            System.out.println(mid);
            int sumLeft =0, sumRight =0;
            for(int i =0;i<mid;i++)
            sumLeft += a[i];
//            System.out.println(sumLeft);
            for(int i =mid;i<n;i++)
            sumRight += a[i];
            
             greater = Math.max(sumLeft, sumRight);
             smaller = Math.min(sumLeft, sumRight);
            
            int ans = greater - smaller;
            
            System.out.println(ans);
            
        }

	}

}
