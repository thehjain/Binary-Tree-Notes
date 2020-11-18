//Here we have given a tree and we have to print
//spiral level order traversal of given tree.

//Do it using two stack.

void printSpiral(Node node) {
	// Your code here
	if (node == null)
		return;
	Stack<Node> s1 = new Stack<>();
	Stack<Node> s2 = new Stack<>();

	s1.push(node);

	while (!s1.isEmpty() || !s2.isEmpty()) {

		while (!s1.isEmpty()) {
			Node temp = s1.pop();
			System.out.print(temp.data + " ");
			if (temp.right != null)
				s2.push(temp.right);
			if (temp.left != null)
				s2.push(temp.left);
		}

		while (!s2.isEmpty()) {
			Node temp = s2.pop();
			System.out.print(temp.data + " ");
			if (temp.left != null)
				s1.push(temp.left);
			if (temp.right != null)
				s1.push(temp.right);
		}

	}
}


//Problem is available on geeksforgeeks