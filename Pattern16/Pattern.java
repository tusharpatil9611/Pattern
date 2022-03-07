package Pattern16;

public class Pattern {

	public static void main(String[] args) {
		for(int i=0;i<=8;i++)
		{
			for(int j=0;j<=4;j++)
			{				if(j-i<=0 && j+i<=8)
			{
				if(i<=4)
				
					System.out.print((char)(i+65));
					else
						System.out.print((char)((8-i)+65));
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
