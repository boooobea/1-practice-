package IfForWhile;

public class BreakOutterExample {

	public static void main(String[] args) throws Exception{
		
		Outter: for(char upper='A'; upper<='Z'; upper++) {
					for(char lower='a'; lower<='z'; lower++) {
						System.out.println(upper + "-" + lower);
						
						if(lower =='g') {
							break Outter; // outter이름을 가진 반복문을 벗어난다. 
//							break; //if문만 벗어난다 
						}//if
					}//inner-for
		}//outer-for
		System.out.println("실행종료");
	}//main
}//end class
