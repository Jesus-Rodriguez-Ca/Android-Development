// Jesus Rodriguez
// ITC 155 Data Structure
// 6-17-2020
// Spring 2020

/* Write a method called hasTwoConsecutive that returns whether or not
 * a list of integers has two adjacent numbers that are consecutive numbers
 * (true if such a pair exists and false otherwise). For example, if a variable
 * list stores the values [1, 18, 2, 7, 8, 39, 18, 40], then the call 
 * list.hasTwoConsecutive() should return true because the list contains the
 * adjacent numbers(7, 8), which are a pair of consecutive numbers. 
*/


package p;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		LinkedIntList s = new LinkedIntList();
		int option = 0, element;
	
		do {
			try {
				option = Integer.parseInt(JOptionPane.showInputDialog(null,
						"1. Add element to the start of the list\n2. Add element to the end of the list\n3. Show elements of the list\n4. Check consecutiveness \n5. Exit", "Menu", 3));
			switch(option) {
			case 1:
				try {
					element = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter element: ", "Insert at start", 3));
				s.add(element);
				}catch(NumberFormatException n) {
					JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
				}
				break;
			case 2:
				try {
					element = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter element: ", "Insert at end", 3));
				s.add(element);
				}catch(NumberFormatException n) {
					JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
				}
				break;
			case 3:
				s.showList();
				break;
			case 4:
				System.out.println(s.hasTwoConsecutive());
				break;
			case 5:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Wrong option" );
			}
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
			}
		}while(option !=5);
		
	}

}

