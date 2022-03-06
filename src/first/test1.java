package first;

public class test1 {
//		동굴의 깊이는 100미터입니다.
//		하루동안 열심히 올라가면, 20미터를 올라갑니다.
//		자는동안에는 5미터를 다시 미끄러져 내려갑니다.
		
//		1) 동굴에서 빠져 나올려면, 몇일이 걸리는가?
//		기준값 : 동굴(100미터), 하루동안 올라가는 거리(20미터), 미끄러지는거리(5미터)
//		: 몇일에 걸쳐 올라갔는데, 내가 동굴에서 빠져나왔는지/아닌지를 어떻게 판단하는지?
//             m표기? 동굴100미터? 
//		: 만일 딱 100미터 올라왔다고 할때, 이거리를 동굴을 빠져나왔다고 생각할 수 있는지? 
		
	public static void main(String[] args) {
		int high = 20; 	//하루동안 올라가는 거리(20미터)
		int day=1; 		//일수  
		int down = 5;	//미끄러지는거리(5미터)
		for(high=20; high<=100; high-=down) {
			System.out.println(day+"일째 : "+high+"m");
			day++;
			high+=20;
			if(high>100) {
				System.out.println(day+"일째 : "+high+"m, 탈출성공!");
				break;
			
			}//if
		}//for
		
//		----
		
		while(high<=100) {
			System.out.println(day + "일째 :");
			System.out.println(high + "m");
			
			day++;
			high-=down;
			high+=20;
			
			if(high>100) {
				System.out.println(day+"일째: "+high+"m 탈출성공");
				break;
			}//if
		}//while
}//main
}//end class

