package Pattern16;

public class Pattern73 {

	public static void main(String[] args) {
		for(int i=0;i<=8;i=i+2)
		{
			int counter=0;
			for(int j=0;j<=8;j++)
			{
				if(j-i<=0)
				{
					System.out.print((char)(counter+65));
					
					if(j<i/2)
						counter++;
					else
						counter--;
				}
			}
			System.out.println();
		}

	}

}
