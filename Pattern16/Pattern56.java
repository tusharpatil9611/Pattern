package Pattern16;

public class Pattern56 {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(j+i>=4)
					System.out.print(" "+(i+j-3));
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
