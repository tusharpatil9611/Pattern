package Pattern16;

public class Pattern80 {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=9;j++)
			{
				if(j-i<=0 || j+i>=9)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
