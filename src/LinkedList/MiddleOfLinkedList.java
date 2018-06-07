package LinkedList;

public class MiddleOfLinkedList {
	public static int midOfLinkedList( Node head){
		Node fast = head, slow = head;
		if(head == null) throw new IllegalArgumentException("Input cannot be null");
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
	
	public static int midOfLinkedListprev( Node head){
		Node fast = head, slow = head;
		Node prev = slow;
		if(head == null) throw new IllegalArgumentException("Input cannot be null");
		while(fast != null && fast.next != null){
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		if( fast == null){
			return prev.data;
		}
		return slow.data;
	}
}
