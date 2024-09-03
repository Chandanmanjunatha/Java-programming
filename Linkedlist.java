// Node class to represent each node in the linked list
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linkedlist class to manage the singly linked list
class Linkedlist {
    Node head;

    Linkedlist() {
        head = null;
    }

    // Insert a node at the beginning of the list
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert a node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Insert a node at a specific position in the list
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                throw new IndexOutOfBoundsException("Position out of range");
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Delete a node from the beginning of the list
    public void deleteFromBeginning() {
        if (head != null) {
            head = head.next;
        } else {
            System.out.println("List is empty. Nothing to delete.");
        }
    }

    // Delete a node from the end of the list
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
        } else if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    // Delete a node from a specific position in the list
    public void deleteFromPosition(int position) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
        } else if (position == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1 && current.next != null; i++) {
                current = current.next;
            }
            if (current.next == null) {
                throw new IndexOutOfBoundsException("Position out of range");
            }
            current.next = current.next.next;
        }
    }

    // Display the elements of the list
    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        // Insert nodes
        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtPosition(15, 1);
        list.displayList(); // Output: 10 -> 15 -> 20 -> 30 -> null

        // Delete nodes
        list.deleteFromBeginning();
        list.displayList(); // Output: 15 -> 20 -> 30 -> null

        list.deleteFromEnd();
        list.displayList(); // Output: 15 -> 20 -> null

        list.deleteFromPosition(1);
        list.displayList(); // Output: 15 -> null
    }
}
