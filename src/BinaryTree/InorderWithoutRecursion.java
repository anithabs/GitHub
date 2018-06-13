package BinaryTree;

import java.util.ArrayList;
import java.util.Stack;

public class InorderWithoutRecursion {
	public static void main(String args[]){
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
	    root.right = new TreeNode(4);
	    root.right.right = new TreeNode(5);
	    root.left.left = new TreeNode(15);
	    ArrayList<Integer> res = returnInorderWithoutRecursion(root);
	    for (int r : res){
	    	System.out.println(r + "-->");
	    }   		
	}
	public static ArrayList<Integer> returnInorderWithoutRecursion(TreeNode t){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		while(t != null || !stack.isEmpty()){
			if( t != null) {
				stack.add(t);
				t =  t.left;
			}else{
				t = stack.pop();
				res.add(t.data);
				t = t.right;
			}
		}
		return res;
	}
}
