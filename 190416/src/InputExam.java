import java.io.*;
public class InputExam {
	public static void streamTest(InputStream is) {
		try {
			while(true) {
				int i=is.read();
				if(i==-1)break;
				char c=(char)i;
				System.out.print(c);
			}
		} catch (IOException e) {
			System.err.print(e);
		}
		System.out.println();
	}
	public static void main(String ar[]) {
		streamTest(System.in);
	}
}
