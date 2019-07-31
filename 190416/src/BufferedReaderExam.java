import java.io.*;
public class BufferedReaderExam {
	public static void main(String ar[]) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String aa=br.readLine();
			System.out.println();
		} catch (IOException ie) {
			
		}
	}
}
