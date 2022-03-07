package Pattern16;

public class Pattern30 {

	public static void main(String[] args) {
		for(int i=0;i<=11;i++)
		{
			for(int j=0;j<=5;j++)
			{
				if((i+j<=5 || j-i<=-6))
				{
					if(i<=5)
					System.out.print((char)((5-i-j)+65));
					else
						System.out.print((char)(65+(i-j-6)));
				}
			}
			System.out.println();
		}

	}

}
