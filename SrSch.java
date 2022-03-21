import java.io.*;  
import java.util.Scanner;
import java.util.ArrayList; 

//* indicates a tracing line 

public class SrSch {
	
	public SrSch(){ 
		//construct the schedule 
	}
	
	//counter ints for points
	private int AC=0; //adventure calls 1
		private int acID = 1; 
	private int BY=0; //be your own boss 2
		private int byID = 2; 
	private int BC=0; //business clubs 3
		private int bcID = 3; 
	private int CD=0; //college decisions 4
		private int cdID = 4; 
	private int CO=0; //community organizing 5
		private int coID = 5; 
	private int CS=0; //community service 6
		private int csID = 6; 
	private int CC=0; //conquering concrete jungle 7
		private int ccID = 7;  
	private int CEI=0; //co-ops and engineering internships 8
		private int ceiID = 8;  
	private int EMT=0; //emt 9 
		private int emtID = 9; 
	private int GL=0; //greek life 10 
		private int glID = 10; 
	private int MI=0; //making an impact 11
		private int miID = 11; 
	private int OCR=0; //on campus recruiting 12
		private int ocrID = 12; 
	private int MA=0; //martial arts 13
		private int maID = 13; 
	private int EI=0; //engineering internships 14 
		private int eiID = 14; 
	private int RP=0; //right path 15
		private int rpID = 15; 
	private int CCE=0; //competitive college environment 16
		private int cceID = 16; 
	private int IP=0; //interning in publishing 17 
		private int ipID = 17; 
	private int RE=0; //research 18 
		private int reID = 18; 
		
	//top 12 and bottom 6, to be used in 'priority' method 
	ArrayList<Integer> t12 = new ArrayList<Integer>(); 
	ArrayList<Integer> b6 = new ArrayList<Integer>(); 
		ArrayList<ArrayList<Integer>> t121 = new ArrayList<ArrayList<Integer>>(); 
		ArrayList<ArrayList<Integer>> b61 = new ArrayList<ArrayList<Integer>>();  
		
	//public void choices(ArrayList students){
		//had another arraylist of a choices.csv here, but found a better method 
	//}
	
