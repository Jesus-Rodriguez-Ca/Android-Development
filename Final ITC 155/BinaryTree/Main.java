// Jesus Rodriguez
// 6-19-2020
// Spring 2020

/* Write a method called isFull that returns true if a binary tree is full and false
 * if is not. A full binary tree is one in which every node has 0 or 2 children.
 * For example, reference tree #1 and #2 are not full, but #3 is full. By definition,
 * the empty tree is considered full. 
*/
package pack;

import java.util.Scanner;

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
						"2. isFull? \n" +
						"3.Exit \n" +
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
					System.out.print(Tree.isFull());
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Done"," Thanks",  JOptionPane.INFORMATION_MESSAGE);
					break;
					default:
						JOptionPane.showMessageDialog(null, "Wrong Option","Caution!",  JOptionPane.INFORMATION_MESSAGE);
						
				}
			}catch (NumberFormatException n) {
				JOptionPane.showMessageDialog(null,  "Error " + n.getMessage());
			}
			
		}while(option!= 3);
	}
	}



