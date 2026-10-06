public class Main {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node getIntersection(Node headA, Node headB) {

        Node p1 = headA;
        Node p2 = headB;

        while (p1 != p2) {

            if (p1 == null) {
                p1 = headB;
            } else {
                p1 = p1.next;
            }

            if (p2 == null) {
                p2 = headA;
            } else {
                p2 = p2.next;
            }
        }

        return p1;
    }

    public static void main(String[] args) {

        // Common part
        Node common1 = new Node(8);
        Node common2 = new Node(10);

        common1.next = common2;

        // List A: 3 -> 7 -> 8 -> 10
        Node headA = new Node(3);
        headA.next = new Node(7);
        headA.next.next = common1;

        // List B: 99 -> 8 -> 10
        Node headB = new Node(99);
        headB.next = common1;

        Node intersection = getIntersection(headA, headB);

        if (intersection != null) {
            System.out.println("Intersection = " + intersection.data);
        } else {
            System.out.println("No intersection");
        }
    }
}
