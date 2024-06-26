package Datastructures;

//Tree Applications And Advantages
//1.Folder hierarchy
//2.Storage efficiency
//3.Make searching more efficient

//Inorder: L ROOT R
//Preorder: ROOT L R
//Postorder: L R ROOT

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }
}

class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }
    public List<Integer> inOrderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        result.addAll(inOrderTraversal(root.left));
        result.add(root.data);
        result.addAll(inOrderTraversal(root.right));
        return result;
    }
    public List<Integer> preOrderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        result.add(root.data);
        result.addAll(preOrderTraversal(root.left));
        result.addAll(preOrderTraversal(root.right));
        return result;
    }
    public List<Integer> postOrderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        result.addAll(postOrderTraversal(root.left));
        result.addAll(postOrderTraversal(root.right));
        result.add(root.data);
        return result;
    }
    public int sum(TreeNode root)
    {
        if(root == null)
            return 0;
        return root.data + sum(root.left) + sum(root.right);
    }
    public int height(TreeNode root)
    {
        if(root == null)
            return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public int maxe(TreeNode root)
    {
        if(root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(maxe(root.left), maxe(root.right)));
    }
    public int mine(TreeNode root)
    {
        if(root == null)
            return Integer.MAX_VALUE;
        return Math.min(root.data, Math.min(mine(root.left), mine(root.right)));
    }
    public boolean search(TreeNode root, int key)
    {
        if(root == null)
            return false;
        if(root.data == key)
            return true;
        return search(root.left, key) || search(root.right, key);
    }
    public boolean fullTree(TreeNode root)
    {
        if(root == null)
            return true;
        if(root.left == null && root.right == null)
            return true;
        if(root.left != null && root.right !=null)
            return fullTree(root.left) && fullTree(root.right);
        return false;
    }
    public boolean skewedTree(TreeNode root)
    {
        if(root == null || (root.left == null && root.right == null))
            return true;
        if(root.left == null)
            skewedTree(root.right);
        if(root.right == null)
            skewedTree(root.left);
        return false;
    }
    public int count(TreeNode root)
    {
        if(root == null)
            return 0;
        return 1 + count(root.left) + count(root.right);
    }
    public boolean perfectTree(TreeNode root)
    {
        int height = height(root);
        int count = count(root);
        return count == Math.pow(2,height)-1;
    }
    public boolean completeTree(TreeNode root, int index, int nodeCount)
    {
        if(root == null)
            return true;
        if(index >= nodeCount)
            return false;
        return completeTree(root.left, 2*index+1, nodeCount) && completeTree(root.right, 2*index+2, nodeCount);
    }
    public int diameter(TreeNode root)
    {
        if(root == null)
            return 0;
        int dia =0;
        int lefth = diameter(root.left);
        int righth = diameter(root.right);
        dia = Math.max(dia, lefth + righth + 1);
        return dia;
    }
}

class Tree1 {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root=new TreeNode(5);
        tree.root.left=new TreeNode(10);
        tree.root.right=new TreeNode(12);
        tree.root.left.left=new TreeNode(4);
        tree.root.left.right=new TreeNode(6);
        tree.root.left.right.left=new TreeNode(15);
        tree.root.right.left=new TreeNode(20);
        tree.root.right.right=new TreeNode(25);
        tree.root.right.right.right=new TreeNode(27);

        System.out.println("In-order Traversal: " + tree.inOrderTraversal(tree.root));
        System.out.println("Pre-order Traversal: " + tree.preOrderTraversal(tree.root));
        System.out.println("Post-order Traversal: " + tree.postOrderTraversal(tree.root));
        System.out.println("Sum: " + tree.sum(tree.root));
        System.out.println("height: " + tree.height(tree.root));
        System.out.println("Max: " + tree.maxe(tree.root));
        System.out.println("Min: " + tree.mine(tree.root));
        System.out.println("Search: " + tree.search(tree.root, 2));
        System.out.println("full tree: " + tree.fullTree(tree.root));
        System.out.println("skewed tree: " + tree.skewedTree(tree.root));
        int count = tree.count(tree.root);
        System.out.println("Count: " + count);
        System.out.println("perfect tree: "+ tree.perfectTree(tree.root));
        System.out.println("Diameter : "+ tree.diameter(tree.root));
        System.out.println("Complete Tree: " + tree.completeTree(tree.root,0,count));
    }
}
