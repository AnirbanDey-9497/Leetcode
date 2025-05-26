package src.Linked_List;

public class NodeDL {
    int data;
    NodeDL next;
    NodeDL prev;

    public NodeDL(int data, NodeDL next, NodeDL prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    NodeDL(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

class DoubleLinkedList {
    NodeDL head;

    public void append(int data)
    {
        NodeDL newNode = new NodeDL(data);

        if(head==null)
        {
            head=newNode;
            return;
        }
        NodeDL current= head;

        while (current.next!=null)
        {
            current= current.next;

        }
        current.next=newNode;
        newNode.prev=current;
    }

    public void printList()
    {
        NodeDL current= head;
        while (current!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }

    public void fromArray(int[] arr)
    {
        for (int num: arr)
            append(num);
    }

    public void printReverse() {
        if (head == null) return;

        NodeDL current = head;

        // Traverse to the last node
        while (current.next != null) {
            current = current.next;
        }

        // Print in reverse using prev pointer
        while (current != null) {
            System.out.println(current.data);
            current = current.prev;
        }
    }

}

class Main
{
    public static void main(String[] args) {
        DoubleLinkedList list=new DoubleLinkedList();
        list.append(12);
        list.append(78);
        list.append(98);
        list.printList();
    }
}
