import java.io.*;
public class BufferedExam {
	public static void main(String ar[]) {
		BufferedInputStream bi=new BufferedInputStream(System.in);
		BufferedOutputStream bo=new BufferedOutputStream(System.out);
		int aa;
		try {
			while((aa=bi.read())!=-1) {
			bo=write(aa);
			}bo.flush();
		} catch (IOException ie) {
			// TODO: handle exception
		}
	}

	private static BufferedOutputStream write(int aa) {
		// TODO Auto-generated method stub
		return null;
	}
}
