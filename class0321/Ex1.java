package class0321;

public class Ex1 {
	static int count = 0;
	public static int seq(int n) {
		count++;
		if (n==0)
			return 0;
		else
			return 5*seq(n-1) + 3;
	}
	public static void main(String[] args) {		
		int a;
		
		a = seq(5);
		System.out.println(a);
	}
}
