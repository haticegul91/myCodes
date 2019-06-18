package AbstarctExample;

public class MainRunner {
	
public static void main(String[] args) {
	
	//SlackUser s1 = new SlackUser(); we cannot create an
	//object from abstract class
	
	RegularUser r1 = new RegularUser(28, "Hatice", 1);
	System.out.println(r1.age);// we can access the abstarct 
	//class' fields to use sub class' object
	
	System.out.println(r1.name);
	System.out.println(r1.groupNumber);
	//System.out.println(groupNumber); if the group number
	//would static we can dirtectly , write like this.
	
	r1.sendMessage("I can do it");
	r1.joinAGroup();
	
	
	AdminUser a1 = new AdminUser(36,"Jennet", true);
	
	System.out.println(a1.isOwner);
	System.out.println(a1.age);//extended
a1.activateUser("Such a user");
a1.deactivateUser("gul");
a1.sendMessage("yayy");

}


}
