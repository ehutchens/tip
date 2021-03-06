package homework02;
import homework02.MallCentral;

public class Mall extends MallCentral {

	private static final String allMalls = "Malls in America";
	private String mallName;
	private String location;
	private int nos;
	private int rating;
	
	public Mall() {
		mallName = "SouthCenter";
		location = "Tukwila, Washington";
		nos = 120;
		rating = 4;
	}
	
	@Override 
	public String getmallName() {
		return (mallName);
	}
	
	@Override 
	public String getlocation() {
		return (location);
	}
	
	@Override
	public int getnos() {
		return(nos);
	}
	
	@Override
	public int getrating() {
		return(rating);
	}
	
}