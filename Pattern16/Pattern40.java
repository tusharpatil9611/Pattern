package Pattern16;

public class Pattern40 {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(j+i<=4)
					System.out.print(j+i+1);
			}
			System.out.println();
		}
	}

}
