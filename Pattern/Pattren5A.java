					//Write a program to print star pattern by creating method 
package Pattern;

public class Pattren5A {
	public static int pattern(int n,int m){
for (int i=1;i<=n;i++){
	for(int j=1;j<=i;j++){
		System.out.print("*");
	}
	System.out.println();
}
for(int i=1;i<=m;i++){
	for(int j=m;j>=i;j--){
		System.out.print("*");
	}
	System.out.println();
}
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Pattren5A.pattern(6,5);
}

}
