import java.io.*;
import java.util.*;

public class eg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		File dest = new File("eg.txt"); 
		try {
			FileWriter fw = new FileWriter(dest);
		while(true) {
			System.out.print("name PhoneNumber>>");
			String line = sc.nextLine();
			fw.write(line); 
			if(line.equals("그만"))break;	
			fw.write("\n");
		}
		sc.close();
		fw.close();
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
		System.out.println("eg.txt에 저장되었습니다.");
}
}