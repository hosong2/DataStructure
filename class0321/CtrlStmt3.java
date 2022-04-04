//홀수출력 제어문
package class0321;

public class CtrlStmt3 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i%2==1)
				System.out.print(i + "  ");
		}
		System.out.println();
		for (int i = 1; i < 10; i+=2) {
			System.out.print(i + "  ");
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			if(i%2==0)
				continue;
			System.out.print(i + "  ");
		}
		System.out.println();
		int i = 1;
		while(i<10) {
			if(i%2==0) {
				i++;
				continue;
			}
			System.out.print(i + "  ");
			i++;
		}
	}
}
