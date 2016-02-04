package homework01;

import javax.swing.JOptionPane;

public class problemone {
	
	public static void main(String[] args) {
		
		//The structure of the multidimensional array was inspired by 
		//thenewboston on youtube "Java Programming Tutorial - 34- Table for Multi Arrays"
		String [] zoos = new String [] {"San Diego Zoo", "Woodland Park Zoo", "Houston Zoo"};
		int animalnumber [] [] = {{3700, 1098, 6000}, {650, 300, 900}};

		// Object[] possibilities = {"San Diego Zoo", "Woodland Zoo", "Houston Zoo"};
		// String s = (String)JOptionPane.showInputDialog(frame, "Choose a zoo: ", JOptionPane.PLAIN_MESSAGE, icon, possinilities);
		// String answer = JOptionPane.showInputDialog("Choose One: ");
		
		System.out.println("Zoos" + zoos);
        	for(int i=0; i < zoos.length; i++){
        		System.out.println(zoos[i]);
        	 }

		System.out.println("Number of Animals & Species");
		displayArrays(animalnumber);
	}

	public static void displayArrays(int x[] []) {
		for(int row = 0; row < x.length; row++) {
			for(int column = 0; column < x[row].length; column++) {
				System.out.print(x[row] [column] + "\t");
			}
			
			System.out.println();
		}
	}
}
