package LinkedList;

import java.util.HashSet;

public class CTCI_RemoveDuplicatedUnsortedArray {
	public static void main(String args[]){
		Node node = new Node(10);
		node.next = new Node(9);
		node.next.next = new Node(10);
		node.next.next.next = new Node(8);
		node = removeDuplicates(node);
		PrintNode.printNode(node);
	}
	public static Node removeDuplicates(Node node){
		HashSet<Integer> hash = new HashSet<Integer>();
		Node prev = null;
		Node temp = node;
		Node ret = new Node(0);
		ret.next = node;
		while(node != null){
			if(hash.contains(node.data)){
				prev.next = prev.next.next;
				node = node.next;
			}else{
				hash.add(node.data);
				prev = node;
				node = node.next;
			}
		}
		return ret.next;
	}
}
