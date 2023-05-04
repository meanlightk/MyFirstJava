package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		// Queue 컬렉션 생성
		Queue<Message> messsageQueue = new LinkedList<>();

		// 메세지 넣기
		messsageQueue.offer(new Message("sendMail", "홍길동"));
		messsageQueue.offer(new Message("sendMs", "신용권"));
		messsageQueue.offer(new Message("sendKakaotalk", "감자바"));

		// 메세지를 하나씩 꺼내어 처리
		while (!messsageQueue.isEmpty()) {		// 비어있지 않다면 반복
			Message message = messsageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냈습니다.");
				break;
			case "sendMs":
				System.out.println(message.to + "님에게 SNS를 보냈습니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카카오톡을 보냈습니다.");
				break;

			}
		}

	}

}
