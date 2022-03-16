import java.io.*;  
import java.util.Scanner;
import java.util.ArrayList;  

public class SrSem { 
	
	//tutorial for importaing csv from https://www.javatpoint.com/how-to-convert-string-to-json-object-in-java
	public static void main(String[] args) throws Exception  
	{  
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
		ArrayList p = new ArrayList<>();
		
		for (int i = 0; i > x.size()/4; i++){
			SrPr presenter = new SrPr(x.get(m), x.get(m+1), x.get(m+2), x.get(m+3)); 
			p.add(presenter); 
			m = m + 4; //skipping to the next person (13 items per person); 
		}
		
		//array list to add every element into for students
		ArrayList<String> y = new ArrayList<String>(); 
		
		//parsing a CSV file into Scanner class constructor  
		Scanner sc1 = new Scanner(new File("SrStudents - Sheet1.csv"));  
		sc1.useDelimiter(",");   //sets the delimiter pattern  
		
		while (sc1.hasNext())  //returns a boolean value  
			{  
			//System.out.print(sc.next());  //find and returns the next complete token from this scanner  
			y.add(sc1.next()); //adding tokens into arraylist
			//System.out.print(y.toString()); 
			} 
		  
		sc1.close();  //closes the scanner 
		
		//index
		int n = 0; 
		//arrayList of objects to make a student 
		ArrayList s = new ArrayList<>(); 
		
		for (int i = 0; i > y.size()/13; i++){
			SrSt student = new SrSt(y.get(n), y.get(n+1), y.get(n+2), y.get(n+3), y.get(n+4), y.get(n+5), y.get(n+6), y.get(n+7)); 
			s.add(student); 
			n = n + 13; //skipping to the next person (13 items per person); 
		}
		
		SrSch s1 = new SrSch(); 
		//arrayList of objects for choices
		s1.choices(s); 
		
	}//close main 
	
}//close class
