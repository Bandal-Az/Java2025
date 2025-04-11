package prj5;

class SmartPhone extends Calc implements Phoneinterface{
	
	public void sendCall() {
		System.out.println("따르릉따르릉~~");
	}
	public void receiveCall() {
		System.out.println("전화 왔어요.");
	}
	public void schedule() {
		System.out.println("일정을 관리합니다.");
	}

}
