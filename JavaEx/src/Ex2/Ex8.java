package Ex2;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int a[];
	      int n;
	      
	      System.out.print("정수 몇개? >> ");
	      n = sc.nextInt();
	      
	      a = new int[n];
	      for(int i=0; i<a.length; i++) {
	         int tmp = (int)(Math.random()*100+1);
	         int c = 0;
	         for(int j=0; j<a.length; j++) {
	        	 if(tmp == a[j]) {
	        		 c=1;
	        		 break;
	        	 }
	         }
	         if(c == 1) {
	        	 i--;
	        	 continue;
	         }
	         a[i] = tmp;
	      }
	      
	      for(int i=0; i<a.length; i++) {
	         if(i%10 == 0 && i != 0) System.out.println();
	         System.out.print(a[i] + " ");
	      }
	      sc.close();
	   }
	}
