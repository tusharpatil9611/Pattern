package Pattern16;

public class Pattern50 {

	public static void main(String[] args) {
		for(int i=0;i<=6;i++)
		{
			for(int j=0;j<=29;j++)
			{
				if(j<3)
				System.out.print("0");
				else if(j<6)
					System.out.print("1");
				else if(j<9)
					System.out.print("2");
				else if(j<12)
					System.out.print("3");
				else if(j<15)
					System.out.print("4");
				else if(j<18)
					System.out.print("5");
				else if(j<21)
					System.out.print("6");
				else if(j<24)
					System.out.print("7");
				else if(j<27)
					System.out.print("8");
				else
					System.out.print("9");
				
			}
			System.out.println();
			
		}

	}

}
