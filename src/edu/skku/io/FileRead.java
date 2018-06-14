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
		File f=new File("data.txt");//글자. 텍스트. 파일에 대한 정의
		if(!f.exists()) return; //파일이 존재하지 않으면 메서드 종료. 예외처리
		FileInputStream fis=new FileInputStream(f); //8비트씩 읽음
		InputStreamReader isr=new InputStreamReader(fis);//16비트로 바꿈
		BufferedReader br=new BufferedReader(isr); //속도차를 해결하기 위해 buffer에 담음
		System.out.println(br.readLine());
		br.close();
		isr.close();
		fis.close();
		
		//FileInputStream, InputStreamReader, BufferedReader 를 항상 같이 써야 하니까 묶어서 구현한 것이 Scanner.
		Scanner s=new Scanner(f);//알고리즘 문제를 풀 때 0.5초정도 더 걸림.
		System.out.println(s.nextLine());
		s.close();
		
	}

}

