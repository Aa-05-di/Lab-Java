import java.util.*;

class Linked{

    class Node{
        int data;
        Node prev,next;

        Node(int item){
            this.data=item;
            prev=next=null;
        }
    }

    Node head;

    public Linked(){
        head=null;
    }

    public void Addnode(int item){
        Node node=new Node(item);
        if(head==null){
            head=node;
        }
        else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=node;
            node.prev=current;
        }
    }

    public void Deletenode(int item){
        if(head==null){
            System.out.println("The DLL is empty");
        }
        if(head.data==item){
            if(head.next==null){
                head=null;
            }
            else{
                head=head.next;
                head.prev=null;
            }
        }
        else{
            Node current=head;
            Node previous=null;;
            while(current.data!=item && current!=null){
                previous=current;
                current=current.next;
            }
            if(current==null){
                System.out.println("No such item exists");
            }
            if(current.next!=null){
                current.next.prev=previous;
            }
            if(current.prev!=null){
                previous.next=current.next;
            }
        }
    }

    public void display(){
        Node current=head;
        if(current==null){
            System.out.println("The DLL is empty");
        }
        else{
            while(current!=null){
                System.out.print(current.data+"->");
                current=current.next;
            }
            System.out.print("NULL\n");
        }
    }

    public static void main(String[] args) {
        int item;
        Scanner s=new Scanner(System.in);
        Linked L=new Linked();
        while(true){
            System.out.println("MENU");
            System.out.println("1.AddNode\n2.DeleteNode\n3.Display");
            System.out.println("Enter your choice:");
            int n=s.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter the item");
                    item=s.nextInt();
                    L.Addnode(item);
                    break;
                case 2:
                    System.out.println("Enter the item to delete:");
                    item=s.nextInt();
                    L.Deletenode(item);
                    break;
                case 3:
                    L.display();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
