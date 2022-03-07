	// Write a program to draw a reverse pattern by using scanner class
package Pattern;
import java.util.*;
public class ReverseP3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no;
Scanner obj=new Scanner(System.in);
System.out.println("Enter  NO=");
	no=obj.nextInt();
	for(int i=1;i<=no;i++){
		for(int j=no;j>=i;j--){
			System.out.print(" * ");
		
		}
		System.out.println();
	}
	}

}
