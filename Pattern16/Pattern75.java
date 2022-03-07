package Pattern16;

public class Pattern75 {

	public static void main(String[] args) {
		for(int i=0;i<=12;i=i+2)
		{
			for(int j=0;j<=12;j++)
			{
				if(j-i<=0)
				{
					if(2*j==i)
						System.out.print(" ");
					else
						System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
