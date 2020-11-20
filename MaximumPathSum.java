//Here we have given binary tree with weighted nodes
//and we have to find the maximum path sum.

//It can be divided into two probelems.
//any node to any node
//leaf to leaf node


//Any node to any node
//res will store our final answer

static int res;
int MPS(Node root) {
	if (root == null)
		return 0;
	int l = MPS(root.left);
	int r = MPS(root.right);

	int temp = Math.max(Math.max(l, r) + root.data, root.data);
	int ans = Math.max(temp, l + r + root.data);

	res = Math.max(ans, res);

	return temp;
}


//From leaf to leaf node

static int res;
int MPS(Node root) {
	if (root == null)
		return 0;
	int l = MPS(root.left);
	int r = MPS(root.right);

	int temp = Math.max(l, r) + root.data;
	if (root.left != null && root.right != null)
		temp = Math.max(temp, root.data);
	int ans = Math.max(temp, l + r + root.data);
	res = Math.max(ans, res);

	return temp;
}


//Approach is taken from aditya verma's video

//Problem is available on geeksforgeeks