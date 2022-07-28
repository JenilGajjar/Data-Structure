public class SortLinkedList extends CustomLinkedList {

    public void sort() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node node = head, currentNode = node.next;
        while (node.next != null) {
            if (node.data > currentNode.data) {
                int temp = node.data;
                node.data = currentNode.data;
                currentNode.data = temp;
            }
            currentNode = currentNode.next;
            if (currentNode == null) {
                node = node.next;
                currentNode = node.next;
            }
        }
    }

    public static void main(String[] args) {
        SortLinkedList list = new SortLinkedList();
        for (int i = 10; i > 0; i--) {
            list.addLast(i);
        }
        list.display();
        list.sort();
        list.display();
    }
}
