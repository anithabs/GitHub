package LinkedList;

public class MergeSortedList {
	public static NodeRD merge(NodeRD one, NodeRD two){
		if(one == null) return two;
		if(two == null) return one;
		NodeRD result = null;
		if(one.data < two.data){
			result = one;
			result.right = merge(one.down , two); 
		}else{
			result = two;
			result.down = merge(one , two.down);
		}
		return result;		
	}
	
	public static Node merge(Node one, Node two){
		if(one == null) return two;
		if(two == null) return one;
		if(one.data  < two.data){
			one.next = merge(one.next, two);
			return one;
		}else{
			two.next = merge(one, two.next); 
			return two;
		}
			
	}
}
