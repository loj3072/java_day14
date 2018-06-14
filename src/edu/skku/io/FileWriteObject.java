package edu.skku.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileWriteObject {

	public static void main(String[] args) throws IOException { //객체로 읽고 쓰기
		File f=new File("data.ob");
		FileOutputStream fos=new FileOutputStream(f); //노드(빵)은 항상 있어야 함
		ObjectOutputStream oos=new ObjectOutputStream(fos);//글자의 경우 16비트로 바꾸는 게 필요하지만 오브젝트니까 ObjectOutputStream만 씌우면 됨
		oos.writeObject("안녕하세요"); //String이라는 객체를 출력
		oos.writeObject("반갑습니다");
		//oos.writeObject(new Car()); //객체를 담을 수도 있음
		//oos.writeObject(new Customer());
		oos.close();
		fos.close();
		//실행하면 아무것도 안 보이지만 day14를 클릭하고 f5를 누르면 data.ob가 생긴 것을 확인할 수 있다.
		
		//중요!!!!
		//보안 상의 문제로 "implements java.io.Serializable" 표시가 있는 클래스의 객체들만 메모리 밖, 네트워크 밖으로 나갈 수 있다. (클래스 f3 눌러서 확인가능) (포장이사라고 생각하면 간단)
		//Externalizable : 직접 포장하고 푸는 법까지 코딩해야 함.
		//oos.writeObject(new Car()); //객체를 담을 수도 있음
		//oos.writeObject(new Customer());
		//new Car, new Customer한다고 나갈 수 있는게 아니라, 이 클래스들이 implements java.io.Serializable 해야 나갈 수 있다.
	}

}
