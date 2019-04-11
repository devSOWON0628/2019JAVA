package myTest;

public class WhitePagesObj {
	
	String name;
	String TelNum;
	
	WhitePagesObj(){}
	
	public WhitePagesObj(String name, String TelNum){
		this.name=name;
		this.TelNum=TelNum;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTelNum() {
		return TelNum;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setTelNum(String TelNum) {
		this.TelNum=TelNum;
	}
	
	public String toString() {
		return "["+name+"]"+TelNum;
	}

}
