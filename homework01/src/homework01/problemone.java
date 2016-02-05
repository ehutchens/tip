
package homework01;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class problemone {
	
	public static void main(String[] args) {
		
		//The structure of the multidimensional array was inspired by 
		//thenewboston on youtube "Java Programming Tutorial - 34- Table for Multi Arrays"
		String [] zoos = new String [] {"San Diego Zoo", "Woodland Park Zoo", "Houston Zoo"};
		int animalnumber [] [] = {{3700, 1098, 6000}, {650, 300, 900}};


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
		//	}

	//problemone();
	
	//public problemone(){

			do {
				Scanner answer = new Scanner(System.in);
				System.out.println("Would you like to find the sum of all the animals in the three zoos? yes/no");
				String yesNo = answer.toString();
				
				if (yesNo.equalsIgnoreCase("yes")) {
				//	average();
				//	System.out.println(sum);
				}
				
				else if(yesNo.equalsIgnoreCase("no") ) {
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
			
