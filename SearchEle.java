class Node3{
    int data;
    Node next;

    Node3(int data1, Node next1){
        data=data1;
        next=next1;
    }
    Node3(int data1){
        data=data1;
        next=null;
    }

}

public class SearchEle {
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
    public static boolean check(Node head,int k){
        Node temp=head;
        while(temp!=null){
            if(temp.data==k){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=5;
        Node head=convertArr(arr);
        if(check(head,k)==true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
