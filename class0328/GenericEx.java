package class0328;

class GenericTest<T>{
	T a;
	T print() {
		T temp = null;
		
		return temp;
	}
}

public class GenericEx {
	public static void main(String[] args) {
		GenericTest<Integer> g = new GenericTest<Integer>();
		GenericTest<String> g2 = new GenericTest<String>();
		GenericTest<Double> g3 = new GenericTest<Double>();
		g.a = 1;
		g.print();
	}
}
