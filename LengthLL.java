class Node2{
    int data;
    Node next;

    Node2(int data1, Node next1){
        data=data1;
        next=next1;
    }
    Node2(int data1){
        data=data1;
        next=null;
    }

}

public class LengthLL {
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
    public static int length(Node head){
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
//        System.out.println("The length of the LL is: "+count);
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Node head=convertArr(arr);
        int ans=length(head);
        System.out.println(ans);
    }
}
