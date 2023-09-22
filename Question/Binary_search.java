package Question;
import java.util.*;


public class Binary_search {
    public static int isBinary (int arr[],int k){
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==k){
                // System.out.println(mid);
                return mid;

            }
            else if(arr[mid]<k){
               start=mid+1;

            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void isperfect(int n){
        int sum=0;
        for(int i=1; i<n-1; i++){
            if(n%i==0){
                sum+=i;
            }

        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        // int arr[]={1,2,3,4,5};
        int n=6;
        
        // System.out.println(isBinary(arr, k));
        isperfect(10);
      
        
    }
    
}
