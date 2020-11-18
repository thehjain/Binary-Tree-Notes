//Here we have to find the preorder traversal of binary tree
//without recursion and with recursion


//With Recursion

void preorder(Node root) {
	if (root == null)
		return;
	System.out.print(root.data + " ");
	preorder(root.left);
	preorder(root.right);
}


//Without Recursion

void preorder(Node root) {
	if (root == null)
		return;
	Stack<Node> st = new Stack<>();
	st.push(root);
	while (!st.isEmpty()) {

		Node curr = st.peek();
		System.out.print(curr.data + " ");
		st.pop();
		if (curr.right != null)
			st.push(curr.right);
		if (curr.left != null)
			st.push(curr.left);
	}
}


//Problem is available on geeksforgeeks