//Singly Linked List and Problems

 package Datastructures;


class Node1{
    int data;
    Node1 next;
    public Node1(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class LinkedList
{
    Node1 newnode, start, shadow, tptr;
    public LinkedList()
    {
        this.start = null;
        this.tptr = null;
    }
    public void insert(int data)
    {
        newnode = new Node1(data);
        for(tptr = start;tptr!=null && tptr.data>data; shadow = tptr, tptr = tptr.next);
        if(tptr == start)
            start = newnode;
        else {
            shadow.next = newnode;
        }
        newnode.next = tptr;
    }
    public void insertAtAnyPos(int data,int pos)
    {
        newnode = new Node1(data);
        for(tptr = start;tptr!=null && (pos--)!=0; shadow = tptr, tptr = tptr. next);
        if(pos!=0 && tptr == null) {
            System.out.print("Invalid position");
            return;
        }
        if(tptr == start)
            start = newnode;
        else
            shadow.next = newnode;
        newnode.next = tptr;
    }

    public boolean searchData(int data)
    {
        for(tptr =start; tptr!=null && tptr.data!=data; tptr=tptr.next);
        return (tptr.data==data)?true:false;
    }

    public void deleteData(int data)
    {
        for(tptr=start;tptr!=null && tptr.data!=data;shadow=tptr,tptr=tptr.next);
        if(tptr==null)
        {
            System.out.print("Data not found");
        }
        else
        {
            if(tptr==start)
                start = start.next;
            else
                shadow.next = tptr.next;
        }
    }
    public void deleteAtPos(int pos)
    {
        for(tptr=start;tptr!=null && (pos--)!=0;shadow=tptr,tptr=tptr.next);
        if(tptr==null && pos!=0)
        {
            System.out.print("Position not found");
            return;
        }
        else
        {
            if(tptr==start)
                start = start.next;
            else
                shadow.next = tptr.next;
        }
    }
    public void display()
    {
        for(tptr = start; tptr!=null; System.out.print(tptr.data + " "), tptr = tptr.next);
    }

    //Finding the Middle element in the Linked List

    public void middle()
    {
        for(tptr = start; tptr!=null && tptr.next != null;shadow = tptr ,tptr = tptr.next.next);
        if(tptr == null)
        {
            System.out.println(shadow.data);
        }
    }

    //Finding Kth position in the Linked List

    public void findAtKthPosition(int pos)
    {
        int k = pos;
        tptr=start;
        while((k--)!= 0)
        {
            tptr = tptr.next;
            if(tptr == null)
            {
                System.out.println("Position not present");
            }
        }
        System.out.println(tptr.data);
    }

    //Length of the Linked List

    public int length(Node1 start){
        int len=0;
        for (tptr=start; tptr!=null;len++,tptr=tptr.next);
        return len;
    }
    public int length()
    {
        return length(this.start);
    }

    //Finding Kth element from end

    public int kFromEnd(int k){
        for(tptr=start;(k--)!=0;tptr=tptr.next);
        for(shadow=start;tptr!=null;tptr=tptr.next,shadow=shadow.next);
        return shadow.data;
    }
    //Reversing the Linked List
    private  void reversePrintLinkedList(Node1 tptr){
        if(tptr==null)
                return;
        reversePrintLinkedList(tptr.next);
        System.out.print(tptr.data + " ");
    }
    //wrapper function
    public void reversePrint()
    {
        reversePrintLinkedList(this.start);
    }
    public void reverseLinkedList()
    {
        Node1 next;
        tptr = start;
        shadow = null;
        while(tptr!=null)
        {
            next = tptr.next;
            tptr.next = shadow;
            shadow = tptr;
            tptr = next;
        }
        this.start = shadow;
    }

    //Creating the loop

    public void loopCreation()
    {
        for(tptr = start; tptr.next != null; tptr=tptr.next);
        tptr.next = this.start.next.next;
    }

    //By Using Floyds Algorithm
    //2 Pointer Approach
    //Hare & Tortoise Algorithm99

    public boolean detectLoop()
    {
        tptr=start.next.next;
        shadow = start;
        while(tptr!=shadow && tptr!=null && tptr.next!=null)
        {
            tptr = tptr.next.next;
            shadow = shadow.next;
        }
        return tptr == shadow;
    }

    public int loopLength()
    {
        int len = 0;
        if(detectLoop()) {
            shadow = shadow.next;
            len = 1;
            while (tptr != shadow) {
                len++;
                shadow = shadow.next;
            }
        }
        return len;
    }
    //Loop Position
    public Node1 loopPosition(){
        int c=2, totallen = 0, looplen = loopLength();
        shadow = start;
        while(c!=0)
        {
            totallen++;
            shadow = shadow.next;
            if(shadow == tptr)
                c--;
        }
        int meetingPos = Math.abs(totallen - looplen-1);
        shadow = start;
        while((--meetingPos)!=0)
            shadow = shadow.next;
        return shadow;
    }

    //Removing the loop from the list

    public void loopRemoval(){
        shadow = loopPosition();
        int c = 0;
        tptr = start;
        while(tptr!=null) {
            if (tptr.next == shadow)
                c++;
            if (c == 2) {
                tptr.next = null;
                return;
            }
            tptr = tptr.next;
        }
    }

    //Rotating the linked List

    public void listRotate(int nor){
        int len = length();
        nor %= len;
        while((nor--)>0){
            for(tptr=start;tptr.next!=null;shadow=tptr,tptr=tptr.next);
            shadow.next = tptr.next;
            tptr.next=start;
            this.start=tptr;
        }
    }

    //Creating the intersection point

    public void intersect(Node1 start, Node1 start1)
    {
        tptr = start1;
        while(tptr.next!=null)
            tptr = tptr.next;
        tptr.next = start.next.next.next;
    }

    //Finding the intersection Point

    public boolean findIntersect(Node1 start, Node1 start1)
    {
        int len1 = length(start);
        int len2 = length(start1);
        int diff = Math.abs(len1 - len2);
        tptr = (len1 > len2)?start : start1;
        while((diff--)>0)
            tptr = tptr.next;
        shadow = (len1<len2)?start : start1;
        while(tptr!=null && shadow!=null)
        {
            if(tptr.next == shadow.next && tptr.next!=null && shadow.next!=null)
                return true;
            tptr = tptr.next;
            shadow = shadow.next;
        }
        return false;
    }

    //Finding the intersection  Position

    public Node1 intersectPos(Node1 start, Node1 start1)
    {
        Node1 nn = new Node1(0);
        if(findIntersect(start,start1))
            return shadow.next;
        return nn.next;
    }
    public void removeIntersection(Node1 start, Node1 start1)
    {
        if(findIntersect(start,start1))
            shadow.next = null;
        else
            System.out.print("Intersection not found");
    }
}
class SinglyLinkedList
{
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(5);
        l.insert(10);
        l.insert(2);
        l.insert(8);
        l.insertAtAnyPos(5,2);
        l.insertAtAnyPos(3,0);
        l.insertAtAnyPos(80,6);
        l.middle();
        l.findAtKthPosition(3);
        System.out.println(l.length());
        System.out.println();
        l.display();
        l.deleteData(5);
        l.deleteAtPos(2);
        System.out.println();
        l.display();
        System.out.println(l.kFromEnd(3));
        System.out.println((l.searchData(2)?"Found":"Not Found"));
        l.reversePrint();
        l.reverseLinkedList();
        l.display();
        l.loopCreation();
        System.out.print(l.detectLoop()?"Looped":"Linear"+" ");
        System.out.println(l.loopLength());
        Node1 loopPos;
        loopPos = l.loopPosition();
        System.out.println(loopPos.data);
        l.loopRemoval();
        System.out.print(l.detectLoop()?"Looped":"Linear");
        System.out.println();
        l.display();
        //l.listRotate(99999);
        //l.display();
        LinkedList l1 = new LinkedList();
        l1.insert(8);
        System.out.println();
        l1.display();
        l.intersect(l.start, l1.start);
        System.out.println();
        l1.display();
        System.out.println(l.findIntersect(l.start,l1.start)?"Yes, Intersected":"Not intersected");
        System.out.println((l.intersectPos(l.start,l1.start)).data);
        l.removeIntersection(l.start,l1.start);
        System.out.println(l.findIntersect(l.start,l1.start)?"Yes, Intersected":"Not intersected");
        System.out.println();
        l1.display();
        System.out.println();
        l.display();
    }
}