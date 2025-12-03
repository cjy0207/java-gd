package sec02.exam02;

public class Message {

	public String Command; //메시지를 어떻개 처리 할 것인가
	public String to; //누구에세 보냘지
	
	public Message(String command, String to) {
		super();
		Command = command;
		this.to = to;
	}
	
	
	
}
