package linkedlists;

public class Nth {

    static Integer nthFromLast(Node head, int n) {
        Node right = head;
        Node left = head;

        for (int i = 0; i < n; i++) {

            if (right == null) {
                return null;
            }

            right = right.child;

        }

        while (right != null) {
            right = right.child;
            left = left.child;
        }

        return left.value;
    }

    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        Node current = new Node(1, null);
        for (int i = 2; i < 8; i++) {
            current = new Node(i, current);
        }
        Node head = current;
        // head = 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> (null)

        Node current2 = new Node(4, null);
        for (int i = 3; i > 0; i--) {
            current2 = new Node(i, current2);
        }
        Node head2 = current2;
        // head2 = 1 -> 2 -> 3 -> 4 -> (null)

        System.out.println(nthFromLast(head, 1)); // should return 1.
        System.out.println(nthFromLast(head, 5)); // should return 5.
        System.out.println(nthFromLast(head2, 2)); // should return 3.
        System.out.println(nthFromLast(head2, 4)); // should return 1.
        System.out.println(nthFromLast(head2, 5)); // should return null.
        System.out.println(nthFromLast(null, 1)); // should return null.
    }

}
