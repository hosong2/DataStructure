package class0321;

public class Ex2 {
	static int count = 0;
	public static int seq(int n) {
		count++;
		if (n==1)
			return 1;
		else
			return seq(n-1) + 3;
	}
	public static void main(String[] args) {		
		
	}
}
