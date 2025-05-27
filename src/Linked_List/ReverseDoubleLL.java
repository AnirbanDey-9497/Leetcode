package src.Linked_List;

public class ReverseDoubleLL {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.append(12);
        list.append(78);
        list.append(98);
        list.ReverseLinks();
        list.printList();
    }
}


class NodeReverse {
    int data;
    NodeReverse next;
    NodeReverse prev;

    public NodeReverse(int data, NodeReverse next, NodeReverse prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    NodeReverse(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

class DoublyLL {
    NodeReverse head;

    public void append(int data) {
        NodeReverse newNode = new NodeReverse(data);

        if (head == null) {
            head = newNode;
            return;
        }
        NodeReverse current = head;

        while (current.next != null) {
            current = current.next;

        }
        current.next = newNode;
        newNode.prev = current;
    }

    public void printList() {
        NodeReverse current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void fromArray(int[] arr) {
        for (int num : arr)
            append(num);
    }

    public void printReverse() {
        if (head == null) return;

        NodeReverse current = head;

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


    public void ReverseLinks()
    {
        if(head==null)
        {
            return;
        }
        if(head.next==null)
        {
            return;
        }
        NodeReverse temp=null;
        NodeReverse cur=head;

        while(cur!=null)
        {
            temp=cur.prev;
            cur.prev=cur.next;
            cur.next=temp;
            cur=cur.prev;
        }
        if(temp!=null)head=temp.prev;
        return;
    }
}