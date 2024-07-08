public class BinaryTree {
	Node root;

	public BinaryTree() {
		root = null;
	}

	public void preOrder(Node node) {
		if (node == null)
			return;
		System.out.print(node.key + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public void inOrder(Node node) {
		if (node == null)
			return;
		inOrder(node.left);
		System.out.print(node.key + " ");
		inOrder(node.right);
	}

	public void postOrder(Node node) {
		if (node == null)
			return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.key + " ");
	}

	public void preOrder() {
		preOrder(root);
	}

	public void inOrder() {
		inOrder(root);
	}

	public void postOrder() {
		postOrder(root);
	}
}