package class0314;
//��� ���� - ��������
public class DataType{
	public static int count = 0;

	  public static void main(String args[]) {
	    int n = 5;

	    System.out.println(seq(n));
	    System.out.println("����Ƚ��:" + count);
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
