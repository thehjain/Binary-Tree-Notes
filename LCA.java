//Here we have to find Lowest Common Ancestors of
//two nodes.

//Basic approach is to store paths to both nodes in two
//different lists and then keep iterating while elements
//of both list are equal and return the element just before
//mismatch.

static List<Integer> path1 = new ArrayList<>();
static List<Integer> path2 = new ArrayList<>();

int findLCA(int n1, int n2) {
	path1.clear();
	path2.clear();
	return findLCAUtil(root, n1, n2);
}
int findLCAUtil(Node root, int n1, int n2) {
	if (!findPath(root, n1, path1) || !findPath(root, n2, path2))
		return -1;
	int i;
	for (i = 0; i < path1.size() && i < path2.size(); i++)
		if (path1.get(i) != path2.get(i))
			break;
	return path1.get(i - 1);
}
boolean findPath(Node root, int ele, List<Integer> path) {
	if (root == null)
		return false;
	path.add(root.data);
	if (root.data == ele)
		return true;
	if (root.left != null && findPath(root.left, ele, path))
		return true;
	if (root.right != null && findPath(root.right, ele, path))
		return true;
	path.remove(path.size() - 1);
	return false;
}


//We can do this in one traversal assuming that both keys
//are present in tree. Here we are not consdering the case
//where key is not present in tree.

Node findLCA(Node root, int n1, int n2) {
	if (root == null)
		return null;
	if (root.data == n1 || root.data == n2)
		return root;
	Node left = findLCA(root.left, n1, n2);
	Node right = findLCA(root.right, n1, n2);

	if (left != null && right != null)
		return root;
	return (left != null) ? left : right;
}



//Another extended approach is to use variable to check
//if both keys are present in tree.

static boolean v1 = false, v2 = false;

Node findLCA(int n1, int n2) {
	v1 = false;
	v2 = false;
	Node lca = findLCAUtil(root, n1, n2);

	if (v1 && v2)
		return lca;
	return null;
}

Node findLCAUtil(Node root, int n1, int n2) {
	if (root == null) return null;
	Node temp = null;

	if (root.data == n1) {
		v1 = true;
		temp = root;
	}
	if (root.data == n2) {
		v2 = true;
		temp = root;
	}
	Node left = findLCAUtil(root.left, n1, n2);
	Node right = findLCAUtil(root.right, n1, n2);

	if (temp != null) return temp;
	if (left != null && right != null) return root;
	return (left != null) ? left : right;
}


//Problem is available on geeksforgeeks