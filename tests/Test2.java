package tests;
import java.io.*;
import java.util.*;

public class Test2 
{
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); 
    for(int j =0;j< t;j++)
    {
        int n = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        
        String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
        for(int i =0;i<n;i++)
            a[i] = Integer.parseInt(strs[i]);
        
        StringBuffer sb = new StringBuffer(); 
        
        for(int i =d;i<n;i++)
        sb.append(a[i] + " "); 
        
        for(int i =0;i<d;i++)
        sb.append(a[i] + " "); 

        
        System.out.println(sb);
    }
        
	}
		}
		
 
		
		
		
		
		
		
		
		
