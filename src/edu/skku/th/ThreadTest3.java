package edu.skku.th;

public class ThreadTest3 {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() { //Test2의 new Work() 대신 이런 표현도 됨! ※Runnable을 구현
			public void run() {
				System.out.println("alba...");
			}
		});//여기서 이미 알바생을 두고 있음. 알바생을 새로 만드는 것이 아니라 할 일만 알려주면 됨. t의 할 일이 Work()에 있음을 알려줌. Work()는 러너블을 상속받았음
		t.start();
		//t.run();//알바생을 부르는 게 아니라 내가 직접 가서 알바생의 일을 하고 오는 것이므로 절대 해서는 안 됨.
		System.out.println("main...."); //누가 먼저 찍힐지는 모름.
	}

}
//class Work implements Runnable{ //상속받지 않아도 되는데, 아무 것도 상속받지 않으면 무슨 클래스인지 알 수 없으니까. //러너블: interface. 구현되지 않음. run()만 있음.
//	public void run() {//러너블의 run()메소드 오버라이딩.
//		System.out.println("alba...");
//	}
//}
