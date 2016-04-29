/* Emily Hutchens
 * Fall 2016
 */
package homework01;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class problemone {
	
	//The structure was inspired by thenewboston on youtube "Java Programming Tutorial - 34- Table for Multi Arrays"
			String [] zoos = new String [] {"San Diego Zoo", "Woodland Park Zoo", "Houston Zoo"};
			static int animalnumber [] [] = {{3700, 1098, 6000}, {650, 300, 900}}; 
	
	public static void main(String[] args) {
		
		/* public enum problemone(); {
			String zoos = "unknown";
			int animalnumber = 0;
			object choices = "unknown";
			String zoochoice = 0;	
		}
		*/
		
		
		
		//Used form Oracle on "How to Make Dialogs"
		Object[] choices = {"San Diego Zoo", "Woodland Park Zoo", "Houston Zoo"};
		String zoochoice = (String)JOptionPane.showInputDialog(null, "Choose one of these zoos:", "Zoos", JOptionPane.PLAIN_MESSAGE, null, choices, "San Diego Zoo");
		
				// printing the zoo choices from the JOptionPane
				if (zoochoice == choices[0]) {
					System.out.println(choices[0]);
					
						System.out.println("Number of Animals: ");
						System.out.println(animalnumber[0][0]);
					
						System.out.println("Number of Species: ");
						System.out.println(animalnumber[1][0]);
						
				}
				
				else if (zoochoice == choices[1]) {
					System.out.println(choices[1]);
					
						System.out.println("Number of Animals: ");
						System.out.println(animalnumber[0][1]);
						
						System.out.println("Number of Species: ");
						System.out.println(animalnumber[1][1]);
				}
				
				else if (zoochoice == choices[2]) {
					System.out.println(choices[2]);
					
						System.out.println("Number of Animals: ");
						System.out.println(animalnumber[0][2]);
					
						System.out.println("Number of Species: ");
						System.out.println(animalnumber[1][2]);
				}
	
						try {
							Thread.sleep(2000);
							}
						catch(InterruptedException ex){
							Thread.currentThread().interrupt();
							}


			do { //Scanner input 
				Scanner myScan = new Scanner(System.in);
					System.out.println("Would you like to find the sum of all the animals in the three zoos? yes/no");
					String firstAnswer = null;
					firstAnswer = myScan.nextLine();
				
					
						if (firstAnswer.equalsIgnoreCase("yes")) {
							SumAndAverage myInstance = new SumAndAverage();
							myInstance.sum(animalnumber);
							break;

						}
						
						else if(firstAnswer.equalsIgnoreCase("no") ) {
							System.out.println("Your Loss");
							break;
						}
						
						else {
							System.out.println("This is not a valid input");
							
						}
			}
			while(true);
			
			do {
				Scanner myScan = new Scanner(System.in);
					System.out.println("Would you like to find the average of all the animals in the three zoos? yes/no");
					String secondAnswer = null;
					secondAnswer = myScan.nextLine();
					
					
						if (secondAnswer.equalsIgnoreCase("yes")) {
							//SumAndAverage myInstance = new SumAndAverage();
							//myInstance.average();
							break;
							
						}
							
						else if(secondAnswer.equalsIgnoreCase("no") ) {
							System.out.println("Your Loss");
							break;
						}
						
						else {
							System.out.println("This is not a valid input");
							break;
						}
			}
			while(true);
			
	}
}


			
