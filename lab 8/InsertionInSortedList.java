public class InsertionInSortedList extends CustomLinkedList {

    public void insert(int a) {
        Node node = new Node(a);
        if (head == null) {
            head = node;
            return;
        }
        Node currentNode = head, prev = null;
        while (currentNode != null) {
            if (currentNode.data < node.data) {
                prev = currentNode;
                currentNode = currentNode.next;
            } else {
                break;
            }
        }
        prev.next = node;
        node.next = currentNode;
    }

    public static void main(String[] args) {
        InsertionInSortedList list = new InsertionInSortedList();
        for (int i = 1; i < 10; i += 2) {
            list.addLast(i);
        }
        list.display();
        list.insert(6);
        list.insert(4);
        list.display();
    }

}
