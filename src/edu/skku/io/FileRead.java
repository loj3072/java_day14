package edu.skku.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) throws IOException {
		File f=new File("data.txt");//����. �ؽ�Ʈ. ���Ͽ� ���� ����
		if(!f.exists()) return; //������ �������� ������ �޼��� ����. ����ó��
		FileInputStream fis=new FileInputStream(f); //8��Ʈ�� ����
		InputStreamReader isr=new InputStreamReader(fis);//16��Ʈ�� �ٲ�
		BufferedReader br=new BufferedReader(isr); //�ӵ����� �ذ��ϱ� ���� buffer�� ����
		System.out.println(br.readLine());
		br.close();
		isr.close();
		fis.close();
		
		//FileInputStream, InputStreamReader, BufferedReader �� �׻� ���� ��� �ϴϱ� ��� ������ ���� Scanner.
		Scanner s=new Scanner(f);//�˰��� ������ Ǯ �� 0.5������ �� �ɸ�.
		System.out.println(s.nextLine());
		s.close();
		
	}

}

