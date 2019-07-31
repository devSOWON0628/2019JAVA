import java.io.*;
public class Xcho2Exam {
	public static void main(String ar[]) {
		int bt;
		try {
			while((bt=System.in.read())!=-1)
				System.out.print((char)bt);
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
