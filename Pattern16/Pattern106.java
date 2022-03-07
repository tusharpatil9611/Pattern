package Pattern16;

public class Pattern106 {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(j-i<=0)
				{
					if(j%2==0)
				
					System.out.print("1");
				else
					System.out.print("0");
				}
			
			}
			System.out.println();
		}

	}

}
