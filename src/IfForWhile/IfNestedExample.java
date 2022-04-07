package IfForWhile;

public class IfNestedExample {
	public static void main(String[] args) {
		//Q.로또 번호 범위 내에서, 무작위 정수를 6개 추출하고 
		// 이 추출된 6개 번호가 아래 번호들과 일치해서, 1등인지 아닌지 판단하여 
		// 1등이면 1등, 아니면 꽝이라고 출력하시오.
		// 1등 당첨번호 : 12, 3, 7, 17, 23, 44
		// (1)변수는 몇개가 필요하고 타입은 무엇인가 
		// (2)추출된 6개의 번호를 어떻게 1등 번호와 비교하는지 
		// (3)만일 이전에 추출된 무작위 정수가 다시 나올경우 '복원추출' 같은숫자가 나오지 않는것을 '비복원추출' 
		
		int to = 45;
		int from = 1; 
		int num1 = ((int)(Math.random()*(to-from+1)) + from);
		int num2 = ((int)(Math.random()*(to-from+1)) + from);
		int num3 = ((int)(Math.random()*(to-from+1)) + from);
		int num4 = ((int)(Math.random()*(to-from+1)) + from);
		int num5 = ((int)(Math.random()*(to-from+1)) + from);
		int num6 = ((int)(Math.random()*(to-from+1)) + from);
		
		System.out.println("1등번호 : 12, 3, 7, 17, 23, 44");
		System.out.println("내 번호: "+num1+", "+num2+", "+num3+", "+num4+", "+num5+", "+num6);
				
		if((num1==12|num1==3|num1==7|num1==17|num1==23|num1==44)&
		   (num2==12|num2==3|num2==7|num2==17|num2==23|num2==44)&
		   (num3==12|num3==3|num3==7|num3==17|num3==23|num3==44)&
		   (num4==12|num4==3|num4==7|num4==17|num4==23|num4==44)&
		   (num5==12|num5==3|num5==7|num5==17|num5==23|num5==44)&
		   (num6==12|num6==3|num6==7|num6==17|num6==23|num6==44)) {
			System.out.println("1등");
		}else {
			System.out.println("꽝");
		}
	}//main
		
		
//		//81 ~ 100
//		int to = 100;
//		int from = 81;
//		int score = (int)(Math.random()*(to-from+1)) + from;
//		System.out.println("점수 :" + score);
//		
//		String grade;
//		
//		if(score>=90) {
//			
//			if(score>=95) {
//				grade = "A+";
//			}else {
//				grade = "A";
//			}//if-else
//			
//		} else {
//			
//			if(score>=85) {
//				grade = "B+";
//			}else {
//				grade = "B";
//			}//if-else
//		}//if-else if-else 
//		
//		System.out.println("학점: "+grade);
//	}//main

}//class
