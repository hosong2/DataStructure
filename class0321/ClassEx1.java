package class0321;

class ObjectEx{
	private int a,b;	//private는 같은 클래스내에서만 유효, private가 없으면 같은 패키지내에서 다른 클래스에서도 사용가능
	
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
		ObjectEx obj1 = new ObjectEx(1, 2);	//new 뒤에 적는게 생성자
		ObjectEx obj2 = new ObjectEx(1);
		System.out.println(obj1);
	}
}
