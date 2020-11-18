//Here we have given a binary tree and we have
//find or print the inordered traversal of it.

//One easy way to do this is recursion and other
//is without recursion


//With Recursion

void inorder(Node root) {
	if (root == null)
		return;
	inorder(root.left);
	System.out.print(root.data + " ");
	inorder(root.right);
}


//Without Recursion

public List<Integer> inorderTraversal(TreeNode root) {

	List<Integer> res = new ArrayList<>();
	Stack<TreeNode> st = new Stack<>();
	TreeNode curr = root;

	while (curr != null || !st.isEmpty()) {
		while (curr != null) {
			st.push(curr);
			curr = curr.left;
		}
		curr = st.pop();
		res.add(curr.val);
		curr = curr.right;
	}
	return res;
}



//Problem is present both on leetcode and geeksforgeeks