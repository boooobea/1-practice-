package collection.StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		//대표적인 Message Q: IBM Webshapere MQ, ActiveMQ, RabbitMQ 
		Queue<Message> mq = new LinkedList<Message>();
		
		mq.add(new Message("sendMail","홍길동"));
		mq.add(new Message("sendSMS", "신용권"));
		mq.add(new Message("sendkakaotalk","홍두께"));
		
		System.out.println(mq);
		
//		---
		
		while(!mq.isEmpty()){
			Message message = mq.poll();
			
			switch(message.command) {
				case"sendMail" :{ 
					System.out.println(message.to+"님께 메일을 보냅니다.");
					break;}
				case"sendSMS" :{
					System.out.println(message.to+"님께 SMS를 보냅니다.");
					break;}
				case"sendkakaotalk" :{
					System.out.println(message.to+"님께 카톡을 보냅니다.");
				}
			}//switch
		}//while
		
//		---
		
		while(!mq.isEmpty()) {
			Message message = mq.poll();
			switch(message.command) {
			case "sendMail" -> System.out.println(message.to+"님께 보냅니다.");
			case "sendSMS" -> System.out.println(message.to+"님께 SMS를 보냅니다.");
			case "sendkakaotalk" -> System.out.println(message.to+"님께 카톡을 보냅니다.");
			}//switch
		}//while 
		
//		---
		while(!mq.isEmpty()) {
			Message message = mq.poll();
			String command = switch(message.command) {
			
				case "sendMail","sendSMS"  -> 	{ yield message.command; }
				default -> 						{ yield message.command;}
			
			};//switch
			System.out.println(command);
		}//while 
		
		
	}//main
}//end class
