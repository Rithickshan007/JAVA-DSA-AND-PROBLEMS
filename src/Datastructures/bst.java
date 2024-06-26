package Datastructures;

import java.util.ArrayList;
import java.util.List;

class BSTNode {
    int data;
    BSTNode left, right;

    public BSTNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinarySearchTree {
    BSTNode root;

    BinarySearchTree() {
        root = null;
    }

    void insertRecursive(BSTNode root, int data) {
        if (root == null) {
            new BSTNode(data);
            return;
        }

        if (data < root.data)
            root.left = insert(root.left, data);
        else if (data > root.data)
            root.right = insert(root.right, data);

    }

    //Insert without using Recursion
    public BSTNode insert(BSTNode root, int data) {
        BSTNode newNode = new BSTNode(data);
        if (root == null) {
            root = newNode;
            return root;
        }

        BSTNode current = root;
        BSTNode parent;
        while (true) {
            parent = current;
            if (data < current.data) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    return root;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return root;
                }
            }
        }
    }
    private int minValue(BSTNode root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    public List<Integer> inorderTraversal(BSTNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        result.addAll(inorderTraversal(root.left));
        result.add(root.data);
        result.addAll(inorderTraversal(root.right));
        return result;
    }

    public List<Integer> preorderTraversal(BSTNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        result.add(root.data);
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));
        return result;
    }

    public List<Integer> postorderTraversal(BSTNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        result.addAll(postorderTraversal(root.left));
        result.addAll(postorderTraversal(root.right));
        result.add(root.data);
        return result;
    }

    boolean search(BSTNode root, int data) {
        if (root == null)
            return false;

        if (root.data == data)
            return true;
        else if (data < root.data)
            return search(root.left, data);
        else
            return search(root.right, data);
    }


    public BSTNode deleteNode(BSTNode root, int data){
        if(root==null){
            return null;
        }
        if(data< root.data){
            root.left=deleteNode(root.left,data);
        } else if (data> root.data) {
            root.right=deleteNode(root.right,data);
        }
        else{
            //case1: No Children
            if(root.left==null&&root.right==null){
                return null;
            }
            //case2: Only one Children
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            //case 3: Two Children
            root.data = minValue(root.right);
            root.right = deleteNode(root.right, root.data);

        }
        return root;
    }


    public static class KthLargestInBST {
        private int count = 0;

        public BSTNode findKthLargest(BSTNode root, int k) {
            if (root == null)
                return null;

            BSTNode right = findKthLargest(root.right, k);

            count++;

            if (count == k)
                return root;

            BSTNode left = findKthLargest(root.left, k);

            return (right != null) ? right : left;
        }

    }
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

//        tree.root = tree.insert(tree.root, 30);
//        tree.insert(tree.root, 50);
//        tree.insert(tree.root, 20);
//        tree.insert(tree.root, 40);
//        tree.insert(tree.root, 70);
//        tree.insert(tree.root, 60);
//        tree.insert(tree.root, 80);
        tree.root = tree.insert(tree.root, 50);
        tree.insertRecursive(tree.root, 30);
        tree.insertRecursive(tree.root, 20);
        tree.insertRecursive(tree.root, 40);
        tree.insertRecursive(tree.root, 70);
        tree.insertRecursive(tree.root, 60);
        tree.insertRecursive(tree.root, 80);


        System.out.println("Inorder traversal: " + tree.inorderTraversal(tree.root));
        System.out.println("Preorder traversal: " + tree.preorderTraversal(tree.root));
        System.out.println("Postorder traversal: " + tree.postorderTraversal(tree.root));

        int searchData = 60;
        System.out.println((tree.search(tree.root, searchData) ? "Found" : "Not Found"));

        searchData = 90;
        System.out.println((tree.search(tree.root, searchData) ? "Found" : "Not Found"));
        KthLargestInBST kthLargestFinder = new KthLargestInBST();
        int k = 5;
        BSTNode result = kthLargestFinder.findKthLargest(tree.root, k);
        System.out.println("Kth largest node value: " + result.data);
        tree.deleteNode(tree.root,60);
        System.out.println("Deleted Inorder traversal : " + tree.inorderTraversal(tree.root));
    }
}


