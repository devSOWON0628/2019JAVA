import java.util.*;
public class EX4 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("17번");
		System.out.println(Math.abs(63));
		System.out.println(Math.abs(-63));
		System.out.println(Math.abs(63.5));
		System.out.println(Math.abs(-63.5));
		
		System.out.println("18번");
		System.out.println(Math.round(63));
		System.out.println(Math.round(-63));
		System.out.println(Math.round(63.5));
		System.out.println(Math.round(-63.5));
		
		System.out.println("19번");
		System.out.println(Math.pow(6, 3));
		System.out.println(Math.pow(6.0f, 3.0f));
		System.out.println(Math.pow(6.0, 3));
		System.out.println(Math.pow(-6.0, 3.0));
		
		System.out.println("20번");
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random()*5);
		System.out.println(Math.random()*5);
		System.out.println(Math.random()*10);
		System.out.println(Math.random()*100);
		
		System.out.println("21번");
		int target=((int)(Math.random()*100)+1);
		int i;
		System.out.println(target);
		int n;
		for(i=0;i<5;i++) {
			System.out.print("숫자입력(1~100)");
			n=sc.nextInt();
			if(n==target) {System.out.println("축하합니다");continue;}
			else if(n>target)System.out.println("너무 큽니다");
			else if(n<target)System.out.println("너무 작습니다");
		}
		
	}
}
