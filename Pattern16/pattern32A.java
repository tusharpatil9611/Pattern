package Pattern16;

public class pattern32A {

	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++)
		{
			int count=5;
			for(int j=0;j<=5;j++)
			{
				if(j+i<=5)
					System.out.print((char)((count--)+65));
			}
			System.out.println();
		}
		

	}

}
