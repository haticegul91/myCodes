package AbstarctExample;

public abstract class SlackUser {

int age;
String name;

public SlackUser(int age, String name) {    //constructr with 2 args
	this.age=age;
	this.name=name;
	
}
public abstract void sendMessage(String message);
//abstract method only exist in abstract class and interface	
	
	
	
	
	
}
