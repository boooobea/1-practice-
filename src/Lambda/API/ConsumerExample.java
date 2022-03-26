package Lambda.API;

import java.util.function.ObjIntConsumer;


//Consumer
public class ConsumerExample {
/*<T,U>객체, (int, double, long)값을 데이터로 받아 사용*/
	public static void main(String[] args) {
		
//		-- void accept(T t);
		
//		Consumer<String> consumer = t -> System.out.println(t + "8");
//		consumer.accept("java");
		

//		---void accept(T t, U u);
		
//		BiConsumer<String, String> biconsumer = (t, u) -> System.out.println( t + u);
//		biconsumer.accept("java", "8");
		

//		---void accept(double value);
		
//		DoubleConsumer doubleconsumer = d -> System.out.println("java" + d);
//		doubleconsumer.accept(8.0);
		

//		---void accept(T t, int value);
		ObjIntConsumer<String> objintconsumer = (t, i)->System.out.println(t + i);
		objintconsumer.accept("java", 8);
		
	}//main
	
	
}//end class
