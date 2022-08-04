/*
	Write a menu driven program to implement following operations on the doubly linked list.
	a. Insert a node at the front of the linked list.
	b. Delete a node from specified position.
	c. Insert a node at the end of the linked list. (Home Work)
	d. Display all nodes. (Home Work)
*/
import java.util.Scanner;

public class CustomDoublyLinkedList {
	Node head;
	Node tail;

	static class Node {
		int value;
		Node next;
		Node prev;

		public Node(int value) {
			this.value = value;
			this.next = null;
			this.prev = null;
		}
	}

	public boolean isEmpty() {
		if (head == null) {
			System.out.println("List is empty");
			return true;
		}
		return false;
	}

	public void insertLast(int a) {
		Node newNode = new Node(a);
		if (head == null) {
			head = tail = newNode;
			return;
		}
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}

	public void displayRev() {
		if (isEmpty()) {
			return;
		}
		Node currentNode = tail;
		while (currentNode != null) {
			System.out.print("[" + currentNode.value + "] ");
			currentNode = currentNode.prev;
		}
		System.out.println();
	}

	public void display() {
		if (isEmpty()) {
			return;
		}
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print("[" + currentNode.value + "] ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}

	public void insertFirst(int a) {
		Node newNode = new Node(a);
		if (head == null) {
			head = tail = newNode;
			return;
		}
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}

	public Node find(int index) {
		int count = 0;
		Node currentNode = head;
		while (currentNode != null && count != index) {
			count++;
			currentNode = currentNode.next;
		}
		return currentNode;
	}

	public void insert(int index, int a) {
		if (index == 0) {
			insertFirst(a);
			return;
		}
		if (index == size()) {
			insertLast(a);
			return;
		}

		Node newNode = new Node(a);
		Node currentNode = find(index - 1);

		if (currentNode != null) {
			newNode.next = currentNode.next;
			newNode.prev = currentNode;
			currentNode.next.prev = newNode;
			currentNode.next = newNode;
			return;
		}
		System.out.println("Invalid Index");
	}

	public int size() {
		int size = 0;
		if (isEmpty()) {
			return size;
		}

		Node currentNode = head;
		while (currentNode != null) {
			size++;
			currentNode = currentNode.next;
		}
		return size;
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
		head.prev = null;

		return element;
	}

	public int removeLast() {
		if (isEmpty()) {
			return -1;
		}
		int element = tail.value;

		if (head == tail) {
			head = tail = null;
			return element;
		}

		tail = tail.prev;
		tail.next = null;

		return element;
	}

	public int remove(int index) {
		if (isEmpty())
			return -1;

		if (index == 0)
			return removeFirst();

		if (index == size() - 1)
			return removeLast();

		Node currentNode = find(index - 1);

		if (currentNode != null && currentNode.next != null) {
			int element = currentNode.next.value;
			currentNode.next = currentNode.next.next;
			currentNode.next.prev = currentNode;
			return element;
		}

		System.out.println("Invalid Index");
		return -1;
	}

	public void reverse() {
		if (isEmpty())
			return;
		Node start = head, end = tail;
		while (start != end && end.next != start) {
			int temp = start.value;
			start.value = end.value;
			end.value = temp;
			start = start.next;
			end = end.prev;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomDoublyLinkedList list = new CustomDoublyLinkedList();
		String str = "1. Press 1 to insertFirst\n2. Press 2 to insertLast\n3. Press 3 to insert an element at particular index\n4. Press 4 to removeFirst\n5. Press 5 to removeLast\n6. Press 6 to remove an element at particular index\n7. Press 7 to reverse the LinkedList\n8. Press 8 to display the LinkedList\n9. Press 9 to display the LinkedList in reverse\n10. Press 10 to exit\nEnter your choice";
		System.out.println(str);
		int choice = sc.nextInt();

		while (choice != 10) {
			switch (choice) {
				case 1:
					System.out.println("Enter Element");
					list.insertFirst(sc.nextInt());
					System.out.println(str);
					choice = sc.nextInt();
					break;

				case 2:
					System.out.println("Enter Element");
					list.insertLast(sc.nextInt());
					System.out.println(str);
					choice = sc.nextInt();
					break;

				case 3:
					System.out.println("Enter index");
					int i = sc.nextInt();
					System.out.println("Enter element");
					list.insert(i, sc.nextInt());
					System.out.println(str);
					choice = sc.nextInt();
					break;

				case 4:
					System.out.println("Deleted Element [" + list.removeFirst() + "]");
					System.out.println(str);
					choice = sc.nextInt();
					break;

				case 5:
					System.out.println("Deleted Element [" + list.removeLast() + "]");
					System.out.println(str);
					choice = sc.nextInt();
					break;

				case 6:
					System.out.println("Enter Index");
					System.out.println("Deleted Element [" + list.remove(sc.nextInt()) + "]");
					System.out.println(str);
					choice = sc.nextInt();
					break;

				case 7:
					list.reverse();
					System.out.println(str);
					choice = sc.nextInt();
					break;

				case 8:
					list.display();
					System.out.println(str);
					choice = sc.nextInt();
					break;

				case 9:
					list.displayRev();
					System.out.println(str);
					choice = sc.nextInt();
					break;

				default:
					choice = 10;
					break;
			}
		}
		sc.close();
	}
}
