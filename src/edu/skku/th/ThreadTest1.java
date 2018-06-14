package edu.skku.th;

public class ThreadTest1 {

	public static void main(String[] args) {
		Thread t = new Alba();
		t.setPriority(9);
		t.start();//처음부터 못 들어오는 이유는 alba를 스케줄링하는 동안 main이 돌아가기 때문.
		//t.run();//알바생을 부르는 게 아니라 내가 직접 가서 알바생의 일을 하고 오는 것이므로 절대 해서는 안 됨.
		System.out.println("main...."); //누가 먼저 찍힐지는 모름.
		System.out.println("main...."); 
		System.out.println("main...."); 
		System.out.println("main...."); 
		System.out.println("main...."); 
	}

}
class Alba extends Thread{ //main이 할 일이 많아서 알바생~~
	public void run() {
		System.out.println("alba...");
	}
}
