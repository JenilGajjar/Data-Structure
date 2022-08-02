class ReverseCircularLinkedList extends CircularLinkedList {
    public void reverse() {
        if (isEmpty()) {
            return;
        }
        if (head == tail) {
            return;
        }
        Node currentNode = head, prev = tail, temp;
        do {
            temp = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = temp;
        } while (currentNode != head);
        head = prev;
        tail = currentNode;
    }

    public static void main(String[] args) {
        ReverseCircularLinkedList list = new ReverseCircularLinkedList();
        for (int i = 1; i < 10; i++)
            list.insert(i);
        list.display();
        System.out.println("head : " + list.head.value);
        System.out.println("tail : " + list.tail.value);
        System.out.println("tail.next : head " + list.tail.next.value);
        list.reverse();
        list.display();
        System.out.println("head : " + list.head.value);
        System.out.println("tail : " + list.tail.value);
        System.out.println("tail.next : head " + list.tail.next.value);
    }
}