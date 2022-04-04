package class0321;

public class ValueReference {
	public static void SampleAccess(int[] B, int n) {
		n++;
		B[n] = 8;
	}
	public static void main(String[] args) {
		int[] A = new int[10];
		A[5] = 7;
		int k = 5;
		for (int i : A) {
			System.out.print(i + "  ");
		}
		System.out.println();
		// call by value(����ȣ��) - ���� ����
		// call by reference(����ȣ��)  - �ּҸ� ���� 
		SampleAccess(A,k);	//A�� �ּҸ�, k�� ���� ����
		for (int i : A) {
			System.out.print(i + "  ");
		}
		System.out.println();
		System.out.println(k);
	}
}