	public void choices(ArrayList<Integer> choice1, ArrayList<Integer> choice2, ArrayList<Integer> choice3, ArrayList<Integer> choice4, ArrayList<Integer> choice5){
		
		//add 5 points to that seminar if it is a first choice 
		for (int i = 0; i < choice1.size(); i++) {
			if (choice1.get(i) == 1) {
				AC = AC + 5; 
			}
			else if (choice1.get(i) == 2) {
				BY = BY + 5; 
			}
			else if (choice1.get(i) == 3) {
				BC = BC + 5; 
			}
			else if (choice1.get(i) == 4) {
				CD = CD + 5; 
			}
			else if (choice1.get(i) == 5) {
				CO = CO + 5; 
			}
			else if (choice1.get(i) == 6) {
				CS = CD + 5; 
			}
			else if (choice1.get(i) == 7) {
				CC = CC + 5; 
			}
			else if (choice1.get(i) == 8) {
				CEI = CEI + 5; 
			}
			else if (choice1.get(i) == 9) {
				EMT = EMT + 5; 
			}
			else if (choice1.get(i) == 10) {
				GL = GL+ 5; 
			}
			else if (choice1.get(i) == 11) {
				MI = MI + 5; 
			}
			else if (choice1.get(i) == 12) {
				OCR = OCR + 5; 
			}
			else if (choice1.get(i) == 13) {
				MA = MA + 5; 
			}
			else if (choice1.get(i) == 14) {
				EI = EI + 5; 
			}
			else if (choice1.get(i) == 15) {
				RP = RP + 5; 
			}
			else if (choice1.get(i) == 16) {
				CCE = CCE + 5; 
			}
			else if (choice1.get(i) == 17) {
				IP = IP + 5; 
			}
			else if (choice1.get(i) == 18) {
				RE = RE + 5; 
			}
		
		}
		
		//add 4 points to that seminar if it is a 2nd choice 
		for (int i = 0; i < choice2.size(); i++) {
			if (choice1.get(i) == 1) {
				AC = AC + 4; 
			}
			else if (choice1.get(i) == 2) {
				BY = BY + 4; 
			}
			else if (choice1.get(i) == 3) {
				BC = BC + 4; 
			}
			else if (choice1.get(i) == 4) {
				CD = CD + 4; 
			}
			else if (choice1.get(i) == 5) {
				CO = CO + 4; 
			}
			else if (choice1.get(i) == 6) {
				CS = CD + 4; 
			}
			else if (choice1.get(i) == 7) {
				CC = CC + 4; 
			}
			else if (choice1.get(i) == 8) {
				CEI = CEI + 4; 
			}
			else if (choice1.get(i) == 9) {
				EMT = EMT + 4; 
			}
			else if (choice1.get(i) == 10) {
				GL = GL + 4; 
			}
			else if (choice1.get(i) == 11) {
				MI = MI + 4; 
			}
			else if (choice1.get(i) == 12) {
				OCR = OCR + 4; 
			}
			else if (choice1.get(i) == 13) {
				MA = MA + 4; 
			}
			else if (choice1.get(i) == 14) {
				EI = EI + 4; 
			}
			else if (choice1.get(i) == 15) {
				RP = RP + 4; 
			}
			else if (choice1.get(i) == 16) {
				CCE = CCE + 4; 
			}
			else if (choice1.get(i) == 17) {
				IP = IP + 4; 
			}
			else if (choice1.get(i) == 18) {
				RE = RE + 4; 
			}
		
		}
		
		//add 3 points to that seminar if it is a 3rd choice 
		for (int i = 0; i < choice3.size(); i++) {
			if (choice1.get(i) == 1) {
				AC = AC + 3; 
			}
			else if (choice1.get(i) == 2) {
				BY = BY + 3; 
			}
			else if (choice1.get(i) == 3) {
				BC = BC + 3; 
			}
			else if (choice1.get(i) == 4) {
				CD = CD + 3; 
			}
			else if (choice1.get(i) == 5) {
				CO = CO + 3; 
			}
			else if (choice1.get(i) == 6) {
				CS = CD + 3; 
			}
			else if (choice1.get(i) == 7) {
				CC = CC + 3; 
			}
			else if (choice1.get(i) == 8) {
				CEI = CEI + 3; 
			}
			else if (choice1.get(i) == 9) {
				EMT = EMT + 3; 
			}
			else if (choice1.get(i) == 10) {
				GL = GL+ 3; 
			}
			else if (choice1.get(i) == 11) {
				MI = MI + 3; 
			}
			else if (choice1.get(i) == 12) {
				OCR = OCR + 3; 
			}
			else if (choice1.get(i) == 13) {
				MA = MA + 3; 
			}
			else if (choice1.get(i) == 14) {
				EI = EI + 3; 
			}
			else if (choice1.get(i) == 15) {
				RP = RP + 3; 
			}
			else if (choice1.get(i) == 16) {
				CCE = CCE + 3; 
			}
			else if (choice1.get(i) == 17) {
				IP = IP + 3; 
			}
			else if (choice1.get(i) == 18) {
				RE = RE + 3; 
			}
		
		}
		
		//add 2 points to that seminar if it is a 4th choice 
		for (int i = 0; i < choice4.size(); i++) {
			if (choice1.get(i) == 1) {
				AC = AC + 2; 
			}
			else if (choice1.get(i) == 2) {
				BY = BY + 2; 
			}
			else if (choice1.get(i) == 3) {
				BC = BC + 2; 
			}
			else if (choice1.get(i) == 4) {
				CD = CD + 2; 
			}
			else if (choice1.get(i) == 5) {
				CO = CO + 2; 
			}
			else if (choice1.get(i) == 6) {
				CS = CD + 2; 
			}
			else if (choice1.get(i) == 7) {
				CC = CC + 2; 
			}
			else if (choice1.get(i) == 8) {
				CEI = CEI + 2; 
			}
			else if (choice1.get(i) == 9) {
				EMT = EMT + 2; 
			}
			else if (choice1.get(i) == 10) {
				GL = GL + 2; 
			}
			else if (choice1.get(i) == 11) {
				MI = MI + 2; 
			}
			else if (choice1.get(i) == 12) {
				OCR = OCR + 2; 
			}
			else if (choice1.get(i) == 13) {
				MA = MA + 2; 
			}
			else if (choice1.get(i) == 14) {
				EI = EI + 2; 
			}
			else if (choice1.get(i) == 15) {
				RP = RP + 2; 
			}
			else if (choice1.get(i) == 16) {
				CCE = CCE + 2; 
			}
			else if (choice1.get(i) == 17) {
				IP = IP + 2; 
			}
			else if (choice1.get(i) == 18) {
				RE = RE + 2; 
			}
		
		}
		
		//add 1 point to that seminar if it is a 5th choice 
		for (int i = 0; i < choice5.size(); i++) {
			if (choice1.get(i) == 1) {
				AC = AC + 1; 
			}
			else if (choice1.get(i) == 2) {
				BY = BY + 1; 
			}
			else if (choice1.get(i) == 3) {
				BC = BC + 1; 
			}
			else if (choice1.get(i) == 4) {
				CD = CD + 1; 
			}
			else if (choice1.get(i) == 5) {
				CO = CO + 1; 
			}
			else if (choice1.get(i) == 6) {
				CS = CD + 1; 
			}
			else if (choice1.get(i) == 7) {
				CC = CC + 1; 
			}
			else if (choice1.get(i) == 8) {
				CEI = CEI + 1; 
			}
			else if (choice1.get(i) == 9) {
				EMT = EMT + 1; 
			}
			else if (choice1.get(i) == 10) {
				GL = GL+ 1; 
			}
			else if (choice1.get(i) == 11) {
				MI = MI + 1; 
			}
			else if (choice1.get(i) == 12) {
				OCR = OCR + 1; 
			}
			else if (choice1.get(i) == 13) {
				MA = MA + 1; 
			}
			else if (choice1.get(i) == 14) {
				EI = EI + 1; 
			}
			else if (choice1.get(i) == 15) {
				RP = RP + 1; 
			}
			else if (choice1.get(i) == 16) {
				CCE = CCE + 1; 
			}
			else if (choice1.get(i) == 17) {
				IP = IP + 1; 
			}
			else if (choice1.get(i) == 18) {
				RE = RE + 1; 
			}
		
		}
		
		//*System.out.println(AC); 
		//*System.out.println(RP); 
		
	}//close choices
	
