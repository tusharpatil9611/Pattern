package Pattern16;

public class Pattern55 {

	public static void main(String[] args) {
		for(int i=0;i<=8;i++)
		{
			for( int j=0;j<=4;j++)
			{
				if(j-i<=0 && j+i<=8)		//j-i<=0 && j+i<=8)
					System.out.print(j+1);
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
