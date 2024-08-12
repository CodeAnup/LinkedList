class Node1{
    int data;
    Node next;

    Node1(int data1, Node next1){
        data=data1;
        next=next1;
    }
    Node1(int data1){
        data=data1;
        next=null;
    }

}
public class Delete_Kth {
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
    public static Node convertKth(Node head, int k){
        Node temp=head;
        Node prev=null;
       if(head==null){
           return head;
       }
       if(k==1){
           return head;
       }
       int count=0;
       while(temp!=null){
           count++;

           if(count==k){
               prev.next=prev.next.next;
               break;
           }
           prev=temp;
           temp=temp.next;
       }
        return temp;
    }
    public static void main(String[] args) {
        int arr[]={2,3,6,3,1,7,8};
        int k=3;

        Node head=convertArr(arr);
        head=convertKth(head,k);
        System.out.println("The array elements after deleting the kth element is: "+head.data);
    }
}