	//simple bubblesort to determine most indemand seminars
	public void priority() {
		
		//create and populate list to be sorted
		ArrayList<Integer> p = new ArrayList<Integer>();
		p.add(AC); p.add(BC); p.add(BY); p.add(CC); p.add(CCE); p.add(CD); p.add(CEI); p.add(CO); p.add(CS);   
		p.add(EI); p.add(EMT); p.add(GL); p.add(IP); p.add(MA); p.add(MI); p.add(OCR); p.add(RE); p.add(RP); 
		
		int count = 0; 
		//nested loops
		for (int x = 0; x < p.size() - 1; x++) {
			for (int y = 0; y < p.size() - 1; y++) {
				//if previous is greater than next 
				if (p.get(y) > p.get(y+1)) {
					//swap
					int a = p.get(y); 
					p.set(y, p.get(y+1)); 
					p.set(y+1, a); 
					//increase counter
					count++; 
				}//if statement
			}//inner for
		} //outer for
		
		//*System.out.println(p); 
		
		
	//top twelve go twice
	//bottom six go once 
	
		int x = p.get(5); //x represents the marker between top 12 and bottom 6 
		
		
		if (AC > p.get(5)) { //if it's in the top 12 of popularity 
			t12.add(acID); 
		}
		else if (AC == p.get(5) && b6.size() < 6) { //if it's equal to the middle marker, and there are not already 6 in the "bottom"
			b6.add(acID); 
		}
		else { //if it's less than
			b6.add(acID); 
		}
		
		//repeat for all seminars
		
		if (BC > p.get(5)) { //if it's in the top 12 of popularity 
			t12.add(bcID); 
		}
		else if (BC == p.get(5) && b6.size() < 6) { //if it's equal to the middle marker, and there are not already 6 in the "bottom"
			b6.add(bcID); 
		}
		else { //if it's less than, or if it's equal to but there are already 12 in the "top 12"
			b6.add(bcID); 
		}
		
		if (BY > p.get(5)) { //if it's in the top 12 of popularity 
			t12.add(byID); 
		}
		else if (BY == p.get(5) && b6.size() < 6) { //if it's equal to the middle marker, and there are not already 6 in the "bottom"
			b6.add(byID); 
		}
		else { //if it's less than, or if it's equal to but there are already 12 in the "top 12"
			b6.add(byID); 
		}
		
		if (CC > p.get(5)) { //if it's in the top 12 of popularity 
			t12.add(ccID); 
		}
		else if (CC == p.get(5) && b6.size() < 6) { //if it's equal to the middle marker, and there are not already 6 in the "bottom"
			b6.add(ccID); 
		}
		else { //if it's less than, or if it's equal to but there are already 12 in the "top 12"
			b6.add(ccID); 
		}
		
		if (CCE > p.get(5)) { //if it's in the top 12 of popularity 
			t12.add(cceID); 
		}
		else if (CCE == p.get(5) && b6.size() < 6) { //if it's equal to the middle marker, and there are not already 6 in the "bottom"
			b6.add(cceID); 
		}
		else { //if it's less than, or if it's equal to but there are already 12 in the "top 12"
			b6.add(cceID); 
		}
		
		if (CD > p.get(5)) { //if it's in the top 12 of popularity 
			t12.add(cdID); 
		}
		else if (CD == p.get(5) && b6.size() < 6) { //if it's equal to the middle marker, and there are not already 6 in the "bottom"
			b6.add(cdID); 
		}
		else { //if it's less than, or if it's equal to but there are already 12 in the "top 12"
			b6.add(cdID); 
		}
		
		if (CEI > p.get(5)) { //if it's in the top 12 of popularity 
			t12.add(ceiID); 
		}
		else if (CEI == p.get(5) && b6.size() < 6) { //if it's equal to the middle marker, and there are not already 6 in the "bottom"
			b6.add(ceiID); 
		}
		else { //if it's less than, or if it's equal to but there are already 12 in the "top 12"
			b6.add(ceiID); 
		}
		
		if (CO > p.get(5)) { //if it's in the top 12 of popularity 
			t12.add(coID); 
		}
		else if (CO == p.get(5) && b6.size() < 6) { //if it's equal to the middle marker, and there are not already 6 in the "bottom"
			b6.add(coID); 
		}
		else { //if it's less than, or if it's equal to but there are already 12 in the "top 12"
			b6.add(coID); 
		}
		
		if (CS > p.get(5)) { //if it's in the top 12 of popularity 
			t12.add(csID); 
		}
		else if (CS == p.get(5) && b6.size() < 6) { //if it's equal to the middle marker, and there are not already 6 in the "bottom"
			b6.add(csID); 
		}
		else { //if it's less than, or if it's equal to but there are already 12 in the "top 12"
			b6.add(csID); 
		}
		
		if (EI > p.get(5)) { //if it's in the top 12 of popularity 
			t12.add(eiID); 
		}
		else if (EI == p.get(5) && b6.size() < 6) { //if it's equal to the middle marker, and there are not already 6 in the "bottom"
			b6.add(eiID); 
		}
		else { //if it's less than, or if it's equal to but there are already 12 in the "top 12"
			b6.add(eiID); 
		}
		
		if (EMT > p.get(5)) { //if it's in the top 12 of popularity 
			t12.add(emtID); 
		}
		else if (EMT == p.get(5) && b6.size() < 6) { //if it's equal to the middle marker, and there are not already 6 in the "bottom"
			b6.add(emtID); 
		}
		else { //if it's less than, or if it's equal to but there are already 12 in the "top 12"
			b6.add(emtID); 
		}
		
		if (GL > p.get(5)) { //if it's in the top 12 of popularity 
			t12.add(glID); 
		}
		else if (GL == p.get(5) && b6.size() < 6) { //if it's equal to the middle marker, and there are not already 6 in the "bottom"
			b6.add(glID); 
		}
		else { //if it's less than, or if it's equal to but there are already 12 in the "top 12"
			b6.add(glID); 
		}
		
		if (IP > p.get(5)) { //if it's in the top 12 of popularity 
			t12.add(ipID); 
		}
		else if (IP == p.get(5) && b6.size() < 6) { //if it's equal to the middle marker, and there are not already 6 in the "bottom"
			b6.add(ipID); 
		}
		else { //if it's less than, or if it's equal to but there are already 12 in the "top 12"
			b6.add(ipID); 
		}
		
		if (MA > p.get(5)) { //if it's in the top 12 of popularity 
			t12.add(maID); 
		}
		else if (MA == p.get(5) && b6.size() < 6) { //if it's equal to the middle marker, and there are not already 6 in the "bottom"
			b6.add(maID); 
		}
		else { //if it's less than, or if it's equal to but there are already 12 in the "top 12"
			b6.add(maID); 
		}

		if (MI > p.get(5)) { //if it's in the top 12 of popularity 
			t12.add(miID); 
		}
		else if (MI == p.get(5) && b6.size() < 6) { //if it's equal to the middle marker, and there are not already 6 in the "bottom"
			b6.add(miID); 
		}
		else { //if it's less than, or if it's equal to but there are already 12 in the "top 12"
			b6.add(miID); 
		}
		
		if (OCR > p.get(5)) { //if it's in the top 12 of popularity 
			t12.add(ocrID); 
		}
		else if (OCR == p.get(5) && b6.size() < 6) { //if it's equal to the middle marker, and there are not already 6 in the "bottom"
			b6.add(ocrID); 
		}
		else { //if it's less than, or if it's equal to but there are already 12 in the "top 12"
			b6.add(ocrID); 
		}
		
		if (RE > p.get(5)) { //if it's in the top 12 of popularity 
			t12.add(reID); 
		}
		else if (RE == p.get(5) && b6.size() < 6) { //if it's equal to the middle marker, and there are not already 6 in the "bottom"
			b6.add(reID); 
		}
		else { //if it's less than, or if it's equal to but there are already 12 in the "top 12"
			b6.add(reID); 
		}
		
		if (RP > p.get(5)) { //if it's in the top 12 of popularity 
			t12.add(rpID); 
		}
		else if (RP == p.get(5) && b6.size() < 6) { //if it's equal to the middle marker, and there are not already 6 in the "bottom"
			b6.add(rpID); 
		}
		else { //if it's less than, or if it's equal to but there are already 12 in the "top 12"
			b6.add(rpID); 
		}
		
		//*System.out.print(t12); 
		//*System.out.print(b6);
		
	}//close method

