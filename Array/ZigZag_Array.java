package Array;
/*
 zigzag means  - arr[0]<arr[1]>arr[2]<arr[3]>arr[4]<.......

 implement -
 first we intitiate   input-[4,3,7,8,6,2,1]
 flag=1 - (x<y) - is 4 is less than 3 No means swap the 4 and 3 -[3,4,7,8,6,2,1]

 flag=0 -(x>y) - is 4 is greater than 7 No means swap tha 7 and 4 - [3,7,4,8,6,2,1]

flag=1 -(x<y) - is 4 is less than 8 Yes  means No swap tha 8 and 4 - [3,7,4,8,6,2,1]

flag=0 -(x>y) - is 8 is greater than 6 Yes means No swap tha 8 and 6 - [3,7,4,8,6,2,1]

flag=1 -(x<y) - is 6 is less than 2 No means swap tha 6 and 2 - [3,7,4,8,2,6,1]

flag=0 -(x>y) - is 6 is greater than 1 Yes means No swap tha 6 and 1 - [3,7,4,8,2,6,1]

our final answer is [3,7,4,8,2,6,1]

 */
public class ZigZag_Array {
    public static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
     public static void zigzag(int arr[],int n){

        int flag=1; // flag==1 means x<y => true no swap if false swap

        for(int i=0; i<n-1; i++){
           

            if(flag==1){ // x<y 
                if(arr[i]>arr[i+1]){ // false condition
                    swap(arr, i, i+1);
                }
                flag=0;
            }

            else{// x>y
                if(arr[i]<arr[i+1]){ // false condition
                    swap(arr, i, i+1);
                }

                flag=1;
            }

            // flag=0 means x>y

        }


     }
    public static void main(String args[]){
        int arr[]={4,3,7,8,6,2,1};
         for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

         System.out.println();


        zigzag(arr, 7);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

     
    }

    
}
