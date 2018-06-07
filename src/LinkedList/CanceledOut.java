package LinkedList;

import java.util.Stack;

public class CanceledOut {
	public static Node canceledOut(Node n){
		if(n == null || n.next == null) return null;
		Node res = new Node(0);
		Node temp = res;
		Stack<Integer>  stack = new Stack<Integer>();
		
		while(n != null){
			if(n.data < 0){
				int neg = n.data;
				while(!stack.empty() && neg != 0){
					neg = neg + stack.pop(); 
				}
			}else{
				stack.push(n.data);
			}
			n = n.next;
		}
		
		for(int i = 0 ; !stack.isEmpty() && i < stack.size(); i++){
			res.next =  new Node(stack.get(i));
			res = res.next;
		}
		return temp.next;
	}
}
