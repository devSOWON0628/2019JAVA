package myTest;

import java.util.ArrayList;
import java.util.*;

public class MainWhitePages {
	
	
	ArrayList<WhitePagesObj> whitePageList = new ArrayList<WhitePagesObj>();
	
	public MainWhitePages() {
		whitePageList.add(new WhitePagesObj("hello", "010-0000-0000"));
	}
	
	public void show() {
		System.out.println("\n============ 전화번호부   ===========");
        System.out.println("=======================총 "+whitePageList.size()+"명");
        for(WhitePagesObj item : whitePageList ){
            System.out.println(item);
        }
        System.out.println("==========================END");
	}
	
	public void AddWhitePages() {
		Scanner sc=new Scanner(System.in);
		System.out.println("추가 할 사람의 이름을 입력해주세요.");
		String name=sc.nextLine();
		System.out.println("추가 할 사람의 전화번호를 입력해주세요.");
		String TelNum=sc.nextLine();
		
		boolean check=false;
		for(WhitePagesObj item: whitePageList) {
			if((item.getTelNum().equals(TelNum))){
				System.out.println("이미 있는 전화번호 입니다.");
				check=true;
				break;
			}
		}
		
		if(!(check)) {whitePageList.add(new WhitePagesObj(name, TelNum));
		System.out.println("전화번호가 저장되었습니다.");
		}
		
		
		
	}
	
	public void RemoveWhitePages() {
		
	}
	
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		
		MainWhitePages whitepage = new MainWhitePages();
		
		System.out.println("무엇을 도와드릴까요?");
		int what;
		while(true){
			System.out.println("================================");
			System.out.println("1.전화번호부 출력");
			System.out.println("2.전화번호 추가");
			System.out.println("3.전화번호 삭제");
			System.out.println("4.종료");
			what=sc.nextInt();
			switch(what){
			case 1:
				whitepage.show();
				break;
				
			case 2:
				whitepage.AddWhitePages();
				break;
				
			case 3:
				whitepage.RemoveWhitePages();
				break;
				
			case 4:
				System.out.println("전화번호부를 종료합니다");
				System.exit(0);
				break;
				
			}
		}
		
	}
	

}

