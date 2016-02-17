package homework02;

public class MallTestMain {

	public static void main(String[] args) {
		Mall mallTester[] = new Mall[3];
		for (int i=0; i<3; i++); {
			mallTester [i] = new Mall();
		}
		
		String s = mallTester[0].getallMalls();
		
		for (i=0; i<3; i++) {
			String n = mallTester[i].getmallName();
			String c = mallTester[i].getlocation();
			int w = mallTester[i].getnos();
			double l = mallTester[i].getrating();
			
			System.out.println(s + "" + n);
			System.out.println(c + "" + w + "" + l);
		}
		
	}
	
}
