package prj5;

interface Phoneinterface {
	final int TIMEOUT = 10000;

	void sendCall();

	void receiveCall();

	default void printLogo() {
		System.out.println("** Phone **");
	}
}
