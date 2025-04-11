package prj2;
import java.util.Scanner;
import java.util.Random;

public class game0 {

	public static void gameStart() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String restart;
		boolean isSuccess = true;

		while (true) {
			System.out.println("가위, 바위, 보 중에 입력하세요.");
			System.out.print("나:");
			String u = sc.next();

			int c = rd.nextInt(3);
			String computer;
			if (c == 0)
				computer = "가위";
			else if (c == 1)
				computer = "바위";
			else
				computer = "보";
			System.out.printf("철수: %s\n", computer);

			if (u.equals("가위")) {
				if (computer.equals("보")) {
					System.out.println("=> 당신이 이겼습니다.");

				} else if (computer.equals("바위")) {
					System.out.println("=> 당신이 졌습니다.");

				} else {
					System.out.println("=> 비겼습니다.");

				}
				while (true) {
					System.out.println("--------------------");
					System.out.println("게임재시작(y), 종료(n)");
					System.out.print("재시작여부를 입력하세요:");

					restart = sc.next();
					if (restart.equals("n")) {
						isSuccess = false;
						return;
					} else if (restart.equals("y")) {
						System.out.println("게임 재시작!");
						System.out.print("--------------------");
						break;
					} else
						System.out.println("잘못입력했습니다.");
					System.out.print("--------------------");
					sc.close();
				}
			}
			if (u.equals("바위")) {
				if (computer.equals("가위")) {
					System.out.println("=> 당신이 이겼습니다.");

				} else if (computer.equals("보")) {
					System.out.println("=> 당신이 졌습니다.");

				} else {
					System.out.println("=> 비겼습니다.");

				}

				while (true) {
					System.out.println("--------------------");
					System.out.println("게임재시작(y), 종료(n)");
					System.out.print("재시작여부를 입력하세요:");

					restart = sc.next();
					if (restart.equals("n")) {
						isSuccess = false;
						return;
					} else if (restart.equals("y")) {
						System.out.println("게임 재시작!");
						System.out.print("--------------------");
						break;
					} else
						System.out.println("잘못입력했습니다.");
					System.out.print("--------------------");
					sc.close();
				}
			}

			if (u.equals("보")) {
				if (computer.equals("바위")) {
					System.out.println("=> 당신이 이겼습니다.");

				} else if (computer.equals("가위")) {
					System.out.println("=> 당신이 졌습니다.");

				} else {
					System.out.println("=> 비겼습니다.");

				}
				while (true) {
					System.out.println("--------------------");
					System.out.println("게임재시작(y), 종료(n)");
					System.out.print("재시작여부를 입력하세요:");
					restart = sc.next();
					if (restart.equals("n")) {
						isSuccess = false;
						return;
					} else if (restart.equals("y")) {
						System.out.println("게임 재시작!");
						System.out.println("--------------------");
						break;
					} else
						System.out.println("잘못입력했습니다.");
					System.out.print("--------------------");
					sc.close();
				}

			}
		}

	}

	public static void main(String[] args) {
		gameStart();
	}
}
