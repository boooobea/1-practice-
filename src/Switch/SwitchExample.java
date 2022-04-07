package Switch;

public class SwitchExample {
	public static void main(String[] args) {
		int from = 1;
		int to = 6;
		int num =((int)(Math.random()*(to-from+1)) + from);
		System.out.println("num ="+num);
		switch(num)	{
			case 1:
				System.out.println("1번이 나왔습니다.");
			case 2:
				System.out.println("2번이 나왔습니다.");
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			default :
				System.out.println("5, 6번이 나왔습니다.");
					
				
		}//switch
	}//main
}//end class
