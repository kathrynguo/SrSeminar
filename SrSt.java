import java.io.*;  
import java.util.Scanner;
import java.util.ArrayList;  

public class SrSt {
	
	private String em; 
	private String fn; 
	private String ln; 
	private int c1; 
	private int c2; 
	private int c3; 
	private int c4; 
	private int c5; 
	
	public SrSt(String email, String firstName, String lastName, String choice1, String choice2, String choice3, String choice4, String choice5) {
		em = email; 
		fn = firstName; 
		ln = lastName; 
		c1 = Integer.valueOf(choice1); 
		c2 = Integer.valueOf(choice2); 
		c3 = Integer.valueOf(choice3); 
		c4 = Integer.valueOf(choice4); 
		c5 = Integer.valueOf(choice5); 
	}

}
