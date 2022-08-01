import java.util.Scanner;

public class CircularLinkedList {
	Node head;
	Node tail;

	static class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
			next = null;
		}
	}

	public boolean isEmpty() {
		if (head == null) {
			System.out.println("list is empty");
			return true;
		}
		return false;
	}

	public void insert(int a) {
		Node node = new Node(a);
		if (head == null) {
			tail = head = node;
			return;
		}
		tail.next = node;
		tail = node;
		tail.next = head;
	}

	public void display() {
		if (isEmpty()) {
			return;
		}
		if (head == tail) {
			System.out.println("[" + head.value + "]");
			return;
		}
		Node currentNode = head;
		do {
			System.out.print("[" + currentNode.value + "] ");
			currentNode = currentNode.next;
		} while (currentNode != head);
		System.out.println();
	}

	public void insertFirst(int a) {
		Node node = new Node(a);
		if (head == null) {
			tail = head = node;
			return;
		}
		node.next = head;
		head = node;
		tail.next = head;
	}

	public int removeFirst() {
		if (isEmpty()) {
			return -1;
		}
		int element = head.value;
		if (head == tail) {
			head = tail = null;
			return element;
		}
		head = head.next;
		tail.next = head;
		return element;
	}

	public Node find(int index) {
		if (index < 0) {
			System.out.println("Index out of bounds");
			return null;
		}
		if (index == 0) {
			return head;
		}
		Node currentnode = head;
		int count = 0;
		while (count != index) {
			currentnode = currentnode.next;
			count++;
			if (currentnode == head) {
				System.out.println("Index out of bounds");
				return null;
			}
		}
		return currentnode;
	}

	public int deleteByIndex(int index) {
		if (isEmpty()) {
			return -1;
		}
		if (index == 0) {
			return removeFirst();
		}
		Node prev = null, currentnode = head;
		int count = 0;
		while (count != index) {
			prev = currentnode;
			currentnode = currentnode.next;
			count++;
			if (currentnode == head) {
				System.out.println("Index out of bounds");
				return -1;
			}
		}
		prev.next = currentnode.next;
		return currentnode.value;
	}

	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		Scanner sc = new Scanner(System.in);
		String str = "Enter Your choice\nPress 1 to Insert\nPress 2 to InsertFirst \nPress 3 to removeFirst\nPress 4 to RemoveByIndex\nPress 5 to display\nPress 6 to exit";
		System.out.println(str);
		int choice = sc.nextInt();
		while (choice != 6) {
			switch (choice) {
				case 1:
					System.out.println("Enter element");
					list.insert(sc.nextInt());
					System.out.println(str);
					choice = sc.nextInt();
					break;
				case 2:
					System.out.println("Enter element");
					list.insertFirst(sc.nextInt());
					System.out.println(str);
					choice = sc.nextInt();
					break;

				case 3:
					System.out.println("Deleted Element [" + list.removeFirst() + "]");
					System.out.println(str);
					choice = sc.nextInt();
					break;

				case 4:
					System.out.println("Enter index");
					System.out.println("Deleted Element [" + list.deleteByIndex(sc.nextInt()) + "] ");
					System.out.println(str);
					choice = sc.nextInt();
					break;

				case 5:
					list.display();
					System.out.println(str);
					choice = sc.nextInt();
					break;

				default:
					System.out.println("Invalid value");
					System.out.println(str);
					choice = sc.nextInt();
					break;
			}
		}
		sc.close();
	}
}