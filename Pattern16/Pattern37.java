package Pattern16;

public class Pattern37 {

	public static void main(String[] args) {
		int count=0;
		int start=0;
		for(int i=0;i<=5;i++)
		{
			count=start;
			int diff=4;
			for(int j=0;j<=5;j++)
			{
				if(j-i<=0)
					System.out.print((char)(65+count++)+" ");
					count=count+diff;
			}
			System.out.println();
			start++;
		}

	}

}
