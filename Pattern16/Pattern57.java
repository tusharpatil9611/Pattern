package Pattern16;

public class Pattern57 {

	public static void main(String[] args) {
		int count=1;
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(j-i<=0)
					System.out.print(" "+count++);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
