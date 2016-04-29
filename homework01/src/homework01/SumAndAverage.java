package homework01;

public class SumAndAverage {
	
	//String [] zoos = new String [] {"San Diego Zoo", "Woodland Park Zoo", "Houston Zoo"};
	//int animalnumber [] [] = {{3700, 1098, 6000}, {650, 300, 900}};
	
	public void sum(int x[][]) {
		int sum = 0;
		
	    for (int i = 0; i < x.length; i++) {
	      for (int j = 0; j < x.length; j++) {
	        sum += x[i][j]; 
	      }
	      System.out.println("The sum of all the animals is:" + sum);
	        return;
	  }
	}
	
	
	public void average(double y[][]) {
	    double sumTwo = 0.0;	//With help from stackoverflow "average of ragged double two dimensional array"
	    int count = 0; 

	    for (int i = 0; i < y.length; i++) {
	        for (int j = 0; j < y[i].length; j++) {
	            sumTwo += y[i][j];
	            count++;
			}
		}
	    
	    System.out.print("The average amount of animals is: " + sumTwo / count);
	    return;
		
	}
}
