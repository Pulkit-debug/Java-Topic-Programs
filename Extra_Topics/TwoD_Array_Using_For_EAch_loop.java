package Extra_Topics;

public class TwoD_Array_Using_For_EAch_loop {
	public static void main(String[] args)
	{
		
		int a[][] = {
				{2, 6, 2, 7},
				{3, 4, 2, 5}, 
				{1, 5, 6, 1}
				
				
		};
		
		for(int i =0;i<3;i++)
		{
			for(int j =0;j<4;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
		
		// Printing the array using for each loop
		System.out.println("Printing using the for each loop");
		
		for(int x[] : a)
		{
			for(int y : x)
			{
			System.out.print(y + " ");
			}
			System.out.println();
		}
		
	}
}
