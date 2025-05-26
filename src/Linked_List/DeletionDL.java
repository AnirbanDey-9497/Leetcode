package src.Linked_List;

class NodeDDL {
    int data;
    NodeDDL next;
    NodeDDL prev;

    public NodeDDL(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    NodeDDL head;

    public void append(int data) {
        NodeDDL newNode = new NodeDDL(data);

        if (head == null) {
            head = newNode;
            return;
        }

        NodeDDL current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;
    }

    public void printList() {
        NodeDDL current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void deleteFromHead() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // Move head to the next node
        head = head.next;

        // If the new head is not null, remove reference to old head
        if (head != null) {
            head.prev = null;
        }
    }

    public void deleteFromTail() {
        if(head==null || head.next==null)
        {
            deleteFromHead();
            return;
        }
        NodeDDL current=head;
        while(current.next.next!=null)
        {
            current=current.next;
        }
        current.next.prev=null;
        current.next=null;

    }

    public void deleteFromK(int k)
    {
        if(head==null|| head.next==null)
        {
            deleteFromTail();
            return;
        }
        NodeDDL temp=head;
        int count=1;
        while (temp!=null & count<k-1)
        {
            temp=temp.next;
            count++;

        }
        if(temp==null||temp.next==null)
        {
            return;
        }
        NodeDDL ddl=temp.next;
        temp.next=ddl.next;
        if(ddl.next!=null)
            ddl.next.prev=temp;
    }

    public void deleteK(int var)
    {
        if(head==null) return;
        if(head.data==var)
        {
            deleteFromHead();
            return;
        }
        NodeDDL check=head;
        while(check!=null)
        {
            if(check.data==var)
            {
                check.prev.next=check.next;
                if(check.next!=null) check.next.prev=check.prev;
                return;
            }
            check=check.next;
        }
    }

}

public class DeletionDL {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.append(12);
        list.append(78);
        list.append(98);
        System.out.println("Original List:");
        list.printList();

        list.deleteK(98);
        System.out.println("After deleting from head:");
        list.printList();
    }
}