package Pattern16;

public class Pattern72 {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{
			int counter=1;
			for(int j=0;j<=8;j++)
			{
				if(j+i>=4 && j-i<=4)
				{
				if(j<4)
					System.out.print(counter++);
				else
					System.out.print(counter--);
				
				}
				else
				System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}
