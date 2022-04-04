package class0321;

class ObjectEx{
	private int a,b;	//private�� ���� Ŭ������������ ��ȿ, private�� ������ ���� ��Ű�������� �ٸ� Ŭ���������� ��밡��
	
	public ObjectEx(int a) {
		super();
		this.a = a;
	}

	public ObjectEx(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "ObjectEx (a=" + a + ", b=" + b + ")";
	}

}

public class ClassEx1 {
	public static void main(String[] args) {
		ObjectEx obj1 = new ObjectEx(1, 2);	//new �ڿ� ���°� ������
		ObjectEx obj2 = new ObjectEx(1);
		System.out.println(obj1);
	}
}
