
public class TestBinaryTree2 {

	public static void main(String[] args) {
		BinaryTree2.Node node10 = new BinaryTree2.Node(10);
		BinaryTree2.Node node6 = new BinaryTree2.Node(6);
		BinaryTree2.Node node7 = new BinaryTree2.Node(7);
		BinaryTree2.Node node9 = new BinaryTree2.Node(9);
		BinaryTree2.Node node3 = new BinaryTree2.Node(3);
		BinaryTree2.Node node1 = new BinaryTree2.Node(1);
		
		node10.left = node6;
		node10.right = node7;
		node6.left = node9;
		node7.left = node3;
		node7.right = node1;
		
		BinaryTree2 bt2 = new BinaryTree2(node10);
		
		System.out.println("Inorder Transversal");
		System.out.println(((BinaryTree2) bt2).inorderToString());
		System.out.println();
		System.out.println("Preorder traversal");
		System.out.println(((BinaryTree2) bt2).inorderToString());
	}
}
