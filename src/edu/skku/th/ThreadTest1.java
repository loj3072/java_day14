package edu.skku.th;

public class ThreadTest1 {

	public static void main(String[] args) {
		Thread t = new Alba();
		t.setPriority(9);
		t.start();//ó������ �� ������ ������ alba�� �����ٸ��ϴ� ���� main�� ���ư��� ����.
		//t.run();//�˹ٻ��� �θ��� �� �ƴ϶� ���� ���� ���� �˹ٻ��� ���� �ϰ� ���� ���̹Ƿ� ���� �ؼ��� �� ��.
		System.out.println("main...."); //���� ���� �������� ��.
		System.out.println("main...."); 
		System.out.println("main...."); 
		System.out.println("main...."); 
		System.out.println("main...."); 
	}

}
class Alba extends Thread{ //main�� �� ���� ���Ƽ� �˹ٻ�~~
	public void run() {
		System.out.println("alba...");
	}
}
