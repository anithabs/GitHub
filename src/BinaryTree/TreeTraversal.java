package BinaryTree;

public class TreeTraversal {
	 public static void main(String[] args){
	   TreeNode root = new TreeNode(1);
	   root.left = new TreeNode(1);
       root.right = new TreeNode(2);
       root.right.right = new TreeNode(3);
       root.left.left = new TreeNode(4);
       treeTraversal(root);
    }
	
	 public static void treeTraversal( TreeNode root){
		 if(root == null) return;
		 System.out.println("PreOrder Traversal -->" + root.data);
		 treeTraversal(root.left);
		 System.out.println("InOrder Traversal -->" + root.data);
		 treeTraversal(root.right);
		 System.out.println("PostOrder Traversal -->" + root.data);
	 }
	 
	 
}
