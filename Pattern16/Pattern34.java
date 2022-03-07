package Pattern16;

public class Pattern34 {

	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++)
		{
			int count=0;
			for(int j=0;j<=5;j++)
			{
				if(j+i<=5)
					System.out.print((char)(65+count++));
			}
			System.out.println();
		}
	

	}

}
