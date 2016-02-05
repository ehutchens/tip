package homework01;

public class SumAndAverage {
	
	//public static sum() {
	//	int sum = 0;
	//    for (int i = 0; i < animalnumber.length; i++) {
	//        for (int j = 0; j < animalnumber[i].length; j++) {
	//            sum += animalnumber[i][j];
	//	
	//	return;
	//}
	
	private static double average(double animalnumber[][]) {
	    double sum = 0.0;	//With help from stackoverflow "average of ragged double two dimensional array"
	    int count = 0; 

	    for (int i = 0; i < animalnumber.length; i++) {
	        for (int j = 0; j < animalnumber[i].length; j++) {
	            sum += animalnumber[i][j];
	            count++;
			}
		}
	    
	    System.out.print("The average amount of animals is: ");
	    return sum / count;
		
	}

}
