package Array;

/*first you calculate left maximum and right maximum and then both of minimum .
 Area =(total height-height)*weight
  */
public class Trapped_RainWater {
    public static void trapped_rain(int arr[]){
        
        //Calculate left maximum boundary
        int leftmax[]=new int[arr.length];
       
         leftmax[0]=arr[0];
         for(int i=1; i<arr.length; i++){
           leftmax[i]=Math.max(arr[i],leftmax[i-1]);
         }


        

       
        // calculate right maximum bounday
         int rightmax[]=new int[arr.length];
         rightmax[arr.length-1]=arr[arr.length-1];
         for(int i=arr.length-2; i>=0; i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
         }
        //loop\
         int trapped_water=0;
        for(int i=0; i<arr.length; i++){
            // waterlevel =min(leftmax,rigthmax)
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trapped_water+=waterlevel-arr[i];



        }
        System.out.println(trapped_water);
        
        //trapeed water = waterlevel-height[];

    }

    public static void main(String ars[]){
        int arr[]={4,2,0,6,3,2,5};
        trapped_rain(arr);


    }
    
}
