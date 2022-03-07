package Pattern16;

public class Pattern29 {
	public static void main(String[] args){
		for(int i=0;i<=11;i++)
		{
			for(int j=0;j<=5;j++)
			{
				if(i+j<=5 || j-i<=-6)
					System.out.print((char)(j+65));
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
	}

}
