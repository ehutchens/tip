package homework02;

/* Emily Hutchens
 * Fall 2016
 */

public class MallCentralMain {

	public static void main(String[] args) {
		
		//MallPrint Object
		MallCentral mallPrint [] = new MallCentral[1]; //instantiate array
		for (int i= 0; i < 1; i++) {
			mallPrint [i] = new MallCentral();
		}
		
		String a = mallPrint[0].getallMalls();  
			
		for(int i = 0; i < 1; i++) {
			String mn = mallPrint[i].getmallName();
			String l = mallPrint[i].getlocation();
			int n = mallPrint[i].getnos();
			int r = mallPrint[i].getrating();
			
				System.out.println(a);
				System.out.println(mn);
				System.out.println(l);
				System.out.println("Number of Stores: ");
				System.out.println("Store Rating 0-5: ");
				System.out.println("");
				
				
			String mn2 = mallPrint[i].setmallName();
			String l2 = mallPrint[i].setlocation();
			int n2 = mallPrint[i].setnos();
			int r2 = mallPrint[i].setrating();
			
				System.out.println(a);
				System.out.println("Your malls name: " + mn2);
				System.out.println("Your malls location: " + l2);
				System.out.println("Number of Stores: " + n2);
				System.out.println("Store Rating 0-5: "+ r2);
				System.out.println("");
				
		}
		
			//MallPrint2 Object //mall recommendation
			Mall mallPrint2 = new Mall(); 
			String mallName = mallPrint2.getmallName();
			String location = mallPrint2.getlocation();
			int nos = mallPrint2.getnos();
			int rating = mallPrint2.getrating();
			
			System.out.println("If you haven't been already, you should try this mall:");
			System.out.println(a);
			System.out.println("Named: " + mallName);
			System.out.println("Located in: " + location);
			System.out.println("Number of Stores: " + nos);
			System.out.println("Store Rating 0-5: "+ rating);
	}

}
