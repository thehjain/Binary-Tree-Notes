//Here we have given a tree and we have to flatten it to linked list


//Approach is use to stack

public void flatten(TreeNode root) {
	if (root == null)
		return;
	Stack<TreeNode> s = new Stack<>();
	s.push(root);
	while (!s.isEmpty()) {
		TreeNode curr = s.pop();
		if (curr.right != null)
			s.push(curr.right);
		if (curr.left != null)
			s.push(curr.left);
		if (!s.isEmpty())
			curr.right = s.peek();
		curr.left = null;
	}
}


//Fastest approach using kind of Morris Traversal
public void flatten(TreeNode root) {
	TreeNode cur = root;
	while (cur != null) {
		if (cur.left != null) {
			TreeNode last = cur.left;
			while (last.right != null) last = last.right;
			last.right = cur.right;
			cur.right = cur.left;
			cur.left = null;
		}
		cur = cur.right;
	}
}



//Problem is available on leetcode