
public class EX1 {

	public static void main(String[] args) { 
		System.out.println("1번");
		String strData1="I LOVE MIRIM MEISTER";
		
		System.out.println(strData1.length());
		
		System.out.println("2번");
		String str="I LOVE MIRIM MEISTER";
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println("");
		
		System.out.println("3번");
		String R1="JAVA",R2="JAVA",R3="java";
		
		System.out.println("R1==R2-->"+(R1==R2));
		System.out.println("R1.equalsR2-->"+(R1.equals(R2)));
		System.out.println("R1==R3-->"+(R1==R2));
		System.out.println("R1.equalsR2-->"+(R1.equals(R3)));
		
		System.out.println("4번");
		char ch='A';
		String StrData1="A";
		String StrData2;
		StrData2=String.valueOf(ch);
		if(StrData1.equals(StrData2))System.out.println("같음");
		else System.out.println("다름");
		
		System.out.println("5번");
		String StrData5_1=" I LOVE MIRIM MEISTER ",StrData5_2;
		StrData5_2=StrData5_1.trim();
		if(StrData5_1.equals(StrData5_2))System.out.println("두 변수의 데이터가 같습니다");
		else System.out.println("두 변수의 데이터가 다릅디다");
		
		System.out.println("6번");
		String StrData6_1="I LOVE MIRIM MEISTER",StrData6_2;
		StrData6_2=StrData6_1.substring(7,12);
		System.out.println("StrData6_2의 데이터 : "+StrData6_2);
		
		System.out.println("7번");
		String StrData7_1="I LOVE MIRIM MEISTER",StrData7_2;
		StrData7_2=StrData7_1.substring(2,5);
		System.out.println("StrData7_2의 데이터 : "+StrData7_2);
		
		
	}

}
