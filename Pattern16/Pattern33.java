package Pattern16;

public class Pattern33 {
	public static void main(String[] args){
		for(int i=0;i<=5;i++)
		{
			int count=5;
			for(int j=0;j<=5;j++)
			{
				if(j-i<=0)
					System.out.print((char)(65+count--));
			}
			System.out.println();
		}
		
		
		
	}

}
