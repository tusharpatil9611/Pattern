
package Pattern16;

public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for( int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(j-i<=0)
					System.out.print((char)(j+65));
			}
			System.out.println();
		}

	}

}
