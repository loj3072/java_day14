package edu.skku.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		File f=new File("data.txt");
		// ������ �����, ������ ���. if(!f.exists()) return; 
		FileOutputStream fos=new FileOutputStream(f); //8��Ʈ�� ���Ͽ� ����
		OutputStreamWriter osw=new OutputStreamWriter(fos);//16��Ʈ�� 8��Ʈ�� �ٲ�
		BufferedWriter bw=new BufferedWriter(osw); //�ӵ����� �ذ��ϱ� ���� buffer�� ����
		bw.write("Hello~~~~");
		bw.write("�ȳ��ϼ���");
		bw.write("�ݰ����ϴ�"); //�ٹٲ��� �����Ƿ� ���ٿ� �� ���� �� \n
		bw.close();
		osw.close();
		fos.close();
	}

}
