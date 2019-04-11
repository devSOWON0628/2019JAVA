
public class ExceptionExam {
	public static void main(String[] args) {
		try {
			int data[]=new int[] {10,20,30,40,50};
			for(int i=0;i<data.length;i++)
			System.out.println("data["+i+"]="+data[i]);
		} catch (NullPointerException ne) {
			System.out.println("ne. toString():"+ne.toString());
		} catch (Exception e) {
			System.out.println("위 경우 이외의 에러 처리");
		}
	}

}
