package Pattern16;

public class Pattern49 {

	public static void main(String[] args) {
		for(int i=0;i<=8;i++)
		{
			for(int j=0;j<=8;j++)
			{
				if(j+i>=8)
					System.out.print(i+j-7);
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
