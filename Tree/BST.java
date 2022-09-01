import java.util.Stack;

public class BST {
    Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public void insert(int a) {
        Node nnode = new Node(a);
        if (root == null) {
            root = nnode;
            return;
        }

        Node temp = root;
        while (temp.left != null || temp.right != null) {
            if (nnode.data >= temp.data && temp.right != null) {
                temp = temp.right;
            } else if (nnode.data < temp.data && temp.left != null) {
                temp = temp.left;
            } else {
                break;
            }
        }

        if (nnode.data >= temp.data) {
            temp.right = nnode;
            return;
        }
        temp.left = nnode;
    }

    public void inorder() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        Node temp = root;
        Stack<Node> stack = new Stack<>();
        while (temp != null || stack.size() != 0) {
            while (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }
            temp = stack.pop();
            System.out.print("[" + temp.data + "] ");
            temp = temp.right;
        }
        System.out.println();
    }

    public void preorder() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            System.out.print("[" + temp.data + "] ");
            if (temp.right != null)
                stack.push(temp.right);
            if (temp.left != null)
                stack.push(temp.left);
        }
        System.out.println();
    }

    public void postorder() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);

        while (!stack1.empty()) {
            Node temp = stack1.pop();
            stack2.push(temp);
            if (temp.left != null)
                stack1.push(temp.left);
            if (temp.right != null)
                stack1.push(temp.right);
        }

        while (!stack2.empty()) {
            Node temp = stack2.pop();
            System.out.print("[" + temp.data + "] ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(8);
        tree.insert(11);
        tree.insert(13);
        tree.insert(12);
        tree.insert(9);
        tree.insert(6);
        tree.insert(7);
        tree.insert(4);
        tree.insert(5);

        System.out.print("Inorder : ");
        tree.inorder();
        System.out.print("Preorder : ");
        tree.preorder();
        System.out.print("Postorder : ");
        tree.postorder();
    }

}