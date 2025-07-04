package linkedList;

public class CircularLinkedList {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;

    void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            newNode.next = newNode;
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            newNode.next = newNode;
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
        head = newNode;
    }

    void deleteNode(int key) {
        if (head == null) return;

        Node curr = head, prev = null;

        // If head node holds the key
        if (head.data == key) {
            if (head.next == head) {
                head = null;
                return;
            }

            Node last = head;
            while (last.next != head) {
                last = last.next;
            }

            head = head.next;
            last.next = head;
            return;
        }

        do {
            prev = curr;
            curr = curr.next;
            if (curr.data == key) {
                prev.next = curr.next;
                return;
            }
        } while (curr != head);
    }

    void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtBeginning(1);
        cll.insertAtEnd(2);
        cll.insertAtEnd(4);
        cll.insertAtEnd(5);
        cll.printList(); // 1 2 4 5

        cll.deleteNode(4);
        cll.printList(); // 1 2 5

        cll.deleteNode(1);
        cll.printList(); // 2 5

        cll.deleteNode(5);
        cll.printList(); // 2
    }
}
