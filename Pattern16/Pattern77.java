package Pattern16;

public class Pattern77 {

	public static void main(String[] args) {
		int counter=1;
		int start=1;
		for(int i=0;i<=4;i++)
		{
			counter= start;
			int diff=4;
			for(int j=0;j<=4;j++)
			{
				if(j-i<=0)
				{
					System.out.print(counter+" ");
					counter=counter+diff;
					diff--;
				}
			}
			System.out.println();
			counter=start++;
		}
		

	}

}
