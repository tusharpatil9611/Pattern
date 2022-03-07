package Pattern16;

public class Pattern59 {
	public static void main(String[] args) {
		for(int i=0;i<=8;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(j-i>=0 || j+i>=8)
				{
					if(i<=4)
						System.out.print(j-i+1);
					else
						System.out.print(j+i-7);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
