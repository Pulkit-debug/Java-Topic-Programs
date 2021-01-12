package HackerEarth_Contest_Problems;
import java.util.*;
public class Divide_And_Win {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            
            int newcount =0;
            int count =0;
            int a[] = new int[n];
            for(int i =0;i<n;i++)
            a[i] = sc.nextInt();
            int j =1;
            for(int i =0;i<n;i++)
            {
             
            if((a[i]-a[j]) > 1 )
            {
                count++;
                
            }
            j = j+2;
             
            
        }
            
         System.out.println(count);   
        }
	}

}
