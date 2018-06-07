package LinkedList;

public class PrintNode {
	
	public static void printNode( Node n ){
		while( n != null && n.next != null ){
			System.out.print( n.data + "->" );
			n = n.next;
		}
		if( n != null ){
			System.out.println( n.data );
		}
	}

	/*public static void printNodeRD( NodeRD n ){
		while( n != null && n.down != null ){
			System.out.print( n.data + "->" );
			n = n.down;
		}
		if( n != null ){
			System.out.println( n.data );
		}
	}*/
}
