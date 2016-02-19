package homework02;

public class Mall extends MallCentral {

	private static final String allMalls = "Malls in America";
	private String mallName2;
	private String location2;
	private int nos2;
	private int rating2;
	
	public Mall() {
		mallName2 = "SouthCenter";
		location2 = "Tukwila, Washington";
		nos2 = 120;
		rating2 = 4;
	}
	
	@Override 
	public String getmallName() {
		return (mallName2);
	}
	
	@Override 
	public String getlocation() {
		return (location2);
	}
	
}