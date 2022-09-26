package home.leetcode.problem;

public class MyLinklist {
    Node head;

    class Node{
        int  data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

    void push(int id){
        Node node =new Node(id);
        node.next=head;
        head=node;
    }

    void pop() {

        this.head=this.head.next;

    }

    void display(){
          Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }

        }

    public static void main(String[] args) {
        MyLinklist myLinklist=new MyLinklist();
        myLinklist.push(1);
        myLinklist.push(2);
        myLinklist.push(3);

        myLinklist.display();
        System.out.println("=======");
        myLinklist.pop();
        myLinklist.display();
    }

    }

