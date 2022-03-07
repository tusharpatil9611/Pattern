package Pattern16;

public class Pattern40A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		int start=1;
		for(int i=0;i<=4;i++)
		{
			count=start;
			for(int j=0;j<=4;j++)
			{
				if(j+i<=4)
					System.out.print(count++);
			}
			System.out.println();
			start++;
		}

	}

}
