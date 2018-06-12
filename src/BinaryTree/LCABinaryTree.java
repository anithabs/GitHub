package BinaryTree;

public class LCABinaryTree {
	public static void main(String args[]){
		   TreeNode root = new TreeNode(1);
		   root.left = new TreeNode(5);
	       root.right = new TreeNode(2);
	       root.right.right = new TreeNode(3);
	       root.right.left = new TreeNode(4);
	       root.left.left = new TreeNode(3);
	       TreeNode result =  findLCABinaryTree(root,  root.right.right ,  root.left );
	       System.out.println(result.data);
	}
	
	public static TreeNode findLCABinaryTree(TreeNode tree, TreeNode n1, TreeNode n2){
		if(tree == null || n1 == tree || n2 == tree ){
			return tree;
		}
		TreeNode left = findLCABinaryTree(tree.left, n1, n2);
		TreeNode right = findLCABinaryTree(tree.right, n1, n2);
		return ( left != null && right != null)? tree : (left != null)?left : right;
	}
}
