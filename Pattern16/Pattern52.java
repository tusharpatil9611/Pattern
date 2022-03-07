package Pattern16;

public class Pattern52 {
	public static void main(String[] args){
		for(int i=0;i<=8;i++)
		{
			for(int j=0;j<=8;j++)
			{
				if(i+j>=8 )
					System.out.print(" "+(i+1));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}

}
