package Array;

import java.util.*;

public class Pair_three_sum {

    public static void main(String args[]){

 
    
    int arr[]={1,2,3,4,3,0,6};

    int x=7;
    int count=0;
    // int sum=0;
    ArrayList<Integer> arr1= new ArrayList<>();

    for(int i=0; i<arr.length-2; i++){
        int target= x-arr[i];
        int start =i+1;
        int end=arr.length-1;


      while(start<end){
        int sum=arr[start]+arr[end];
        if(sum<target){
           start++;
        }
        else if(sum>target){
            end--;
        }
        else{
            // int a=arr[start];
            // int b=arr[end];
            // ArrayList<Integer> arr2=new ArrayList<>();
            // arr2.add(arr[i]);
            // arr2.add(arr[start]);
            // arr2.add(arr[end]);

            
           
            // arr1.addAll(arr2);
            count++;

           
        }

      }
        

    }

    System.out.println(count);
}
       }
 
