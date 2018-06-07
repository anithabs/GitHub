package LinkedList;

public class AddOne {
   public static Node addOne(Node head){
	   if(head == null) return head;
	   Node temp = head, prev = null;
	   int carry = 1, sum = 0;
	   while(temp != null){
		   sum = temp.data + carry;
		   carry = ( sum >= 10 )? 1 : 0;
		   temp.data = ( carry > 0)?  sum % 10 : sum;
		   prev = temp;
		   temp = temp.next;
	   }
	   if(carry == 1){
		   Node newNode = new Node(1);
		   prev.next = newNode;
	   }
	   return head;
   }
}
