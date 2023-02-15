

class Single_Linked_List
{
    
    public static void main(String[] args) 
    {
        Single_Linked_List ll = new Single_Linked_List();

        ll.addData(1);
        ll.addData(2);
        ll.addData(3);
        ll.addData(4);
        ll.addData(5);

        ll.display();
        System.out.println("\n");
        ll.insertFirst(20);
        System.out.println("After the Insertion \n");
        ll.insertLast(30);  
        ll.insertAtIndex(100, 3);
        ll.display();

    }

    private class node
    {
        private int data;
        private node next;

        public node(int data)   // Constructor
        {
            this.data = data;
            this.next = null;
        }
        
        public node(int data, node next)
        {
            this.data = data;
            this.next = next;
        } 
    }

    // Head & Tail Initialization 
    public node head = null;
    public node tail = null;

    public void insertFirst(int value)
    {
        node first = new node(value);
        first.next = head;
        head = first;
    }
    
    public void insertLast(int val)
    {
        node last = new node(val);
       // temp = head;
        if(head == null)
        {
            System.out.println("List is Empty");
            addData(val);
        }
        else
        {
            tail.next = last;
            tail = last;

        }
    }
    
    public void insertAtIndex(int value, int index)
    {
        if(index == 0)
        {
            insertFirst(value);
           // size++;
            return;
        }
        else if(index == size)
        {
            insertLast(value);
            //size++;
            return;
        }
        else
        {
            node temp = head;
            for(int i = 1; i<index; i++)
            {
                temp = temp.next;
            }

            node atloc = new node(value, temp.next);
            temp.next = atloc;
            size++;
        }
    }

    public void addData(int data)
    {
        node newnode = new node(data);  // Point to the class node for initialization

        if(head == null)
        {
            head = newnode;
            tail = newnode;
        }
        else
        {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void display()
    {
        node current = head;

        if(head == null)
        {
            System.out.println("Empty Linked List ");
            return;
        }
        
        while(current != null)
        {
            System.out.print(current.data +" ");
            current = current.next;
        }
    }

}
