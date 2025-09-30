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

    public static void main(String[] args) {
        int[] arr = { 8, 4, 6 };
        Node head = convertArrayToDLL(arr);
        Node temp = head;
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