//ÇÇº¸³ªÄ¡ Àç±Í
package class0321;

public class Ex3 {
   public static int count = 0;
   public static int fibonacci(int n) {
	   count++;
	   if (n==1 || n==2) 
		   return 1;
	   else
		   return fibonacci(n - 1) + fibonacci(n - 2);
   }

     public static void main(String args[]) {
       int a;
       
       a = fibonacci(5);

       System.out.println(a);
       System.out.println("½ÇÇàÈ½¼ö:" + count);
     }

}
