package Pattern;
import java.util.*;
public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
Scanner number=new Scanner(System.in);
System.out.println("Enter the no=");
n=number.nextInt();

for(int i=1;i<=n;i++){
	for(int j=1;j<=i;j++){
		System.out.print("*");
	}
	System.out.println();
}
	}

}
