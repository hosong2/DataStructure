package class0314;
public class DataType2 {
	 public static int count = 0;
	 
	public static void main (String [] args) {
       
		
        hanoi(5, 'A', 'B', 'C');
        System.out.println("����Ƚ��:" + count);
}
public static void hanoi(int i, char from, char mid, char to){
       count++;
        if(i==1){
                System.out.println(i + "���� " + from + "���� " + to);
        }else{
                hanoi(i-1, from, to, mid);
                System.out.println(i + "���� " + from + "���� " + to);
                hanoi(i-1, mid, from, to);
        }
}
}
