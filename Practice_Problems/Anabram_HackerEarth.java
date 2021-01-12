package Practice_Problems;
import java.util.*;
public class Anabram_HackerEarth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        
        int t = sc.nextInt();
            
		while(t-->0)
		{
		    sc.nextLine();
		String a = sc.nextLine();
        String b = sc.nextLine();
        
        if(a.length() == b.length())
        {
		    int check = 0;
		int againCheck =0;
		int newcheck =0;
		
        
		for(int i =0;i<a.length();i++)
		{
			char ch = a.charAt(i);
			
			for(int j =0;j<b.length();j++)
			{
				check =0;
				newcheck =0;
				if(ch == b.charAt(j))
				{
					check=1;
					break;
				}
					else
					newcheck = 1;
//				if(boolcheck) break;
			}
			againCheck += newcheck;
			
		}
		System.out.println(againCheck*againCheck);
		}
		}
	}

}
