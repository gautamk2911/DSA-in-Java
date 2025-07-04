package linkedList;

public class DoublyLinkedList {

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;

    void insertAtBeginning(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
            return;
        }

        Node last = head.prev;

        newNode.next = head;
        newNode.prev = last;

        head.prev = newNode;
        last.next = newNode;

        head = newNode;
    }

    void insertAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
            return;
        }

        Node last = head.prev;

        newNode.next = head;
        head.prev = newNode;
        newNode.prev = last;
        last.next = newNode;
    }

    void deleteNode(int key) {
        if (head == null) return;

        Node curr = head;

        // Search node with matching key
        do {
            if (curr.data == key) {
                if (curr.next == curr) {
                    head = null;
                    return;
                }

                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;

                if (curr == head) {
                    head = curr.next;
                }

                return;
            }
            curr = curr.next;
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
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtBeginning(1);
        dll.insertAtEnd(2);
        dll.insertAtEnd(3);
        dll.insertAtBeginning(0);
        dll.printList(); // 0 1 2 3

        dll.deleteNode(2);
        dll.printList(); // 0 1 3

        dll.deleteNode(0);
        dll.printList(); // 1 3

        dll.deleteNode(3);
        dll.printList(); // 1
    }
}
