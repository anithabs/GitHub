package LinkedList;

public class RemoveLoop {
	public static boolean findLoop(Node n){
		if(n == null || n.next == null) return false;
		Node slow = n;
		Node fast = n;
		while(slow != null && fast.next!= null  ) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				removeLoop(fast , n);
				return true;
			}	
		}
		return false;
	}
	
	public static void removeLoop( Node f , Node n){
		Node ptr1, ptr2;
		ptr1 = n;
		while(true){
			ptr2 = f;
			while(ptr2.next != f && ptr2.next != ptr1){
				ptr2 = ptr2.next;
			}
			if(ptr2.next == ptr1){
				break;
			}
			ptr1 = ptr1.next;
		}
		ptr2.next = null;
		
	}
}
