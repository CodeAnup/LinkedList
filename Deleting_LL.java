class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        data=data1;
        next=next1;
    }
    Node(int data1){
        data=data1;
        next=null;
    }
}

public class Deleting_LL {
    public static Node convertArr(int arr[]){
       Node head=new Node(arr[0]);
       Node mover=head;

       for(int i=1;i<arr.length;i++){
           Node temp=new Node(arr[i]);
           mover.next=temp;
           mover=temp;
       }
       return head;
    }
    public static Node removeHead(Node head){ //To remove the head of LL
      Node temp=head;
      if(head==null){
          return head;
      }
      temp=temp.next;
      return head;
    }
    public static Node removeTail(Node head){ //To remove the tail of LL
        Node temp=head;
        if(head==null || head.next==null){
            return head;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        Node head=convertArr(arr);
        head=removeHead(head);
        System.out.println("The LL after removing the head element is: "+head.data);
        head=removeTail(head);
        System.out.println("The LL elements after removing the Tail element is: "+head.data);
    }
}
