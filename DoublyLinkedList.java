public class DoublyLinkedList {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data1) {
            data = data1;
            next = null;
            prev = null;
        }
    }

    static Node convertArrayToDLL(int[] arr) {
        if (arr == null || arr.length == 0)
            return null;

        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            Node newTemp = new Node(arr[i]);
            newTemp.prev = temp;
            newTemp.next = null;
            temp.next = newTemp;
            temp = newTemp;
        }
        return head;
    }

    static Node DeleteHeadOfDLL(Node head) {
        if (head == null)
            return null;
        if (head.next == null)
            return null;

        Node temp = head;
        temp = temp.next;
        temp.prev = null;

        return temp;
    }

    static Node DeleteTailOfDLL(Node head) {
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
            temp.prev = null;
            return temp;
        }

        Node mover = null;
        int counter = 1;

        while (counter != k && temp.next != null) {
            mover = temp;
            temp = temp.next;
            counter += 1;
        }

        if (k > counter) {
            return head;
        }

        Node temporary = temp.next;
        mover.next = temporary;
        if (temp.next != null) {
            temporary.prev = mover;
        }

        return head;

    }

    static Node insertNodeBeforeHead(Node head, int val) {
        Node newNode = new Node(val);
        Node temp = head;
        if (head == null) {
            return newNode;
        }
        temp.prev = newNode;
        newNode.next = temp;

        return newNode;
    }

    static Node insertNodeBeforeTail(Node head, int val) {
        Node newNode = new Node(val);
        Node temp = head;

        if (head == null) {
            return newNode;
        }

        if (temp.next == null) {
            temp.prev = newNode;
            newNode.next = temp;
            return newNode;
        }

        while (temp.next != null) {
            temp = temp.next;
        }

        Node newTemp = temp.prev;
        temp.prev = newNode;
        newNode.next = temp;
        newTemp.next = newNode;
        newNode.prev = newTemp;

        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 8 };
        Node head = convertArrayToDLL(arr);
        // Node newHead = DeleteHeadOfDLL(head);
        // Node newHead = DeleteTailOfDLL(head);
        // Node newHead = DeleteKElement(head, 5);
        // Node newHead = insertNodeBeforeHead(head, 5);
        Node newHead = insertNodeBeforeTail(head, 5);
        Node temp = newHead;
        while (temp != null) {
            if (temp.prev == null)
                System.out.print(temp.prev + "  <-  " + temp.data);
            else if (temp.next == null)
                System.out.print(temp.data + "  ->  " + temp.next);
            else
                System.out.print("  <->  " + temp.data + "  <->  ");

            temp = temp.next;
        }
        System.out.println();
    }
}