package Pattern16;

public class Pattern54 {

	public static void main(String[] args) {
		for(int i=0;i<=8;i++)
		{
			for(int j=0;j<=8;j++)
			{
				if(j-i>=0)
					System.out.print(" "+(9-i));
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
