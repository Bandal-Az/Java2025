package Ex3;
public class MonthSchedule {
	Day day[] = new Day[30];

	public MonthSchedule() {
		System.out.println("이번달 스케쥴 관리 프로그램.");
		for (int i = 0; i < day.length; i++) {
			day[i] = new Day();

		}
	}

	public void input(int a, String b) {
		day[a].set(b);
	}

	public void view(int a) {
		System.out.println( a + "일의 할 일은 " + day[a].get());
	}

	public void finish() {
		System.out.println("프로그램을 종료합니다.");
	}

	public void run() {
		System.out.println("할일(입력:1, 보기:2, 끝내기:3) >>");
	}

}

