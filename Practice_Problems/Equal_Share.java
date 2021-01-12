package Practice_Problems;
import java.util.*;
public class Equal_Share {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for(int i =0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        
        Arrays.sort(a);
        int sum =0;
        for(int i =0;i<n;i++)
        {
        	sum += a[i];
        }
        System.out.println(sum);
//        if(sum < 0)
//        	sum += sum*2;
        sum = sum/n;
        sum = sum/k;
        
        System.out.println(sum);
//        int ans = n / (n / 2);
//        System.out.println(ans);

	}

}
