package Pattern16;

public class Pattern38A {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{
			int count=1;
			for(int j=0;j<=4;j++)
			{
				if(j-i<=0)
					System.out.print(count++);
			}
			System.out.println();
		}


	}

}
