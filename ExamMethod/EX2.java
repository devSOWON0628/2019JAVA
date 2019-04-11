
public class EX2 {

	public static void main(String[] args) {
		System.out.println("8번");
		String sb2_1="mirim";
		int count=0;
		for(int i=0;i<sb2_1.length();i++){
			if(sb2_1.charAt(i)=='i')
			count++;
		}
		System.out.println("mirim 에 i는 "+count+"개");

		System.out.println("9번");
		StringBuffer sb1=new StringBuffer("java programming");
		StringBuffer sb2=new StringBuffer("project");
		StringBuffer str1=sb1.append(" Project");
		StringBuffer str2=sb1.append(sb2);
		System.out.println("sb1 = "+sb1);
		System.out.println("sb2 = "+sb2);
		System.out.println("str1 = "+str1);
		System.out.println("str2 = "+str2);
		
		System.out.println("10번");
		StringBuffer sb10_1=new StringBuffer("java programming");
		StringBuffer sb10_2=sb10_1.replace(0,4,"JAVA");
		System.out.println(sb10_2);
		
		System.out.println("11번");
		StringBuffer sb11_1=new StringBuffer("java programming");
		StringBuffer sb11_2=null;
		sb11_2=sb11_1.reverse();
		System.out.println(sb11_2);
		
		System.out.println("12번");
		StringBuffer sb12_1=new StringBuffer("java programming");
		String sb12_2=null;
		sb12_2=sb12_1.toString();
		System.out.println(sb12_2.toUpperCase());
		
	}

}
