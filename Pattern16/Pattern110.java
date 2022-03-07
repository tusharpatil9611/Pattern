package Pattern16;

public class Pattern110 {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(j-i>=0)
					System.out.print("5");
				else
					System.out.print(j-i+5);
			}
			System.out.println();
		}

	}

}
