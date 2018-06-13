package BinaryTree;

public class BTAddBinaryNumbers {
	public static void main(String args[]){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(1);
	    root.right = new TreeNode(1);
	    root.right.right = new TreeNode(1);
	    root.left.left = new TreeNode(0);
	    addBinaryNumers(root);
	}
	public static void addBinaryNumers(TreeNode t){
		int sum = 0;
		sum = helperAddBinaryNumers(t , sum);
		System.out.println(sum);
	}
	public static int helperAddBinaryNumers(TreeNode t, int sum){
		if( t == null){
			return 0;
		}
		sum = sum * 2 + t.data;
		if(t.left == null && t.right == null){
			return sum;
		}
		return helperAddBinaryNumers(t.left, sum) + helperAddBinaryNumers(t.right, sum);
	}
}
