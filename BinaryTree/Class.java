package BinaryTree;
import java.util.*;

public class Class{
    
        public static void removeElement(int nums[], int val) {
            int k=0;
            
            for(int i=0; i<nums.length; i++){
                if(nums[i]!=val){
                    nums[k++]=nums[i];
                }
            }
            
        }
    

//     public static void Maxi(int arr[]){
//         int maximum=Integer.MIN_VALUE;

//         for(int i=0; i<arr.length;i++){

//             for(int j=i+1; j<arr.length;j++){

//                 for(int k=j+1; k<arr.length; k++){
//                         if(arr[i]*arr[j]*arr[k]>maximum){
//                             maximum=arr[i]*arr[j]*arr[k];

//                         }
//                 }
//             }
//         }
//         System.out.println("Maximum sum is ="+maximum);

//     }
//     public static void maximum(int arr[]){
//         int maxi=Integer.MIN_VALUE;

        
//             int first=arr[0]*arr[1]*arr[arr.length-1];
//             int second=arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3];

//             if(first>second){
//                 System.out.println("Maximum ="+first);

//             }
//             else{
//                 System.out.println("Maximum ="+second);

//             }
        
//     }
//     public static void main(String args[]){
//         int arr[]={5,7,3,-2,-9,8,-17,2,8};


//         Arrays.sort(arr);

//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }

//         maximum(arr);
    // }

    
}