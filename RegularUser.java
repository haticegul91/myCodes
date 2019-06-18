package AbstarctExample;

public class RegularUser extends SlackUser {

//int age;
//String name;
	int groupNumber;
	public RegularUser(int age, String name,int groupNumber) {
		super(age, name);
		this.groupNumber= groupNumber;
	}

	
	public void joinAGroup() {
		
	}
	

	public void sendMessage (String message) {
		System.out.println("Regular user send message " + message);
	}
	
}
