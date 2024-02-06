import java.util.LinkedList;

class ReverseLinkedList {
    Node head;
    private int size;

    ReverseLinkedList() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

     // Add to the end of the list
     public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    // Print
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    // Reverse iteratively
    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currentNode = head.next;
        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;

            // Update
            prevNode = currentNode;
            currentNode = nextNode;
        }

        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head) {
        if(head == null||head.next == null){
            return head;
        }
       Node newHead = reverseRecursive(head.next);
       head.next.next =head;
       head.next =null;
       return newHead;
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        System.out.println("Original List:");
        list.printList();

        list.head =list.reverseRecursive(list.head);

        System.out.println("Reversed List:");
        list.printList();
    }

   
}
