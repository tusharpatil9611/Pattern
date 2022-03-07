	// write a program to draw a pattern by using scanner class

package Pattern;
import java.util.*;
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
Scanner no= new Scanner(System.in);
System.out.println("Enter the No=");
n=no.nextInt();
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			System.out.print("s");
			
		}
		System.out.println( );
	}
}

}
