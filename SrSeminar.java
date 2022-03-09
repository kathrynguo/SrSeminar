/*importing csv, creating people, adding to array*/
//rpints the location which is not good  

import java.io.*;  
import java.util.Scanner;
import java.util.ArrayList;   

public class SrSeminar {
	 
	//tutorial for importaing csv from https://www.javatpoint.com/how-to-convert-string-to-json-object-in-java
	public static void main(String[] args) throws Exception  
	{  
		//array list to add every element into
		ArrayList<String> x = new ArrayList<String>();
		
		//parsing a CSV file into Scanner class constructor  
		Scanner sc = new Scanner(new File("SrSeminar_RawData - SrSeminar_RawData.csv"));  
		sc.useDelimiter(",");   //sets the delimiter pattern  
		
		while (sc.hasNext())  //returns a boolean value  
			{  
			//System.out.print(sc.next());  //find and returns the next complete token from this scanner  
			x.add(sc.next()); //adding tokens into arraylist
			System.out.print(x.toString()); 
			} 
		  
		sc.close();  //closes the scanner  
		
		//removing empty elements 
		while (x.contains("")) {
			int a = x.indexOf(""); 
			x.remove(a); 
		}
		//System.out.println(x); //prints ArrayList
		
		
		//assuming the first appearance of the seminar is at index 3, given format of csvs is the same 
		String firstSeminar = x.get(3); 
		
		//making arrayList to be put in SrStudent class 
		//ArrayList<String> y = new ArrayList<String>(x.subList(0, x.lastIndexOf(firstSeminar))); //lastIndexOf(first seminar) is the first time it is tied toa presenter instead of a student 
		ArrayList srSt = new ArrayList<>(); //arrayList of Student objects
		
		//for loop of making student objects and adding them to list srSt
		int stInd = 0; //student index for adding objects
			for (int i = 0; i < x.size()/13; i++){ //13 is the number of elements per student
				SrStudent st = new SrStudent(x.get(stInd), x.get(stInd + 1), x.get(stInd + 2), x.get(stInd + 3), x.get(stInd + 4), x.get(stInd + 5), x.get(stInd + 6), x.get(stInd + 7), x.get(stInd + 8), x.get(stInd + 9), x.get(stInd + 10), x.get(stInd + 11), x.get(stInd + 12)); 
				st.printStudent(); 
				stInd = stInd + 12; //increase by 13, going to the next student //12 = 9, 13 = trevor, skips the email 
				System.out.println(stInd); 
				System.out.println(x.get(stInd)); 
				srSt.add(st); //add to the student array  
			}
		//System.out.println(srSt); 
		
		/*
		//making arrayList to be put in SrPresenter class
		ArrayList<String> z = new ArrayList<String>(x.subList(x.lastIndexOf(firstSeminar), x.size())); //have to add 1 to the first part of the substring? 
		ArrayList srPr = new ArrayList<>(); //arrayList of presenter objects
		//for loop of making presenter objects and addinf them to list srPr
		int prInd = 0; //presenter index for adding objects
		//System.out.println(z.get(prInd) + "CHECKING");
			for (int i = 0; i < z.size()/4; i++) {
				SrPresenter pr = new SrPresenter(z.get(prInd), z.get(prInd + 1), z.get(prInd + 2), z.get(prInd + 3)); 
				prInd = prInd + 4; 
				srPr.add(pr); 
			}
		//System.out.println(srPr); 
		* */
		
	}//close main 
	  
}//close class
