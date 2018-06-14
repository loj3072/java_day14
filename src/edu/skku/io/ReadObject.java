package edu.skku.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f=new File("data.ob");
		FileInputStream fis=new FileInputStream(f); //node. ���(��)
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		ObjectInputStream ois2=new ObjectInputStream(
							   new FileInputStream(
							   new File("data.ob"))); //���� �� ���̶� ���� ���
		
		System.out.println(ois.readObject()); //readObject�� ���� Ÿ��: object/ object.toString()�ؼ� �Ҹ�. object�� �ٸ� ����� ���� �ʹٸ� �� Ŭ������ ����ȯ�ؾ� ��.
		System.out.println(ois.readObject());
		
		ois.close();
		fis.close();
	}

}