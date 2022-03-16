import java.io.*;  
import java.util.Scanner;
import java.util.ArrayList;  

public class SrSch {
	
	//counter ints for points
	private int AC; //adventure calls 1
	private int BY; //be your own boss 2
	private int BC; //business clubs 3
	private int CD; //college decisions 4
	private int CO; //community organizing 5
	private int CS; //community service 6
	private int CC; //conquering concrete jungle 7
	private int CEI; //co-ops and engineering internships 8
	private int EMT; //emt 9 
	private int GL; //greek life 10 
	private int MI; //making an impact 11
	private int OCR; //on campus recruiting 12
	private int MA; //martial arts 13
	private int EI; //engineering internships 14 
	private int RP; //right path 15
	private int CCE; //competitive college environment 16
	private int IP; //interning in publishing 17 
	private int RE; //research 18 
	
	public void choices(ArrayList students){
		//array list to add every element into for presenters
		ArrayList<Integer> c = new ArrayList<Integer>();
		
		//parsing a CSV file into Scanner class constructor  
		Scanner sc = new Scanner(new File("SrChoices - Sheet1.csv"));  
		sc.useDelimiter(",");   //sets the delimiter pattern  
		
		while (sc.hasNext())  //returns a boolean value  
			{  
			//System.out.print(sc.next());  //find and returns the next complete token from this scanner  
			c.add(sc.next()); //adding tokens into arraylist
			//System.out.print(x.toString()); 
			} 
		  
		sc.close();  //closes the scanner  
	}
	
	public SrSch(){ 
		//construct the schedule 
	}
}
