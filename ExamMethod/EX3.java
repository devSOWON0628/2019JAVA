
public class EX3 {
	public static void main(String ar[]) {
		System.out.println(("13번"));
		Integer in1=new Integer(100);
		Integer in2=new Integer(100);
		Integer in3=new Integer(200);
		System.out.println("in1.equals(in2)-->"+in1.equals(in2));
		System.out.println("in1.equals(in3)-->"+in1.equals(in3));
		
		System.out.println(("14번"));
		Integer wrapi=new Integer(100);
		Double wrapd=new Double(55.7);
		int i=100;
		double d=55.7;
		double di=i+d;
		System.out.println(i+d);
		System.out.println(di);
		System.out.println(Integer.toString(i)+Double.toString(d));
		System.out.println(wrapi.toString()+wrapd.toString());
		
		System.out.println("15번");
		String stri="123456",strd="123.56";
		System.out.println(Integer.valueOf(stri));
		System.out.println(Double.valueOf(strd));
		System.out.println((Integer.valueOf(stri))+Double.valueOf(strd));
		
		System.out.println("16번");
		String a="10",b="20";
		System.out.println("a+b="+Integer.valueOf(a)+Integer.valueOf(b));
		float ave=Integer.valueOf(a)+Integer.valueOf(b);
		System.out.println("a+b의 평균="+ave/2);
	
		
	}
}
