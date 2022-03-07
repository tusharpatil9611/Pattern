// by using scanner class
package Pattern;
import java.util.*;
public class ReverseP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
Scanner obj= new Scanner(System.in);
System.out.println("Enter no=");
	n=obj.nextInt();
	for(int i=1;i<=n;i++){
		for(int j=n;j>=i;j--){
			System.out.print(j );
		}
		System.out.println();
	}
	}

}
