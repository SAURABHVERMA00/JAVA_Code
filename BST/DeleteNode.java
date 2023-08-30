package BST;

public class DeleteNode {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data= data;
            this.left=null;
            this.right=null;

        }
    }


    public static boolean search(Node root , int key  ){
        if(root==null){
            return false;

        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left, key);


        }
        else{
            return search(root.right, key);
        }
        
    }

    public static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static Node insert(Node root, int val){
        if(root==null){
           root=new Node(val);
           return root;

        }

        if(root.data>val){
           //left 
           root.left=insert(root.left, val);
        }
        if(root.data<val){
           //right  
           root.right=insert(root.right, val);
        }

        return root;

   }

   public static Node delete(Node root, int val ){
        if(root.data<val){
            root.right=delete(root.right, val);


        }
        if(root.data>val){
            root.left=delete(root.left, val);
        }

        else{
            // voila case 
            //case1 - leaf Node
            if(root.left==null && root.right==null){

                return null;

            }

            //case 2- single child 
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }

            //case 3- Two child
            Node IS= findInorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right, IS.data);

        }
        return root;
   }

   public static Node  findInorderSuccessor(Node  root){

    while(root.left!=null){
        root=root.left ;

    }
    return root;

   }

    public static void main (String args[]){
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        int val=5;
        
        


        for(int i=0; i<values.length;i++){
            root=insert(root, values[i]);
        }

        inorder(root);
         System.out.println();

     delete(root, val);
     System.out.println();
     inorder(root);
    }


}
