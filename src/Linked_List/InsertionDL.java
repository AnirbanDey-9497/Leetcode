package src.Linked_List;

class NodeDDDL {
    int data;
    NodeDDDL next;
    NodeDDDL prev;

    public NodeDDDL(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyyLinkedList {
    NodeDDDL head;

    public void append(int data) {
        NodeDDDL newNode = new NodeDDDL(data);

        if (head == null) {
            head = newNode;
            return;
        }

        NodeDDDL current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;
    }

    public void printList() {
        NodeDDDL current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void insertHead(int var)
    {
        NodeDDDL io= new NodeDDDL(var);
        if(head==null)
        {
            head=io;
            return;
        }
        io.next=head;
        io.prev=null;
        head.prev=io;
        head=io;
        return;
    }
    public void insertTail(int var)
    {
        if(head==null)
        {
            insertHead(var);
            return;
        }
        NodeDDDL io= new NodeDDDL(var);
        NodeDDDL cur=head;
        while (cur.next!=null)
        {
            cur=cur.next;
        }
        cur.next=io;
        io.prev=cur;

    }
    public void insertBeforeTail(int var)
    {
        if(head==null)
        {
            insertHead(var);
            return;
        }
        NodeDDDL io= new NodeDDDL(var);
        NodeDDDL cur=head;
        while (cur.next!=null)
        {
            cur=cur.next;
        }
        io.prev=cur.prev;
        io.next=cur;
        cur.prev.next=io;


    }
    public  void insertBeforeK(int k, int val)
    {
        if(k<=1 || head==null)
        {
            insertHead(val);
            return;
        }
        NodeDDDL io= new NodeDDDL(val);
        NodeDDDL cur=head;
        int count=1;
        while(cur!=null && count<k)
        {

            cur=cur.next;
            count++;
        }
        if(cur==null)
        {
            insertTail(val);
            return;
        }

        io.next=cur;
        io.prev=cur.prev;
        cur.prev.next=io;
        cur.prev=io;



    }
}
public class InsertionDL {
    public static void main(String[] args) {
        DoublyyLinkedList list = new DoublyyLinkedList();
        list.append(12);
        list.append(78);
        list.append(98);
        System.out.println("Original List:");
        list.printList();

        list.insertBeforeK(3,100);
        System.out.println("After inserting from head:");
        list.printList();
    }
}
