package Ex3;

public class ArrayUtil {
	public static int [] concat(int[] a, int[] b) {
		int s = a.length + b.length;
		int concat[] = new int[s];
		for(int i = 0; i < a.length; i++) {
			concat[i] = a[i];
		}
		for(int i = 0; i<b.length; i++) {
			concat[i + a.length] = b[i];
		}
		return concat;
				
	}
	public static void print(int[] a) {
		System.out.print("[");
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		
	}

}
