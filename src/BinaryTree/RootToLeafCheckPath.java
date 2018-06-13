package BinaryTree;

public class RootToLeafCheckPath {
	public static void main(String args[]){
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
	    root.right = new TreeNode(4);
	    root.right.right = new TreeNode(5);
	    root.left.left = new TreeNode(15);
	    System.out.println(checkPath(root, 30));
	}
	
	public static boolean checkPath(TreeNode tree , int value){
		if(tree == null){
			return false;
		}else if(tree.left == null && tree.right == null){
			return tree.data == value;
		}
		return checkPath(tree.right , value - tree.data) || checkPath(tree.left, value - tree.data);
	}
}
