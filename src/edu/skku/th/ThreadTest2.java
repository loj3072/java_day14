package edu.skku.th;

public class ThreadTest2 {

	public static void main(String[] args) {
		Thread t = new Thread(new Work());//���⼭ �̹� �˹ٻ��� �ΰ� ����. �˹ٻ��� ���� ����� ���� �ƴ϶� �� �ϸ� �˷��ָ� ��. t�� �� ���� Work()�� ������ �˷���. Work()�� ���ʺ��� ��ӹ޾���
		t.start();
		//t.run();//�˹ٻ��� �θ��� �� �ƴ϶� ���� ���� ���� �˹ٻ��� ���� �ϰ� ���� ���̹Ƿ� ���� �ؼ��� �� ��.
		System.out.println("main...."); //���� ���� �������� ��.
	}

}
class Work implements Runnable{ //��ӹ��� �ʾƵ� �Ǵµ�, �ƹ� �͵� ��ӹ��� ������ ���� Ŭ�������� �� �� �����ϱ�. //���ʺ�: interface. �������� ����. run()�� ����.
	public void run() {//���ʺ��� run()�޼ҵ� �������̵�.
		System.out.println("alba...");
	}
}