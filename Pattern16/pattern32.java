package Pattern16;

public class pattern32 {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=5;j++)
			{
				if(j+i<=5)
					System.out.print((char)((5-j)+65));
			}
			System.out.println();
		}
		

	}

}
