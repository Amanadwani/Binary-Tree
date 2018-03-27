public class Main
{
	public static void main(String[] args) 
	{
		BinaryTree bst = new BinaryTree();

		bst.root = bst.insert(bst.root, 1);
		bst.root = bst.insert(bst.root, -1);
		bst.root = bst.insert(bst.root, 3);
		bst.root = bst.insert(bst.root, 0);
		bst.root = bst.insert(bst.root, 6);

		bst.preOrder(bst.root);
		
		System.out.println();
		
		bst.inOrder(bst.root);
		
		System.out.println();
		
		bst.postOrder(bst.root);
		System.out.println();
		if (bst.search(bst.root, 5))
			System.out.println("yes");
	}
}