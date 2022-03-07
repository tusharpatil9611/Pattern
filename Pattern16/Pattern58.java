package Pattern16;

public class Pattern58 {

	public static void main(String[] args) {
		for(int i=0;i<=8;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(j+i<=4 || j-i<=-4)	//(j+i<=4 || j-i<=-4)
					System.out.print(j+1);
				else
					System.out.print(" ");
			}
		System.out.println();
		}
	}

}
