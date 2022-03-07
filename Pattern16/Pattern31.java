package Pattern16;

public class Pattern31 {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=5;j++)
				{
				    if(j+i>=5)
					System.out.print((char)((j+i-5)+65)+" ");
				    else
				    	System.out.print(" ");
				}
			System.out.println();
		}

	}

}
