package edu.skku.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileWriteObject {

	public static void main(String[] args) throws IOException { //��ü�� �а� ����
		File f=new File("data.ob");
		FileOutputStream fos=new FileOutputStream(f); //���(��)�� �׻� �־�� ��
		ObjectOutputStream oos=new ObjectOutputStream(fos);//������ ��� 16��Ʈ�� �ٲٴ� �� �ʿ������� ������Ʈ�ϱ� ObjectOutputStream�� ����� ��
		oos.writeObject("�ȳ��ϼ���"); //String�̶�� ��ü�� ���
		oos.writeObject("�ݰ����ϴ�");
		//oos.writeObject(new Car()); //��ü�� ���� ���� ����
		//oos.writeObject(new Customer());
		oos.close();
		fos.close();
		//�����ϸ� �ƹ��͵� �� �������� day14�� Ŭ���ϰ� f5�� ������ data.ob�� ���� ���� Ȯ���� �� �ִ�.
		
		//�߿�!!!!
		//���� ���� ������ "implements java.io.Serializable" ǥ�ð� �ִ� Ŭ������ ��ü�鸸 �޸� ��, ��Ʈ��ũ ������ ���� �� �ִ�. (Ŭ���� f3 ������ Ȯ�ΰ���) (�����̻��� �����ϸ� ����)
		//Externalizable : ���� �����ϰ� Ǫ�� ������ �ڵ��ؾ� ��.
		//oos.writeObject(new Car()); //��ü�� ���� ���� ����
		//oos.writeObject(new Customer());
		//new Car, new Customer�Ѵٰ� ���� �� �ִ°� �ƴ϶�, �� Ŭ�������� implements java.io.Serializable �ؾ� ���� �� �ִ�.
	}

}
