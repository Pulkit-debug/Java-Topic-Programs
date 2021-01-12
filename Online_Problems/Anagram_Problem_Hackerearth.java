package Online_Problems;

import java.util.Scanner;

public class Anagram_Problem_Hackerearth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = new String();
        String b = new String();
        a = sc.nextLine();
        b = sc.nextLine();
        
        int t = sc.nextInt();
            int check = 0;
		int againCheck =0;
		for(int k =0;k<t;k++)
		{
		for(int i =0;i<a.length();i++)
		{	
			char ch = a.charAt(i);
			
			for(int j =0;j<b.length();j++)
			{
				check =0;
		
				if(ch == b.charAt(j))
				{
					break;
					
					}
				else check =1;
//				if(boolcheck) break;
			}
			againCheck += check;
			
		}
		}
		
		System.out.println(againCheck*againCheck);

	}

}
