import java.io.*;  
import java.util.Scanner;
import java.util.ArrayList;  

//* indicates a tracing line

public class SrPr {
	
	private String sem; 
	private int semID; 
	private String n; 
	private int nID; 
	
	public SrPr(String seminar, String seminarID, String name, String nameID){
		sem = seminar; 
		semID = Integer.valueOf(seminarID); 
		n = name; 
		nID = Integer.valueOf(nameID); 
	}
	
	//get methods for each item 
	public String getSeminar() {
		return sem; 
	}
	
	public int getSemID() {
		return semID; 
	}
	
	public String getName(){
		return n; 
	}
	
	public int getID(){
		return nID; 
	}
	
	/*
	 * found better method
	 * 
	//ArrayList to associate presenter with their seminar
	public ArrayList<Integer> getPresenter() {
		ArrayList<Integer> pr = new ArrayList<Integer>(); 
		pr.add(semID); 
		pr.add(nID); 
		System.out.println(pr); 
		return pr; 
		
	}
	*/
	
}//close class
