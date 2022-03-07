//print pattern by creating method and pass the arguments

package Pattern;

public class Pattern1 {
public static int pattern(int n){
	for (int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println( );
	}
	
	return n;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no=Pattern1.pattern(5);
Pattern1 in =new Pattern1();	//Creating a object by using class name for method is non static
int no1=in.pattern(5);
	}

}
