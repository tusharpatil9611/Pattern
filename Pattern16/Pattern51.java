package Pattern16;

public class Pattern51 {
	public static void main(String[] args){
		for(int i=0;i<=8;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(j+i>=4 && j-i>=-4)
				{
					if(i<=4)
					System.out.print(" "+(i+1));
					else
						System.out.print(" "+(9-i));
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
		
	}
}
