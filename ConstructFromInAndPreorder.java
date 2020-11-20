//Here we have given an inorder and preorder of binary tree
//and we have construct a tree from it.

//Approach is to remember that preorder stores root at starting
//here we divide the inorder travesal in two parts left and right
//according to preorder root.

//This will give time compexity of O(N^2).
//We can optimize it to O(N) as we are searching of index
//in inorder array everytime rather we can use hashmap
//to store index of elements that will given time complexity
//of O(N)

static int preS = 0;
public static Node buildTree(int inorder[], int preorder[], int n) {
	// code here
	int inS = 0;
	int inE = n - 1;
	preS = 0;
	return buildTreeUtil(inorder, preorder, inS, inE);
}
static Node buildTreeUtil(int[] inorder, int[] preorder, int inS, int inE) {
	if (inS > inE)
		return null;
	Node root = new Node(preorder[preS++]);

	if (inS == inE)
		return root;

	int index = search(inorder, inS, inE, root.data);

	root.left = buildTreeUtil(inorder, preorder, inS, index - 1);
	root.right = buildTreeUtil(inorder, preorder, index + 1, inE);

	return root;
}
//Instead of using this method we can store indexes
//in hashmap to optimize the code.
static int search(int[] inorder, int i, int j, int ele) {
	for (int index = i; index <= j; index++)
		if (inorder[index] == ele)
			return index;
	return -1;
}



//Problem is availablen on geeksforgeeks


