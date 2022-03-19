import java.io.*;  
import java.util.Scanner;
import java.util.ArrayList;  

//* indicates a tracing line

public class SrSem { 
	
	//tutorial for importaing csv from https://www.javatpoint.com/how-to-convert-string-to-json-object-in-java
	public static void main(String[] args) throws Exception  
	{  
	//create schedule
	SrSch s1 = new SrSch(); 
	
	//STUDENTS//
	
		//array list to add every element into for students
		ArrayList<String> y = new ArrayList<String>(); 

		//parsing a CSV file into Scanner class constructor  
		Scanner sc1 = new Scanner(new File("SrStudents - Sheet1.csv")); 
		 
		/*
		 * was downloading the csv poorly,
		 * causing there to not be a comma between the last # of a student and the email of the next student
		 * thus messing up my code because the indexes were wrong
		 * had this problem for 40 min class and we decided to scrap my original
		 * because we thoughtthe data was corrupted
		 * but i figured it out after i had index errors again with a new csv
		 * same problem in the presenter csv list; fixed
		*/
		
		sc1.useDelimiter(",");   //sets the delimiter pattern  
		
		while (sc1.hasNext())  //returns a boolean value  
			{  
			//*System.out.print(sc.next());  //find and returns the next complete token from this scanner  
			y.add(sc1.next()); //adding tokens into arraylist
			//*System.out.print(y.toString()); 
			} 
		  
		sc1.close();  //closes the scanner 
		
		//making student objects 
		
		//index
		int n = 0; 
		//arrayList of objects to make a student 
		ArrayList s = new ArrayList<>(); 
		
		//arrayLists for each choice #
		ArrayList<Integer> choice1 = new ArrayList<Integer>(); 
		ArrayList<Integer> choice2 = new ArrayList<Integer>();
		ArrayList<Integer> choice3 = new ArrayList<Integer>();
		ArrayList<Integer> choice4 = new ArrayList<Integer>();
		ArrayList<Integer> choice5 = new ArrayList<Integer>();
		
		for (int i = 0; i < y.size()/8; i++){
			//making student 
			//*System.out.print(y.get(n)); 
			SrSt student = new SrSt(y.get(n), y.get(n+1), y.get(n+2), y.get(n+3), y.get(n+4), y.get(n+5), y.get(n+6), y.get(n+7)); 
			s.add(student);
			
			//*student.getEmail();  
			
			//adding each of their choices to the arrayList of choices
			choice1.add(student.getC1()); 
			choice2.add(student.getC2()); 
			choice3.add(student.getC3()); 
			choice4.add(student.getC4()); 
			choice5.add(student.getC5()); 
			
			n = n + 8; //skipping to the next person (13 items per person); 
		}
		
	
		//*System.out.print(s); 
		//*System.out.print(choice1.toString()); 
		
		//calculating priorty of seminars
		s1.choices(choice1, choice2, choice3, choice4, choice5);
		s1.priority();

		/* 
		 * s1.presenters arraylists weren't populating
		 * mistake in my order; s1.priority must come before s1.presenters
		 * students must come before s1.priority
		 * so students must become presenters
		 * 
		 * */
		 
		//PRESENTERS// 
	
		//array list to add every element into for presenters
		ArrayList<String> x = new ArrayList<String>();
		
		//parsing a CSV file into Scanner class constructor  
		Scanner sc = new Scanner(new File("SrPresenter - Sheet1.csv"));  
		sc.useDelimiter(",");   //sets the delimiter pattern  
		
		while (sc.hasNext())  //returns a boolean value  
			{  
			//System.out.print(sc.next());  //find and returns the next complete token from this scanner  
			x.add(sc.next()); //adding tokens into arraylist
			//System.out.print(x.toString()); 
			} 
		  
		sc.close();  //closes the scanner  
		
		//index
		int m = 0; 
		//ArrayList of Presenters
		ArrayList p = new ArrayList<>();
		
		for (int i = 0; i < x.size()/4; i++){
			
			SrPr p1 = new SrPr(x.get(m), x.get(m+1), x.get(m+2), x.get(m+3)); 
			p.add(p1); 
			
			//*System.out.println(p1.getSemID()); 
			//*System.out.println(p1.getID()); 
			
			s1.presenters(p1.getSemID(), p1.getID()); 
			
			m = m + 4; //skipping to the next person (4 items per person); 
		}
			
		s1.schedule(); 
		
	}//close main 
	
}//close class
