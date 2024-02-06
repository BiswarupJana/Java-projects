class Linear_LL{
    Node head;
    private int size;

    Linear_LL(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next =null;
            size++;
        }
    }

   

    //add-last

    public void addLast(String data){
        Node newNode =new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
            currentNode.next=newNode;
    }

    //print 
    public void printList(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }


    //delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("This list is empty");
            return;
        }
        size --;
        head = head.next;
    }

    //delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("This list is empty");
            return;
        }
        size --;
        if(head.next == null){
            head = null;
            return;
        }
        
        Node secondLast =head;
        Node lastNode =head.next;
        while(lastNode.next != null){
            lastNode= lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next= null;
    }

    //size
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        Linear_LL list = new Linear_LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("list");
        list.printList();
        list.addFirst("this");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
        list.addFirst("this");
        System.out.println(list.getSize());
    }
     //add- first, last
     public void addFirst(String data){
        Node newNode =new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next =head;
        head = newNode;
    }
}


// import java.util.*;
// class Linear_LL{
// public static void main(String[] args) {
//     LinkedList<String> list = new LinkedList<String>();
//     list.addFirst("a");
//     list.addFirst("is");
//     System.out .println(list);
//     list.addFirst("This");
//     list.addLast("list");
//     System.out .println(list);
//     System.out .println(list.size());
//     for(int i=0 ; i< list.size(); i++){
//         System.out.print(list.get(i)+"->");
//     }
//     System.out.println("Null");

//     // list.removeFirst();

//     // System.out .println(list);
//     // list.removeLast();
//     list.remove(3);
//     list.reverse();

//     System.out .println(list);

// }
// }