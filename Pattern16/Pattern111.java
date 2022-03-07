package Pattern16;

public class Pattern111 {

	public static void main(String[] args) {
		int count=5;
		for(int i=0;i<=4;i++)
		{
			int count1=5;
			for(int j=0;j<=4;j++)
				{
				if(j-i==0)
					System.out.print(count--);
				if(j-i<=0)
					System.out.print(count1--);
				else
					System.out.print(count1+1);
				}
			System.out.println();
		}

	}

}