	//indexes for t121 and b61
	private int t = 0; 
	private int b = 0; 
	//t12 and b6 lists filled with their respective presenters; needed so the same presenter isn't double scheduled
	public void presenters(int seminarID, int presenterID) {
		
		if (t12.contains(seminarID)) { //if the seminar is in the top 12, add presenter into top12 list
			t121.add(new ArrayList<Integer>()); 
			t121.get(t).add(seminarID); 
			t121.get(t).add(presenterID);
			t++;
		}
		else if (b6.contains(seminarID)) { //likewise for bottom 6
			b61.add(new ArrayList<Integer>()); 
			b61.get(b).add(seminarID);
			b61.get(b).add(presenterID); 
			b++; 
		}
	 
		//*System.out.println(t121); 
		//*System.out.println(b61);
	}
	
	//arrayList for schedule 
	private ArrayList<ArrayList<Integer>> sch = new ArrayList<ArrayList<Integer>>(); 
	
	//3 'sets' of 6 presenters
	//sets 1 and 2 will go twice (top 12), set 3 will go once (top 13) 
	//for a total of 5 sets of 6 presents
	private	ArrayList<Integer> s1 = new ArrayList<Integer>();
	private	ArrayList<Integer> s2 = new ArrayList<Integer>(); 
	private	ArrayList<Integer> s3 = new ArrayList<Integer>(); 
	
