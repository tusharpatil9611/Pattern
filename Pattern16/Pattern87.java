package Pattern16;

public class Pattern87 {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(j+i==4 || j-i==0)
					System.out.print("A");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
