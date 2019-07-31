import java.io.*;
public class Echo1Exam {
	public static void main(String ar[]) {
		int bt;
		try {
			bt=System.in.read();
			System.out.println((char)bt);
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