	public void schedule() {
		
	//REPEATING PRESENTERS; FIRST ATTEMPT DIDN'T WORK 
		/*	the part with repeating presenters needs to be worked out */
		/*
		//private boolean set1; //true if you want to add, false if you don't ; used in attempt1 and didn't work
	
		//populating arraylists 1 and 2 with presenters, ensuring that a presenter with 2 lectures is not scheduled twice in the same set
		for (int a = 0; a < t121.size(); a++) {
			
			do { //need while loop so set1 doesn't become true if it should be false
				//cycling through already scheduled to check for repeat presenters
				for (int b = 0; b <= a; b++) {
					//making sure the presenter has not already appeared in the set and there are not already 6 presenters
					if ((s1.get(b).get(1) != t121.get(a).get(1) && s1.size() < 6) || a == 0) {
						set1 = true;  
					}
					else if (s1.get(b).get(1) == t121.get(a).get(1) || s1.size() >= 6) {
						set1 = false; 
					}
					
				}
			} while (set1 == true); 
			
			//true if you want to add, false if you don't 
			if (set1 == true) {
				s1.add(t121.get(a).get(0));
			}
			else if (set1 == false) {
				s2.add(t121.get(a).get(0));
			}
		}
		
		*/
		
	//SECOND ATTEMPT TO GET RID OF REPEAT PRESENTERS
	
		//populate set 1 with the firt half of t121, and set 2 with the second half of t121
		for (int d = 0; d < t121.size()/2; d++) {
			s1.add(t121.get(d).get(0)); 
		}
		
		for (int v = t121.size()/2; v < t121.size(); v++) {
			s2.add(t121.get(v).get(0)); 
		}
		
		//check indexes 0-5 of t121 for repeats in a set using double for loops 
			for (int d1 = 1; d1 < t121.size()/2; d1++) {
				 for (int d2 = 0; d2 < d1; d2++) {
					 //if there are repeats, switch element in set 1 with corresponding element in set 2  
					 if (t121.get(d1).get(1) == t121.get(d2).get(1)) {
						 int temp1 = s2.get(d1);
						 int temp2 = s1.get(d1); 
						 s1.set(d1, temp1); 
						 s2.set(d1, temp2); 
					 }
				 }
			}

		//populating set 3 with the least popular seminars
		for (int j = 0; j < b6.size(); j++) {
			s3.add(b61.get(j).get(0)); 
		}
		
		System.out.println("SEMINAR SCHEDULE\n"); 
		System.out.println("KEY: (SESSION ID, SESSION NAME, PRESENTER NAME)\n"); 
		/*1*/System.out.println("Adventure Calls: The Benefits and Challenges of Study Abroad, 1 , Gunnar Lykins"); 
		/*2*/System.out.println("Be Your Own Boss: Entrepreneurship Opportunities in College and Beyond, 2 , Edwin Sam"); 
		/*3*/System.out.println("Business Clubs: Campus Involvement and Professional Development, 3 , Blake Lykins ");
		/*4*/System.out.println("College Decisions: Choosing a Historically Black College over a Predominately White Institution, 4 , Liah Apatira"); 
		/*5*/System.out.println("Community Organizing and College: Participating in Your College?s Democracy, 5 , Anna Beyette "); 
		/*6*/System.out.println("Community Service and Volunteering: Making an Impact as a College Student, 6 , Nathan Grant "); 
		/*7*/System.out.println("Conquering the Concrete Jungle, 7 , Madeleine Morales "); 
		/*8*/System.out.println("Co-Ops and Engineering Internships: Gaining Professional Experience, 8 , Gunnar Lykins "); 
		/*9*/System.out.println("Emergency Medical Technician: Working in the Back of an Ambulance, 9 , Grace Pettengill "); 
		/*10*/System.out.println("Greek Life: From Animal House to Developing Tomorrow's Leaders, 10 , Blake Lykins "); 
		/*11*/System.out.println("Making an Impact: Being a Leader in Student Government, 11 , Roshan Chandrakumar "); 
		/*12*/System.out.println("On-Campus Recruiting and the Coveted Junior Year Internship in Finance, 12 , Mia Fatuzzo "); 
		/*13*/System.out.println("So You Want to Play with Swords: Performance Martial Arts and Club Leadership, 13 , Claire Beyette "); 
		/*14*/System.out.println("The Ins and Outs of Engineering Internships, 14 , Elizabeth Grace "); 
		/*15*/System.out.println("The Road Less Traveled: Finding the Right Path for You, 15 , Ishan Ghildyal "); 
		/*16*/System.out.println("Thriving in a Highly Competitive College Environment, 16 , Mia Fatuzzo "); 
		/*17*/System.out.println("To Read or Not To Read? Interning in Publishing, 17 , Claire Beyette "); 
		/*18*/System.out.println("What Is Research When It's Not a Resume Builder?, 18 , Elizabeth Johnson "); 
	
		System.out.println("\nSCHEDULE BY SESSION ID\nTIME SLOT 1"); 
		System.out.println(s1); 
		System.out.println("\nTIME SLOT 2"); 
		System.out.println(s2);
		System.out.println("\nTIME SLOT 3"); 
		System.out.println(s3);
		System.out.println("\nTIME SLOT 4");  
		System.out.println(s1); 
		System.out.println("\nTIME SLOT 5"); 
		System.out.println(s2); 
	
		
	} //close method
	
	//return methods of schedulesets to make indiviudal schedules in SrSt class
	public ArrayList<Integer> getS1() {
		return s1; 
	}
	public ArrayList<Integer> getS2() {
		return s2; 
	}
	public ArrayList<Integer> getS3() {
		return s3; 
	}
	
}//close class

