package Pattern16;

public class Pattern109 {

	public static void main(String[] args) {
	//	int count=1;
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(j+i<=3)
					System.out.print("1");
				else
					System.out.print(i+1);
			}
			System.out.println();
		}

	}

}
