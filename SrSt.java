import java.io.*;  
import java.util.Scanner;
import java.util.ArrayList;  

//* indicates a tracing line

public class SrSt {
	
	private String em; 
	private String fn; 
	private String ln; 
	private int c1; 
	private int c2; 
	private int c3; 
	private int c4; 
	private int c5;
	private int ID;  
	
	//converting values to proper types
	public SrSt(String email, String firstName, String lastName, String choice1, String choice2, String choice3, String choice4, String choice5, int stuID) {
		em = email; 
		fn = firstName; 
		ln = lastName; 
		c1 = Integer.valueOf(choice1); 
		c2 = Integer.valueOf(choice2); 
		c3 = Integer.valueOf(choice3); 
		c4 = Integer.valueOf(choice4); 
		c5 = Integer.valueOf(choice5); 
		ID = stuID; 
		//*System.out.println("NEW STUDENT"); 
	}
	
	//get methods
	public String getEmail() {
		return em; 
	}
	
	public String getName() {
		return fn + " " + ln; 
	}
	
	public int getID() { 
		return ID; 
	}
	
	public int getC1() { 
		return c1; 
	}
	
	public int getC2() { 
		return c2; 
	} 
	
	public int getC3() { 
		return c3; 
	} 
	
	public int getC4() { 
		return c4; 
	} 
	
	public int getC5() { 
		return c5; 
	} 
	
	//arrayList for individual student schedule
	private	ArrayList<Integer> stuSchedule = new ArrayList<Integer>();
		
	public void stuSchedule(ArrayList<Integer> s1, ArrayList<Integer> s2, ArrayList<Integer> s3, ArrayList<Integer> s4, ArrayList<Integer> s5) {

		//scheduling session 1 
		//student: check choice 1, if available, assign 
		if (s1.contains(c1)) {
			stuSchedule.add(c1); 
			//if = 0, can't assign (doesn't match) 
			//remove that choice from their options (set = to 0) 
			//if = 0, can't assign (doesn't match)
			c1 = 0; 
		} 
		else if (s1.contains(c2)) { //move on and check next if previous doesn't match
			stuSchedule.add(c2); 
			c2 = 0; 
		}
		else if (s1.contains(c3)) { //move on and check next if previous doesn't match
			stuSchedule.add(c3); 
			c3 = 0; 
		}
		else if (s1.contains(c4)) { //move on and check next if previous doesn't match
			stuSchedule.add(c4); 
			c4 = 0; 
		}
		else if (s1.contains(c5)) { //move on and check next if previous doesn't match
			stuSchedule.add(c5); 
			c5 = 0; 
		}
		else { //if set doesn't have any of their choices, assign to last room 
			stuSchedule.add(s1.get(5)); 
		}
		
		//repeat for the next 4 time slots
		if (s2.contains(c1)) {
			stuSchedule.add(c1); 
			//if = 0, can't assign (doesn't match) 
			//remove that choice from their options (set = to 0) 
			//if = 0, can't assign (doesn't match)
			c1 = 0; 
		} 
		else if (s2.contains(c2)) { //move on and check next if previous doesn't match
			stuSchedule.add(c2); 
			c2 = 0; 
		}
		else if (s2.contains(c3)) { //move on and check next if previous doesn't match
			stuSchedule.add(c3); 
			c3 = 0; 
		}
		else if (s2.contains(c4)) { //move on and check next if previous doesn't match
			stuSchedule.add(c4); 
			c4 = 0; 
		}
		else if (s2.contains(c5)) { //move on and check next if previous doesn't match
			stuSchedule.add(c5); 
			c5 = 0; 
		}
		else { //if set doesn't have any of their choices, assign to last
			stuSchedule.add(s2.get(5)); 
		}
		
		//time slot 3
		if (s1.contains(c1)) {
			stuSchedule.add(c1); 
			//if = 0, can't assign (doesn't match) 
			//remove that choice from their options (set = to 0) 
			//if = 0, can't assign (doesn't match)
			c1 = 0; 
		} 
		else if (s3.contains(c2)) { //move on and check next if previous doesn't match
			stuSchedule.add(c2); 
			c2 = 0; 
		}
		else if (s3.contains(c3)) { //move on and check next if previous doesn't match
			stuSchedule.add(c3); 
			c3 = 0; 
		}
		else if (s3.contains(c4)) { //move on and check next if previous doesn't match
			stuSchedule.add(c4); 
			c4 = 0; 
		}
		else if (s3.contains(c5)) { //move on and check next if previous doesn't match
			stuSchedule.add(c5); 
			c5 = 0; 
		}
		else { //if set doesn't have any of their choices, assign to last
			stuSchedule.add(s3.get(5)); 
		}
		
		//time slot 4
		if (s4.contains(c1)) {
			stuSchedule.add(c1); 
			//if = 0, can't assign (doesn't match) 
			//remove that choice from their options (set = to 0) 
			//if = 0, can't assign (doesn't match)
			c1 = 0; 
		} 
		else if (s4.contains(c2)) { //move on and check next if previous doesn't match
			stuSchedule.add(c2); 
			c2 = 0; 
		}
		else if (s4.contains(c3)) { //move on and check next if previous doesn't match
			stuSchedule.add(c3); 
			c3 = 0; 
		}
		else if (s4.contains(c4)) { //move on and check next if previous doesn't match
			stuSchedule.add(c4); 
			c4 = 0; 
		}
		else if (s4.contains(c5)) { //move on and check next if previous doesn't match
			stuSchedule.add(c5); 
			c5 = 0; 
		}
		else { //if set doesn't have any of their choices, assign to 2nd last (second last bc 4 and 1 are the same)
			stuSchedule.add(s4.get(4)); 
		}
		
		//time slot 5
		if (s5.contains(c1)) {
			stuSchedule.add(c1); 
			//if = 0, can't assign (doesn't match) 
			//remove that choice from their options (set = to 0) 
			//if = 0, can't assign (doesn't match)
			c1 = 0; 
		} 
		else if (s5.contains(c2)) { //move on and check next if previous doesn't match
			stuSchedule.add(c2); 
			c2 = 0; 
		}
		else if (s5.contains(c3)) { //move on and check next if previous doesn't match
			stuSchedule.add(c3); 
			c3 = 0; 
		}
		else if (s5.contains(c4)) { //move on and check next if previous doesn't match
			stuSchedule.add(c4); 
			c4 = 0; 
		}
		else if (s5.contains(c5)) { //move on and check next if previous doesn't match
			stuSchedule.add(c5); 
			c5 = 0; 
		}
		else { //if set doesn't have any of their choices, assign to 2nd last (2nd last bc 2 and 5 are the same); 
			stuSchedule.add(s5.get(4)); 
		}
	}//close stuSchedule
	
	public void getStudentSchedule() {
		System.out.print( ln + ", " + fn + " - " + ID+ " "); 
		System.out.println(stuSchedule); 
		//System.out.println("\n"); 
	}
}
