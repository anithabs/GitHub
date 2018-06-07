package LinkedList;
public class Reverse {
	public static Node reverse(Node head){
		Node newNode = null;
		// back up the head.next and swap to new node and restore head value repeat the loop
	    while(head != null){
	        Node next = head.next;
	        head.next = newNode;
	        newNode = head;
	        head = next;
	    }
	    return newNode;
	}
}
