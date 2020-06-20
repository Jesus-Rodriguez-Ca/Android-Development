package pack;

public class BinaryTrees {
	 
	 private IntTreeNode overallRoot;
	public BinaryTrees() {
		overallRoot = null;
	}
	
	public void insertNode(int d) {
		
		IntTreeNode newTree = new IntTreeNode(d);
		if(overallRoot == null) {
			overallRoot = newTree;
			
		}else {
			
			IntTreeNode helper = overallRoot;
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
	public boolean isFull() {
        return isFull(overallRoot);
    }

    public boolean isFull(IntTreeNode root) {
        if (root == null) {
            return true;
        } else if (root.left == null && root.right != null) {
            return false;
        } else if (root.right == null && root.left != null) {
            return false;
        } else {
            return isFull(root.left) && isFull(root.right);
        }
    }
}

