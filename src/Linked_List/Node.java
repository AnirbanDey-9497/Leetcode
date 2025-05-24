package src.Linked_List;

public class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

class LinkedList {
     Node head;

     public void append(int data)
     {
         Node newNode = new Node(data);

         if(head==null)
         {
             head=newNode;
             return;
         }
         Node current= head;
         while (current.next!=null)
         {
             current=current.next;
         }
         current.next=newNode;
     }

     public void printList()
     {
         Node current= head;
         while (current!=null)
         {
             System.out.println(current.data);
             current=current.next;
         }
     }

}

class Main
{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.append(12);
        list.append(78);
        list.append(98);
        list.printList();
    }
}

