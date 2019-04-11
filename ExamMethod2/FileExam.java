import java.io.*;
public class FileExam {
	public static void main(String ar[]) {
		try {
			FileReader fr=new FileReader("datar.txt");
			FileWriter fw=new FileWriter("dataw.txt");
			int c;
			
			while((c=fr.read())!=-1) {
				fw.write(c);
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
	}
	
	
	
}
