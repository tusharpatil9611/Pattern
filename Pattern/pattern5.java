package Pattern;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,m=4;
for(int i=1;i<=n;i++){
	for(int j=1;j<=i;j++){
		System.out.print("*");
		
	}
	System.out.println();
}
for(int i=1;i<=n;i++){
	for(int j=m;j>=i;j--){
		System.out.print("*");
	}
	System.out.println();
}
	}

}
