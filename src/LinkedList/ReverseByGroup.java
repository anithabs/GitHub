package LinkedList;
public class ReverseByGroup {
	public static Node reverseByGroup(Node n, int val) {
		 Node cur = n;
		 int count = 0;
		 while (cur != null && count != val){
			 cur = cur.next;
			 count++;
		 }
		 if(count == val){
			 cur = reverseByGroup(cur, val);
			 while(count-- > 0){
				 Node temp = n.next;
				 n.next = cur;
				 cur = n;
				 n = temp;
			 }
			 n = cur;
		 }
		 return n;
	}
		/*public static Node reverseKGroup(Node head, int k) {
	    Node curr = head;
	    int count = 0;
	    while (curr != null && count != k) { // find the k+1 node
	        curr = curr.next;
	        count++;
	    }
	    if (count == k) { // if k+1 node is found
	        curr = reverseKGroup(curr, k); // reverse list with k+1 node as head
	        // head - head-pointer to direct part, 
	        // curr - head-pointer to reversed part;
	        while (count-- > 0) { // reverse current k-group: 
	            Node tmp = head.next; // tmp - next head in direct part
	            head.next = curr; // preappending "direct" head to the reversed list 
	            curr = head; // move head of reversed part to a new node
	            head = tmp; // move "direct" head to the next node in direct part
	        }
	        head = curr;
	    }
	    return head;
	}*/
}