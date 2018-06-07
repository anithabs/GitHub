package LinkedList;

public class LoopDetection {
	public static boolean loopdetection(Node n){
		if(n == null || n.next == null) return false;
		Node slow = n;
		Node fast = n.next;
		while(slow.next != null && fast.next != null && fast.next.next != null){
			if( slow == fast){
				return true;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return false;
	}
	
}
