package homework02;

import java.util.Scanner;

public class MallCentral {

	private static final String allMalls = "Malls in America";
	private String mallName;
	private String location;
	private int nos;
	private int rating;
	
	public static Scanner mallScanner = new Scanner(System.in);
	
	
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
	
	public String setmallName() {
		System.out.println("Enter your Malls Name: ");
		mallName = mallScanner.next();
		return mallName;
	}
	
	public String setlocation() {
		System.out.println("Enter your Malls Location: ");
		mallName = mallScanner.next();
		return location;
	}
	
	public int setnos() {
		System.out.println("Enter the Number of Stores in " + mallName);
		nos = mallScanner.nextInt();
		return nos;
	}
	
	public int setrating() {
		System.out.println("Mall rating from 0 to 5: ");
		rating = mallScanner.nextInt();
		return rating;
	}
}
