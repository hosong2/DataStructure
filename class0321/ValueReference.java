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
		// call by value(복사호출) - 값을 전달
		// call by reference(참조호출)  - 주소를 전달 
		SampleAccess(A,k);	//A는 주소를, k는 값을 전달
		for (int i : A) {
			System.out.print(i + "  ");
		}
		System.out.println();
		System.out.println(k);
	}
}
