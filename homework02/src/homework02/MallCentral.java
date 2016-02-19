package homework02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MallCentral {

	private static final String allMalls = "Malls in America";
	private String mallName;
	private String location;
	private int nos;
	private int rating;
	
	public static Scanner mallScanner = new Scanner(System.in); //Scanner for set methods
	
	public MallCentral() {
		mallName = "Mall Name";
		location = "Location";
		nos = 0;
		rating = 0;
		
	}
	
	public MallCentral(String nm, String l) {
		mallName = nm;
		location = l;
		nos = 0;
		rating = 0;
		
	}
	
	//get methods
	public String getallMalls() {
		return (allMalls);
	}
	
	public String getmallName() {
		return (mallName);
	}
	
	public String getlocation() {
		return (location);
	}
	
	public int getnos() {
		return(nos);
	}
	
	public int getrating() {
		return(rating);
	}
	
	public void getnos(int n) {
		nos = n;
		return;
	}
	
	public void getrating(int r) {
		rating = r;
		return;
	}
	
	
	//set methods
	public String setmallName() {
		System.out.println("Enter your malls Name: ");
		mallName = mallScanner.next();
		return mallName;
	}
	
	public String setlocation() {
		System.out.println("Enter your malls Location: ");
		location = mallScanner.next();
		return location;
	}
	
	//set int methods with try catch statement and user input checking
	public int setnos() {
		
		System.out.println("Enter the number of stores in " + mallName);
		nos = mallScanner.nextInt();
		
			while(nos > 0 && nos < 200)	{
				try { 
						return nos;
					}
					
					catch(InputMismatchException e) { //user input checking
						System.out.println("Invalid Input..");
						mallScanner.nextLine();
					}
				}
			return nos;
	}
	
	public int setrating() {
		
		System.out.println("Mall rating from 0 to 5: ");
		rating = mallScanner.nextInt();
		
			while(nos > 0 && nos < 5)	{
				try { 
						return rating;
					}
					
					catch(InputMismatchException e) { //user input checking
						System.out.println("Invalid Input..");
						mallScanner.nextLine();
					}
				}
			return nos;
		}
  	}

