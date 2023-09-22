package Stack;
import java.util.*;

public class StackBQuestion {

// //  Question 1 :

// //  Push At Bottom 

//     public static void pushAtBottom(Stack<Integer> s, int data) {
//         if (s.isEmpty()) {
//             s.push(data);
//             return;

//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }



// //  Question 2 : 

//     public static String reverseString (String str){
//         Stack<Character> s= new Stack <>();
//         int idx = 0;
//         while (idx<str.length()){
//             s.push(str.charAt(idx));
//             idx++;

//         }

//         StringBuilder result = new StringBuilder ("");
//         while (!s.isEmpty()){
//             char curr = s.pop();
//              result.append(curr);

//         }

//         return  result.toString();



//     }

//     public static void reverseStack(Stack<Integer> s){
//         if(s.isEmpty()){
//             return;
            
//         }

//         int top = s.pop();
//         reverseStack(s);
//         pushAtBottom(s, top);


//     }
//     public static void printStack(Stack<Integer> s){
//         while(!s.isEmpty()){
//             System.out.println(s.pop());
//         }


//     }
//     public static void main(String args[]) {
//         // Stack s = new Stack();

//       Stack<Integer> s= new Stack<>();

//         s.push(1);
//         s.push(2);
//         s.push(3);

//         // printStack(s);
//         reverseStack(s);
//         printStack(s);
//     }

public static void pushAtBottom(Stack<Integer> s, int data){        if(s.isEmpty()){
        s.push(data);
        return;
}

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);

    

}

//  reverse a string 

public static String reverse (String str){

    Stack <Character> s= new Stack<>();
    int idx=0;
    while(idx<str.length()){
        s.push(str.charAt(idx));
        idx++;
        


    } 
    StringBuilder result = new StringBuilder("");
    while (!s.isEmpty())
    {
         char curr = s.pop();
         result.append(curr);


    }
    return result.toString();


}

//   3 reverse a stack 

public static void reverse_stack(Stack<Integer> s ){
    if(s.isEmpty())
    {
         return;
    }
    int top=s.pop();
    reverse_stack(s);
    pushAtBottom(s, top);

}public static void printStack(Stack<Integer> s)
{
    while(!s.isEmpty())
    {
        System.out.println(s.pop()); 
    }
}
// public static void main (String args[]){
//     // String str = "abc";
//     // System.out.println(reverse(str));
//     Stack<Integer> s= new Stack<>();
//     s.push(1);
//     s.push(2);
//     s.push(3);

//     // printStack(s);
//     reverse_stack(s);
//     printStack(s);
    
    // Question 4- Stock Span Problem
    public static void stockSpan(int stock[], int span[])
    {
        Stack<Integer> s= new Stack<>();
        span[0] =1;

        s.push(0);
        for(int i=1; i<stock.length ; i++){
            int currPrice= stock[i];
            while(!s.isEmpty() && currPrice > stock[s.peek()]){
                s.pop();

            }
            if(s.isEmpty())
            {
                span[i]=i+1;

            }
            else{
                int prevHigh =s.peek();
                span[i]=i-prevHigh;

            }
            s.push(i); 

        }

    }
    // public static void main (String args[]){
    //     int stock[]= {100,80,60,70,60,85,100};
    //     int span[]=new int[stock.length];
    //     stockSpan(stock, span);

    //     for(int i=0 ;i<span.length ; i++){
    //         System.out.println(span[i]+" ");
    //     }

    // }


// Question 5 - Next Greater  Element
// public static void main (String args[]){
//     int arr[]={6,8,0,1,3};
//     Stack<Integer> s= new Stack<>();
//     int nextGreater[]= new int[arr.length];

//     for (int i=arr.length-1 ; i>=0 ; i-- ){
//         //1 while 

//         while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
//              s.pop();
//         }
//         //2 if-else
//         if(s.isEmpty())
//         {
//             nextGreater[i]=-1;
//         }
//         else{
//             nextGreater[i]= arr[s.peek()];
//         }
//         // push
//             s.push(i);
//     }


//     for(int i=0; i<arr.length; i++){
//         System.out.print(nextGreater[i]+" ");
//     }
//     System.out.println();

// } 

// }
// asked-
//next greater rightside
//next greater leftside
//next smaller rightside
//next smaller leftside

//  valid Parentheses 
public static boolean isValid(String str){

    Stack<Character> s= new Stack<>();
    for (int i=0; i<str.length(); i++){
        char ch=str.charAt(i);
        //opening
        if(ch=='(' || ch=='{' || ch == '['){
            s.push(ch);


        }
        else{
            //closing
            if(s.isEmpty()){
                return false;

            }
            if(( s.peek() == '(' && ch==')' ) ||
            (s.peek()=='{' && ch=='}') || (s.peek()=='[' && ch==']')){
                s.pop();
            }
            else{
                return false;
            }

        }


    }
    if (s.isEmpty()){
        return true;

    }
    else{
        return false;
    }
}


// public static void main  (String args[]){
//     String str ="({})[]"; //true
//     System.out.println(isValid(str));


// }

//Question no - Duplicate number 
// Time complexity - O(n);
public static boolean isDuplicate(String str1){
    Stack<Character> s= new Stack<>();

    for (int i=0 ; i<str1.length(); i++){
        char ch= str1.charAt(i);
        //closing
        if(ch==')'){
            int count=0; 
            while( s.peek() != '('){
                s.pop();
                count++;


            }
            if(count<1){
                return true;
            }
            else{
                s.pop();// opening pair

            }

        }
        else{
            s.push(ch);
        }

    }
    return false;

}
// public static void main (String args[]){
//     String str= "((a+b))";
//     String str1= "(a-b)";
//     System.out.println(isDuplicate(str1));

// }



//Maximum area in histogram ;
public static void maxArea(int arr[]){
    int maxArea =0;
    int nsr[]= new int[arr.length];
    int nsl[]= new int[arr.length];

    // next smaller right
    Stack<Integer> s= new Stack<>();

    for(int i=arr.length-1 ; i>=0 ; i--){
        while (!s.isEmpty() && arr[s.peek()] >= arr[i]){

            s.pop();

        }
        if(s.isEmpty()){
            nsr[i]=arr.length;//-1;
        }
        else{
            //top
            nsr[i]=s.peek();
        }
        s.push(i);
    }

     


    // next smaller left
    s= new Stack<>();

    for(int i=0 ; i<arr.length ; i++){
        while (!s.isEmpty() && arr[s.peek()] >= arr[i]){

            s.pop();

        }
        if(s.isEmpty()){
            nsl[i]=arr.length;//-1;
        }
        else{
            //top
            nsl[i]=s.peek();
        }
        s.push(i);
    } 


    //current area widht = j-i-1 = nsr[i]-nsl[i]-1;
    for(int i=0; i<arr.length; i++){
        int height = arr[i];
        int widht= nsr[i]-nsl[i]-1;
        int currArea= height* widht;

        maxArea = Math.max(currArea, maxArea);


    }

    System.out.println("Max Area in Hostogram = " + maxArea);


}
public static void main (String args[]){
    int arr[]= {2,1,5,6,2,3};
    maxArea(arr);

}

}

 

