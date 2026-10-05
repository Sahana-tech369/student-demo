public class Main {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node deleteNode(Node head, int value) {

        // If list is empty
        if (head == null) {
            return null;
        }

        // If first node needs to be deleted
        if (head.data == value) {
            return head.next;
        }

        Node current = head;

        // Find the node before the node to delete
        while (current.next != null &&
               current.next.data != value) {
            current = current.next;
        }

        // Delete the node
        if (current.next != null) {
            current.next = current.next.next;
        }

        return head;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = deleteNode(head, 30);

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
