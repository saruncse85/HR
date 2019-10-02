package arun.problemsolving;

public class BinaryTree {
//		a
//	/		\
//	b		e
///	 	\	/	\
//c		d	f	g
	
	static class Node {
		
		char value;
		Node left;
		Node right;
		
		public Node() {
			
		}
		
		public Node(char x) {
			this.value = x;			
		}
	}

	static Node root;
	
	public static void main(String[] args) {
	
		root = new Node('a');
		Node b = new Node('b');
		Node c = new Node('c');
		Node d = new Node('d');
		Node e = new Node('e');
		Node f = new Node('f');		
		Node g = new Node('g');
		
		char[] arr = {'d','b','e','a','f','c','g'};
		
		int start = 0;
		int end = arr.length-1;
		
		int mid = end/2;
		end = mid-1;
		Node rootNode = new Node(arr[mid+1]);
		constructTree(arr, start, mid, end, rootNode);
		
	}
	
	static void constructTree(char[] arr, int start, int mid, int end, Node rootN) {
		//mid is the root
		
		mid = (start+end)/2;
		if(mid > 0) {
			Node n = new Node(arr[mid]);
			root.left = n;
		}
		end = mid-1;
		constructTree(arr, start, mid, end, rootN);
				
		
	}
	
	

}
