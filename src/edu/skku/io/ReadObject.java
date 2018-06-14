package edu.skku.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f=new File("data.ob");
		FileInputStream fis=new FileInputStream(f); //node. 노드(빵)
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		ObjectInputStream ois2=new ObjectInputStream(
							   new FileInputStream(
							   new File("data.ob"))); //위에 세 줄이랑 같은 얘기
		
		System.out.println(ois.readObject()); //readObject의 리턴 타입: object/ object.toString()해서 불림. object의 다른 기능을 쓰고 싶다면 그 클래스로 형변환해야 함.
		System.out.println(ois.readObject());
		
		ois.close();
		fis.close();
	}

}