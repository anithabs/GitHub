package BinaryTree;

public class HeightBalanced {
	public static void main(String[] args){
		   TreeNode root = new TreeNode(1);
		   root.left = new TreeNode(1);
	       root.right = new TreeNode(2);
	       root.right.right = new TreeNode(3);
	       root.left.left = new TreeNode(4);
	       root.left.left.left = new TreeNode(4);
	       System.out.println(heightBalanced(root));
	}
	public static boolean heightBalanced(TreeNode node){
		if(node == null) return true;
		return Math.abs(maxHeight(node.left) - maxHeight(node.right)) <= 1 && heightBalanced(node.left) && heightBalanced(node.right);
	}
	public static int maxHeight(TreeNode node){
		if(node == null) return 0;
		return (Math.max(maxHeight(node.left), maxHeight(node.right)) + 1 );
	}
	
	public static int maxHeight(TreeNodeParent node){
		if(node == null) return 0;
		return (Math.max(maxHeight(node.left), maxHeight(node.right)) + 1 );
	}
}
