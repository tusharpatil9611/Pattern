package Pattern16;

public class Pattern118 {

	public static void main(String[] args) {
		for(int i=0;i<=6;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(i==0 || j==0 || i==6 || i==3)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
				System.out.println();
		}

	}

}
