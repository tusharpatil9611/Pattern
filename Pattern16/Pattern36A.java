package Pattern16;

public class Pattern36A {

	public static void main(String[] args) {
		int count=0;
		for(int i=0;i<=5;i++)
		{
			int count1=count;
			for(int j=0;j<=5;j++)
			{
				if(j-i<=0)
					System.out.print((char)(65+(count1--)));
			}
			System.out.println();
			 count++;
		}


	}

}
