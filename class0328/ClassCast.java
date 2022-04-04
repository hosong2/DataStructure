package class0328;

class SuperCls{
	int a;
	void print() {
		System.out.println("I'm super class");
	}
}
class SubCls extends SuperCls{
	int b;
	void printSub() {
		System.out.println("I'm sub class");
	}
}

public class ClassCast {
	public static void Opp(Object ooo) {
		SuperCls sup = (SuperCls) ooo;
		SubCls sub = (SubCls) ooo;
	}
	
	public static void main(String[] args) {
		SuperCls sup = new SuperCls();
		SubCls sub = new SubCls();
		SuperCls sss = new SubCls();
		SubCls ssub = (SubCls)sss;	// 부모 = 자식  // 자식 = (Cast)부모
		Object obj1 = new Object();
		Object obj2 = new SuperCls();
		Opp(obj1); Opp(sup); Opp(sub);
		}
}
