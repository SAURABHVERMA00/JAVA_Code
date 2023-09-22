package Others;
public class _2Darray_to_1Darray {

    public static void main (String args[]){
        int n=3; 
        int m=3;
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int index=0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                System.out.print(arr[i]+" ");


            }
            System.out.println();
        }


        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                arr[index++]=arr[i][j];

            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                System.out.print(arr[i]+" ");


            }
            System.out.println();
        }

    }
    
}
