package BinaryTree;

public class CheckSymmetric {
	public static boolean symmetric(TreeNode node){
		if(node == null) return true;
		return checkSymmetric(node.left, node.right);
	}
	public static boolean checkSymmetric(TreeNode right, TreeNode left){
		if(right == null && left == null){
			return true;
		}else if(right != null && left != null){
				return left.data == right.data && checkSymmetric(left.left, right.right) && checkSymmetric(left.right, right.left);
		}
		return false;
	}
	
	public static void main(String[] args){
	   TreeNode root = new TreeNode(1);
	   root.left = new TreeNode(2);
       root.right = new TreeNode(2);
       root.right.right = new TreeNode(3);
       root.left.left = new TreeNode(3);
       //root.left.left.right = new TreeNode(4);
       System.out.println(symmetric(root));
	}
}
