package homework02;

public class Mall extends MallCentral {

	private String mallName;
	private String location;
	private int nos;
	private double rating;
	
	public Mall() {
		mallName = "SouthCenter";
		location = "Tukwila, Washington";
		nos = 120;
		rating = 4.5;
	}
	
	@Override 
	public String getmallName() {
		return (mallName);
	}
	
	@Override
	public String getlocation() {
		return (location);
	}
	
}
