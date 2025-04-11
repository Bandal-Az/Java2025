package Ex2;
import java.util.Random;
import java.util.Scanner;
import java.lang.IllegalStateException;

public class Ex16 {
	public static void gameStart() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String restart;

		while (true) {
			System.out.println("가위 바위 보!>> ");
			System.out.print("사용자:");
			String u = sc.next();
			if (!u.equals("가위") && !u.equals("바위") && !u.equals("보")) {
				System.out.println("잘못입력했습니다. 다시 입력해주세요!");
				continue;
			}
			int c = rd.nextInt(3);
			String computer;
			if (c == 0)
				computer = "가위";
			else if (c == 1)
				computer = "바위";
			else
				computer = "보";
			System.out.printf("컴퓨터: %s\n", computer);

			if (u.equals("가위"))
				if (computer.equals("보"))
					System.out.println("=> 당신이 이겼습니다.");
				else if (computer.equals("바위"))
					System.out.println("=> 당신이 졌습니다.");
				else
					System.out.println("=> 비겼습니다.");
			else if (u.equals("바위"))
				if (computer.equals("가위"))
					System.out.println("=> 당신이 이겼습니다.");
				else if (computer.equals("보"))
					System.out.println("=> 당신이 졌습니다.");
				else
					System.out.println("=> 비겼습니다.");
			else if (u.equals("보"))
				if (computer.equals("바위"))
					System.out.println("=> 당신이 이겼습니다.");
				else if (computer.equals("가위"))
					System.out.println("=> 당신이 졌습니다.");
				else
					System.out.println("=> 비겼습니다.");
			while (true) {
				System.out.println("--------------------");
				System.out.println("게임재시작(y), 종료(n)");
				System.out.print("재시작여부를 입력하세요:");
				try {
					restart = sc.next();
					if (restart.equals("n")) {
						System.out.println("게임을 종료합니다...");
						System.out.print("--------------------");
						return;
					} else if (restart.equals("y")) {
						System.out.println("게임 재시작!");
						System.out.println("--------------------");
						break;
					} else {
						System.out.println("잘못입력했습니다.");
						System.out.println("--------------------");
					}
				} catch (IllegalStateException e) {
					sc.next();
					sc.close();
					continue;
				}
			}
		}
	}

	public static void main(String[] args) {
		gameStart();
	}
}
