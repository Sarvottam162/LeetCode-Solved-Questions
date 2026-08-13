class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyHashSet {

    Node head;

    public MyHashSet() {
        head = null;
    }

    public void add(int key) {

        // If key already exists, don't add it
        if (contains(key)) {
            return;
        }

        Node newNode = new Node(key);

        // Empty list
        if (head == null) {
            head = newNode;
            return;
        }

        // Go to the last node
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void remove(int key) {

        // Empty list
        if (head == null) {
            return;
        }

        // Key is at head
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null) {

            if (temp.next.data == key) {
                temp.next = temp.next.next;
                return;
            }

            temp = temp.next;
        }
    }

    public boolean contains(int key) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == key) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }
}