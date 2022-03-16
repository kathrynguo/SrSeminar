import java.io.*;  
import java.util.Scanner;
import java.util.ArrayList;  

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
}
