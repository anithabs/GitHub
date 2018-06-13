package BinaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class PreOrderWithoutRecursion {
	public static void main(String args[]){
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
	    root.right = new TreeNode(4);
	    root.right.right = new TreeNode(5);
	    root.left.left = new TreeNode(15);
	    ArrayList<Integer> res = returnPreOrderWithoutRecursion(root);
	    for (int r : res){
	    	System.out.println(r + "-->");
	    }   		
	}
	public static ArrayList<Integer> returnPreOrderWithoutRecursion(TreeNode t){
		
		Deque<TreeNode> queue = new ArrayDeque<TreeNode>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		if( t != null){
			queue.addFirst(t);
		}
		while( !queue.isEmpty() ){
			TreeNode current = queue.removeFirst();
			res.add(current.data);
			if( current.right != null) {
				queue.addFirst(current.right);;
			}
			if(current.left != null){
				queue.addFirst(current.left);
			}
		}
		return res;
	}
}
