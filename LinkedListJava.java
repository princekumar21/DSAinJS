
public class LinkedListJava {
    static class Node {
        int data;
        Node next;

        Node(int data1) {
            data = data1;
            next = null;
        }
    }

    static Node convertArrToLL(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    static Node DeleteHeadOfLL(Node head) {
        if (head == null)
            return head;
        head = head.next;
        return head;
    }

    static Node deleteTailOfLL(Node head) {
        if (head == null || head.next == null)
            return null;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    static Node DeleteKElement(Node head, int k) {
        if (head == null)
            return null;

        Node temp = head;
        if (k == 1) {
            temp = temp.next;
            return temp;
        }
        Node mover = null;
        int counter = 1;
        while (k != counter && temp.next != null) {
            mover = temp;
            temp = temp.next;
            counter += 1;
        }
        mover.next = temp.next;
        return head;
    }

    static Node DeleteElementWithValue(Node head, int value) {
        if (head == null)
            return null;

        Node temp = head;
        if (value == temp.data) {
            temp = temp.next;
            return temp;
        }
        Node mover = null;
        int counter = 1;
        while (temp.data != value && temp.next != null) {
            mover = temp;
            temp = temp.next;
            counter += 1;
        }
        mover.next = temp.next;
        return head;
    }

    static Node InsertAtHeadOfLL(Node head, int val) {
        Node temp = new Node(val);
        if (head == null) {
            temp.next = null;
            return temp;
        }
        temp.next = head;
        return temp;
    }

    static Node InsertAtTailOfLL(Node head, int val) {
        Node temp = new Node(val);
        if (head == null) {
            temp.next = null;
            return temp;
        }
        Node newHead = head;
        while (newHead.next != null) {
            newHead = newHead.next;
        }
        newHead.next = temp;
        temp.next = null;
        return head;
    }

    static Node InsertAtKPosition(Node head, int val, int k) {
        if (head == null)
            return head;

        Node temp = new Node(val);
        Node newHead = head;
        if (k == 1) {
            temp.next = head;
            return temp;
        }

        int counter = 1;
        Node mover = null;

        while (counter != k && newHead.next != null) {
            mover = newHead;
            newHead = newHead.next;
            counter += 1;
        }
        mover.next = temp;
        temp.next = newHead;
        return head;
    }

    static Node InsertBeforeValue(Node head, int val, int data) {
        if (head == null)
            return head;

        Node temp = new Node(val);
        Node newHead = head;
        if (data == head.data) {
            temp.next = head;
            return temp;
        }

        Node mover = null;
        while (newHead.data != data && newHead.next != null) {
            mover = newHead;
            newHead = newHead.next;
        }
        mover.next = temp;
        temp.next = newHead;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 9, 6};
        Node head = convertArrToLL(arr);
        // Node newHead = DeleteHeadOfLL(head);
        // Node newHead = deleteTailOfLL(head);
        // Node newHead = DeleteKElement(head, 2);
        // Node newHead = DeleteElementWithValue(head, 4);
        // Node newHead = InsertAtHeadOfLL(head, 20);
        // Node newHead = InsertAtTailOfLL(head, 20);
        // Node newHead = InsertAtKPosition(head, 29, 2);
        Node newHead = InsertBeforeValue(head, 3, 6);
        Node temp = newHead;
        while (temp != null) {
            System.out.print(" - " + temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
}
