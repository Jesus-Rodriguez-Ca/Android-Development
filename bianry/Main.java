// Jesus Rodriguez
// Data Structure 155
// Spring 2020
// 6-16-2020

/* Write a method called countEmpty that returns the number of empty branches in a tree. 
 * An empty tree is considered to have one empty branch (the tree itself). For nonempty trees, 
 * your method should count the total number of empty branches among the nodes of the tree. 
 * A leaf node has two empty branches, a node with one nonempty child has one empty branch, and
 * a node with two nonempty children has no empty branches. For example, reference tree #1 has 7
 * empty branches (two under the value 1, one under 5, and two under each of 4 and 6).
 * 
 */

package bianry;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int option = 0, element;
		String name;
		
		// Instantiates a tree of a BinaryTree class
		BinaryTrees Tree = new BinaryTrees();
		
		// Creates a menu to add node and check its values.
		do {
			try {
				option = Integer.parseInt(JOptionPane.showInputDialog(null, 
						"1. Add Node \n" +
						"2. Exit \n" +
						"Pick one ...", "Binary Tree ", JOptionPane.QUESTION_MESSAGE));
				switch(option){
				case 1 :
					element = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of node: " 
							, "Adding Node!", JOptionPane.QUESTION_MESSAGE));
					name = JOptionPane.showInputDialog(null, " Enter name of node: "
							, "Adding Node!", JOptionPane.QUESTION_MESSAGE);
					Tree.insertNode(element);
					break;
				
				case 2:
					JOptionPane.showMessageDialog(null, "Done"," Thanks",  JOptionPane.INFORMATION_MESSAGE);
					break;
					default:
						JOptionPane.showMessageDialog(null, "Wrong Option","Caution!",  JOptionPane.INFORMATION_MESSAGE);
						
				}
			}catch (NumberFormatException n) {
				JOptionPane.showMessageDialog(null,  "Error " + n.getMessage());
			}
			
		}while(option!= 2);
	}
	
}
	
	

