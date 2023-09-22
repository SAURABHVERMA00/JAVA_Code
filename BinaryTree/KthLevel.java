package BinaryTree;

public class KthLevel {

    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static void kthLevel(Node root, int level , int key){
        if(root==null){
            return ;

        }

        if(level==key){
            System.out.print(root.data+" ");
            return;
        }
        kthLevel(root.left, level+1, key);
        kthLevel(root.right, level+1, key);


    }
    public static void main (String args[]){
        /* 
                1 
              /   \
             2     3
            /  \   / \
           4    5  6  7
        
         */

         Node root = new Node(1);
         root.left=new Node(2);
         root.right=new Node(3);
         root.left.left=new Node(4);
         root.left.right=new Node(5);
         root.right.left=new Node(6);
         root.right.right=new Node(7);
        int key=3;
        kthLevel(root, 1, key);
      

       



    }
    
}
