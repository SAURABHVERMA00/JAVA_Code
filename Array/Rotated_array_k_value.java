package Array;
// k  value fnd karo rotated array ka ;
/*first of all you find mid and then comapre if equal return mid else  find sorted array in left or right  then condition for checking sorted array is [if(arr[start]<=arr[mid])] then after checking sorting then first search left condition is if arr[start] <=target && target<=arr[mid]       */
public class Rotated_array_k_value {
    public static int  k_th_value (int arr[], int target){
         int start=0;
         int end = arr.length-1;
         while(start<=end){
            int mid=start+end/2;
            if(arr[mid]==target){
                return mid;
            }

            //left check 

            else if(arr[start]<=arr[mid]){
                if(arr[start]<=target && target<=arr[mid]){
                    end=mid-1;

                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(arr[mid]<=target && target<=arr[end]){
                   start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
         }
         return -1;

    }

    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2,3};
        int target=0;
        System.out.println(k_th_value(arr, target));

        
    }

    
}
