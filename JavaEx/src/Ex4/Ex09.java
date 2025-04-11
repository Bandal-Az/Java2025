package Ex4;
import java.util.Scanner;
public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringStack s =new StringStack();
		while(true) {
			System.out.print("문자열 입력 >> ");
			String S = sc.next();
			if(S.equals("그만")) {
				break;
			}
			else if(s.push(S)) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
				continue;
			}
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : " );
//		System.out.print("스택에 저장된 모든 문자열 팝 : " + s.pop() + " ");
//		System.out.print("스택에 저장된 모든 문자열 팝 : " + s.pop() + " ");
//		System.out.print("스택에 저장된 모든 문자열 팝 : " + s.pop() + " ");
		for(int i = 0; i < s.capacity(); i++) {
			System.out.print(s.pop() + " ");
		}
		sc.close();
	}

}
