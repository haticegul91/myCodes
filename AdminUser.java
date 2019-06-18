package AbstarctExample;

public class AdminUser extends SlackUser{

boolean isOwner;

public AdminUser(int age, String name, boolean isOwner) {
	super(age, name);
	this.isOwner = isOwner;
}

@Override
public void sendMessage(String message) {
	System.out.println("Admin user send message :" + message);
	
}

	public void activateUser(String message) {
	System.out.println("activite user: " + message);	
	}
	
	public void deactivateUser(String name) {
		System.out.println("deactivite user" + name);
	}

	
}




