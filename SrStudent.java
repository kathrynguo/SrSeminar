//organizing students
import java.util.ArrayList; 

public class SrStudent { 
	
	private String c1; 
	//private int c1ID; 
	private String c1ID; 
	
	private String c2; 
	//private int c2ID; 
	private String c2ID;
	
	private String c3; 
	//private int c3ID;
	private String c3ID; 
	
	private String c4; 
	//private int c4ID;
	private String c4ID; 
	
	private String c5; 
	//private int c5ID; 
	private String c5ID;
	
	private String em; 
	private String fn; 
	private String ln; 
	
	public SrStudent(String email, String firstName, String lastName, String choice1, String choice1ID, String choice2, String choice2ID, String choice3, String choice3ID, String choice4, String choice4ID, String choice5, String choice5ID) {
		em = email; 
		fn = firstName; 
		ln = lastName; 
		
		c1 = choice1; 
		//c1ID = Integer.parseInt(choice1ID); 
		c1ID = choice1ID; 
		
		c2 = choice2; 
		//c2ID = Integer.parseInt(choice2ID); 
		c2ID = choice2ID; 
		
		c3 = choice3; 
		//c3ID = Integer.parseInt(choice3ID); 
		c3ID = choice3ID; 
		
		c4 = choice4; 
		//c4ID = Integer.parseInt(choice4ID);
		c4ID = choice4ID; 
		
		c5 = choice5; 
		//c5ID = Integer.parseInt(choice5ID);
		c5ID = choice5ID; 
		
	}
	
	public void printStudent () {
		String name = fn + " " + ln; 
		System.out.println(em + ", " + name + "\n"); 
		System.out.println(c1 + " " + c1ID); 
		System.out.println(c2 + " " + c2ID); 
		System.out.println(c3 + " " + c3ID); 
		System.out.println(c4 + " " + c4ID); 
		System.out.println(c5 + " " + c5ID); 
		System.out.println("\n"); 
	}
}
