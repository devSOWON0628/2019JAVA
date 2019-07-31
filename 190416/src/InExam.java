import java.io.*;
public class InExam {
	public static void main(String ar[]) {
		String a="", b="";
		int sum=0;
		float average=0;
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the string(정수)");
			a=in.readLine();
			System.out.println("Enter the string(정수)");
			b=in.readLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Your input is"+a+" ,"+b);
		int c=Integer.parseInt(a);
		int d=Integer.parseInt(b);
		sum=c+d;
		average=(float)sum/2;
		System.out.println(a+"+"+b+"="+sum);
		System.out.println("평균 = "+average);
	}
}
