package prj2;
import java.util.Scanner;
import java.util.Random;
public class game {

	public static void gameStart() {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		boolean isSuccess = false;
		String restart;	
		
		System.out.println("Up & Down게임 입니다. 숨겨진 수를 맞추어 보세요.");
		
		while(true) {
			int c = random.nextInt(100) +1;
			//System.out.println("컴퓨터가 생성한 난수: + c");
			for (int i =1; i <= 10; i++) {
				System.out.print("1~100까지의 숫자를 입력하세요:");
				int u = scanner.nextInt();
				
				if(c < u) {
					System.out.println("Down, 더 낮은 숫자입니다.");
				}
				else if(u < c) {
					System.out.println("Up, 더 높은 숫자입니다.");
				}
				else {
					System.out.println("정답입이다.");
					isSuccess = true;
					break;
				}
			}
			if(isSuccess == false) {
				System.out.println("실패");
			}
			while(true) {
				System.out.println("게임재시작(y), 종료(n)");
				System.out.print("재시작여부를 입력하세요:");
				restart = scanner.next();
				if (restart.equals("n")) {
					return;
				} 
				else if(restart.equals("y")) {
					System.out.println("게임 재시작!");
					break;
				}
				else 
					System.out.println("잘못입력했습니다.");
					scanner.close();
			}
			
		}
	}
	public static void main(String[] args) {
		
		gameStart();		
	
	}
}