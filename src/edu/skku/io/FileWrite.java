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
		// 없으면 만들고, 있으면 덮어씀. if(!f.exists()) return; 
		FileOutputStream fos=new FileOutputStream(f); //8비트씩 파일에 저장
		OutputStreamWriter osw=new OutputStreamWriter(fos);//16비트를 8비트로 바꿈
		BufferedWriter bw=new BufferedWriter(osw); //속도차를 해결하기 위해 buffer에 담음
		bw.write("Hello~~~~");
		bw.write("안녕하세요");
		bw.write("반갑습니다"); //줄바꿈이 없으므로 한줄에 쭉 나올 것 \n
		bw.close();
		osw.close();
		fos.close();
	}

}
