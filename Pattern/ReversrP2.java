package Pattern;

public class ReversrP2 {
	public static int pattern(int n){
for(int i=1;i<=n;i++){
	for(int j=n;j>=i;j--){
		System.out.print("*");
	}
	System.out.println( );
}
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReversrP2.pattern(5);		//for calling static method
		ReversrP2 obj=new ReversrP2();		//Creating obj for non static method
	int	n=obj.pattern(6);
		
	}

}
