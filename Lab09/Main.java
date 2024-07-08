public class Main {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Recorrido en preorden:");
		tree.preOrder();

		System.out.println("\nRecorrido en inorden:");
		tree.inOrder();

		System.out.println("\nRecorrido en postorden:");
		tree.postOrder();
		System.out.println("\nAltura: " + tree.treeHeight(tree.root));
	}
}

/* 
				  1
				/   \
			 2			3
		 /   \
	  4     5

*/