package src.Linked_List;
import src.Linked_List.Node;
public class Array2LL {
    public static void main(String [] args)
    {
        LinkedList1 list=new LinkedList1();
        int [] values = {12,46,78,45};
        list.fromArray(values);
        list.printList();
    }

}

class LinkedList1 {
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

    public void fromArray(int[] arr)
    {
        for (int num: arr)
            append(num);
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
