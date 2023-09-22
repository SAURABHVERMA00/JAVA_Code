package Others;
// Binary Search 

public class BinarySearch {
    public static int binarysearch(int arr[],int val){
        int l=0; 
        int r=arr.length-1;
        while(l<=r){
            int mid =(l+r)/2;
        
        if(arr[mid]==val){
            return mid;

        }
        else if(arr[mid]<val){
            l=mid+1;

        }
        else{
            r=mid-1;
        }
    }
    return -1;

    } 

    public static void main(String args[]){
        int arr[]={1,2,3,4,5};

        int val=6;
        System.out.println(binarysearch(arr, val));
    }
    
}
