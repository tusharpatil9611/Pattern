package Pattern16;

public class Pattern100 {

	public static void main(String[] args) {
		for(int i=0;i<=8;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(j==4 || j+i==4 || j-i==-4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
