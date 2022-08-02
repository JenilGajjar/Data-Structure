class ReverseLinkedlList extends CustomLinkedList {

    public void reverseLinkedlList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head, prev = null, temp;

        while (currentNode != null) {
            temp = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = temp;
        }
        head = prev;
    }

    public static void main(String[] args) {
        ReverseLinkedlList list = new ReverseLinkedlList();
        for (int i = 0; i < 10; i++) {
            list.addLast(i);
        }
        list.display();
        list.reverseLinkedlList();
        list.display();

    }
}