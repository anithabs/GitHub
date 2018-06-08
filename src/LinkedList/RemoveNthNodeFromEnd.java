package LinkedList;

public class RemoveNthNodeFromEnd {
	public static Node removeNthNodeFromEnd(Node n , int val){
		Node temp = new Node(0);
		temp.next = n;
		Node first = n, second = n;
		for(int i = 1 ; i <= val + 1 ; i++){
			first = first.next;
		}
		while(first != null){
			first = first.next;
			second = second.next;
		}
		second.next = second.next.next;
		return temp.next;	
	}
}
