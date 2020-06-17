package bianry;

// Insert values to a tree
public class BinaryTrees {
		IntTreeNode root;
		public BinaryTrees() {
			root = null;
		}
		
		public void insertNode(int d) {
			
			IntTreeNode newTree = new IntTreeNode(d);
			if(root == null) {
				root = newTree;
				
			}else {
				
				IntTreeNode helper = root;
				IntTreeNode parent;
				
				// Insert values in their right place
				while(true) {
					parent = helper;
					
				// Insert values to the left branch	
					if(d < helper.data) {
						helper = helper.left;
						if(helper == null) {
							parent.left = newTree;
							return;
						}
						
				// Insert Values to the right branch
					}else {
						helper = helper.right;
						if(helper == null) {
							parent.right = newTree;
							return;
						}
					}
				}
			}		
			
		}

	}


