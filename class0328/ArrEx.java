package class0328;

import java.util.Scanner;

public class ArrEx {
	public static void ArrDel(int[] arr1, int idx) {
		int i;
		for (i = idx; i < arr1.length-1; i++) {
			arr1[i] = arr1[i+1];
		}
		arr1[i] = 0;
	}
	public static void ArrIns(int[] arr2, int idx, int val) {
		int i;
		for (i = arr2.length-1; i > idx; i--) {
			arr2[i] = arr2[i-1];
		}
		arr2[idx] = val;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] a = {10,20,30,40,50};
		int index, value;
		// int[] a = new int[5];
		// int[] b;
		// b = new int[50];
//		System.out.println("������ index ��ȣ �Է� : ");
		System.out.print("삽입할 index 번호 입력 : ");
		index = scn.nextInt();
		System.out.print("삽입할 value 입력 : ");
		value = scn.nextInt();
		
		ArrIns(a, index, value);
//		ArrDel(a, index);
		
//		System.out.print("5���� ���� �Է� : ");
//		for (int i = 0; i < a.length; i++) {
//			a[i] = scn.nextInt();
//		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		scn.close();
	}
}
