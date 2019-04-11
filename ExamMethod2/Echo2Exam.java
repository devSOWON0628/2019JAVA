import java.io.*;
public class Echo2Exam {
	public static void main(String ar[]) {
		InputStream is=System.in;
	try {
		while(true) {
			int i=is.read();
			if(i==-1)break;
			System.out.print((char)i);
		}
		}catch(IOException e) {
			e.printStackTrace();
		
	}
	
	}
}

