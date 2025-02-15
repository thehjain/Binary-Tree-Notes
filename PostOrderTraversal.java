//Here we have to do the postorder traversal of
//given binary tree


//With Recursion

void postorder(Node root) {
	if (root == null)
		return;
	postorder(root.left);
	postorder(root.right);
	System.out.print(root.data + " ");
}


//Without Recursion
//Iterative traversal of postorder is more complex than
//preorder and inorder traversal , here we have to use
//two stacks.
//First store reverse preorder in stack 1
//and then use 2nd stack

void postorder(Node root) {
	if (root == null)
		return;
	Stack<Node> st1 = new Stack<>();
	Stack<Node> st2 = new Stack<>();

	st1.push(root);
	while (!st1.isEmpty()) {
		Node curr = st1.pop();
		st2.push(curr);
		if (curr.left != null)
			st1.push(curr.left);
		if (curr.right != null)
			st1.push(curr.right);
	}
	while (!st2.isEmpty()) {
		Node curr = st2.pop();
		System.out.print(curr.data + " ");
	}
}


//Using Single Stack

void postOrder(Node root) {

	if (root == null)
		return;

	Node curr = root;

	Stack<Node> stack = new Stack<>();

	while (curr != null || !stack.isEmpty()) {

		if (curr != null) {
			stack.push(curr);
			curr = curr.left;
		} else {
			Node temp = stack.peek().right;
			if (temp == null) {
				temp = stack.pop();
				System.out.print(temp.val + " ");

				while (!stack.isEmpty() && temp == stack.peek().right) {
					temp = stack.pop();
					System.out.print(temp.val + " ");
				}

			} else {
				curr = temp;
			}
		}

	}

}


//Problem is available on geeksforgeeks