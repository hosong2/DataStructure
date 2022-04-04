package class0314;
//재귀 구조 - 등차수열
public class DataType{
	public static int count = 0;

	  public static void main(String args[]) {
	    int n = 5;

	    System.out.println(seq(n));
	    System.out.println("실행횟수:" + count);
	  }

	  public static int seq(int n) {
	    count++;
	    if (n == 1) {
	      return 1;
	    }
	    else
	    	return seq(n-1) + 3;
	  }
}
