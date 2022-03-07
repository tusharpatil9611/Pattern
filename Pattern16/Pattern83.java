package Pattern16;

public class Pattern83 {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=9;j++)
			{
				if(j-i<=0 || i+j>=9)
				{
					if(j<=4)
						System.out.print(j+1);
					else
						System.out.print(i+j-8);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
