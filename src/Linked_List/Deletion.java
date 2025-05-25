package src.Linked_List;
import src.Linked_List.Node;
public class Deletion {
    public static void main(String [] args)
    {
        LinkedList2 list=new LinkedList2();
        int [] values = {12,46,78,45};
        list.fromArray(values);
        list.deleteByValue(46);
        list.printList();
    }

}

class LinkedList2 {
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

    public void deletefromhead()
    {

        if(head==null) return;

        head=head.next;
            return;


    }
    public void deletefromtail()
    {
        if(head==null )
        {
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }

    public void deleteFromK(int k)
    {
        if(head==null)
        {
            return;
        }
        if(k==1)
        {
            deletefromhead();
        }
        int count=1;
        Node temp=head;
        Node prev=null;
        while(temp!=null)
        {

            if(count==k)
            {
                if(prev!=null)
                {
                    prev.next=temp.next;
                }
                return;
            }
            prev=temp;
            temp=temp.next;
            count++;

        }
    }
    public void deleteByValue(int k)
    {
        if(head==null)
        {
            return;
        }
        if(k== head.data)
        {
            deletefromhead();
        }

        Node temp=head;
        Node prev=null;
        while(temp!=null)
        {

            if(temp.data==k)
            {
                if(prev!=null)
                {
                    prev.next=temp.next;
                }
                return;
            }
            prev=temp;
            temp=temp.next;


        }
    }


}
