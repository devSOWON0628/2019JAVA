package test;

public class hello {
	public static void main(String[] args) {
		
//		char escCode = 0x1B;
//		int row = 10; int column = 10;
//		System.out.print(String.format("%c[%d;%df",escCode,row,column));
//		
		boolean [][]answer= {
				{true,false,true,false,true},
				{false,true,true,true,false},
				{true,true,true,true,true},
				{false,true,true,true,false},
				{true,false,true,false,true}
				};
		
		int count=0;
		for(int i=0;i<answer.length;i++) {
			for(int j=0;j<answer.length;j++) {
				
				if(answer[i][j]==true) 
				{
					System.out.print("  ");
					count++;
					if(j==4&&answer[i][j]==true)System.out.print(count);
				}
				
				
				else 
				{
					if(count==0)continue;
					System.out.print(count);
					System.out.print(" ");
					count=0;
				}
				
				
				
			}
			count=0;
			System.out.println("");
			
		}
		
		
		
		
		
		
		}
		
	
	
	
		
	}

