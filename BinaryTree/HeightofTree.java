package BinaryTree;
import java.util.*;


public class HeightofTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int height(Node root){
        if(root==null){
            return 0;

        }
        int lefth= height(root.left);
        int righth=height(root.right);
        return Math.max(lefth,righth)+1;


    }

    // count of nOde

    public static int countOfNode(Node root){
        if(root==null){
            return 0;
        }

        int lcount=countOfNode(root.left);
        int rcount=countOfNode(root.right);

        return lcount+rcount+1;
    }

    // sum of Node 

    public static int sumOfNode(Node root){
        if(root==null){
            return 0;

        }

        int leftsum = sumOfNode(root.left);
        int rightsum=sumOfNode(root.right);

        return leftsum+rightsum+root.data;
    }
    

    public static void main (String args[]){
        /* 
               1 
              /  \
             2    3
            /  \   \
           4    5   6
        
         */

         Node root = new Node(1);
         root.left=new Node(2);
         root.right=new Node(3);
         root.left.left=new Node(4);
         root.left.right=new Node(5);
         root.right.left=new Node(6);
         root.right.right=new Node(7);

        //  System.out.println(height(root));
        //  System.out.println(countOfNode(root));
         System.out.println(sumOfNode(root));

    }

}
