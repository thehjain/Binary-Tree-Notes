//This is similar to probelm(construct from inorder and preorder).
//Here we have given postorder instead of preorder.

//But the approach is very much similar to previous question.

//Here we have used HashMap to store indexes instead of
//searching index in inorder array everytime.

static int preIndex;
static HashMap<Integer, Integer> map = new HashMap<>();
Node buildTree(int in[], int post[], int n) {
	// Your code here
	preIndex = n - 1;
	int i = 0;
	for (int ele : in)
		map.put(ele, i++);
	return buildTreeUtil(in, post, 0, n - 1);
}
static Node buildTreeUtil(int[] in, int[] post, int inS, int inE) {

	if (inS > inE)
		return null;

	Node root = new Node(post[preIndex--]);

	if (inS == inE)
		return root;

	int index = map.get(root.data);

	root.right = buildTreeUtil(in, post, index + 1, inE);
	root.left = buildTreeUtil(in, post, inS, index - 1);
	return root;
}


//Problem is available on geeksforgeeks