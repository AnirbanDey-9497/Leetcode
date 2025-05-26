package src.Linked_List;

public class Insertion {
    public static void main(String [] args)
    {
        LinkedList3 list=new LinkedList3();
        int [] values = {12,46,78,45};
        list.fromArray(values);
        list.insertTail(100);
        list.printList();
    }

}

class LinkedList3 {
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

    public void insertBeginning(int k)
    {
        Node temp=new Node(k);
        temp.next=head;
        head=temp;

    }

    public void insertTail(int k)
    {
        if(head == null)
        {
            head=new Node(k);
            return ;
        }
        Node temp;
        temp=head;
        while (temp.next!=null)
        {
            temp=temp.next;
        }
        Node newNode= new Node(k);
        temp.next=newNode;
        return;
    }

    public void insertAtK(int k, int val)
    {
        if(head==null)
        {
            if(k==1)
            {
                insertBeginning(val);
                return;
            }
        }
        if(k==1)
        {
            insertBeginning(val);
            return;
        }

        int count=1;
        Node temp=head;
        while(temp.next!=null)
        {
            count++;
            if(count==k-1)
            {
                Node newNode=new Node(val);
                newNode.next=temp.next;
                temp.next=newNode;
            }
            temp=temp.next;

        }
    }

    public void insertValueBeforeK(int k, int val)
    {
        if(head==null)
        {
            return;
        }
        if(head.data==val)
        {
            insertBeginning(val);
            return;
        }

        Node temp=head;
        while(temp.next!=null)
        {

            if(temp.next.data==val)
            {
                Node newNode=new Node(val);
                newNode.next=temp.next;
                temp.next=newNode;
                return;
            }
            temp=temp.next;

        }
    }
}
