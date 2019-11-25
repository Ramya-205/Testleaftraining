package day1.classroom;

public class Mobile {
 
	public void call (String name) {
		System.err.println(" name is "+ name);
	}
	public String getsms() {
		System.out.println("get sms");
		return "msg";
	}
	public Boolean shutdown() {
		System.out.println("browser closed");
		return true;
	}
	
	public static void main(String[] args) {
		Mobile phone = new Mobile(); 
		phone.call("xxx");
		String getsms = phone.getsms();
		System.out.println(getsms);
		phone.shutdown();
		
	}
		
}
