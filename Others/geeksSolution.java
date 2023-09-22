package Others;

class geeksSolution
{
   
	// public static int findK(int a[][], int n, int m, int k)
	// {
	//    int startrow=0;
	//    int startcol=0;
	//    int endrow=n-1;
	//    int endcol=m-1;
	//    int count=0;
	   
	   
	//    while(startrow<=endrow && startcol<=endcol){
	//        //top
	//        for(int i=startcol; i<=endcol; i++){
	//         //    a[0][p++]=a[startrow][i];
    //         count++;
    //         if(count==k){
    //             return a[startrow][i];
    //         }
                  

	           
	//        }
	//        //right
	//        for(int j=startrow+1; j<=endrow; j++){
	//         //    a[0][p++]=a[j][endcol];
    //          count++;
    //         if(count==k){
    //             return a[j][endcol];
    //         }
                

	//        }
	       
	//        // bottom
	//        for(int i=endcol-1; i>=startcol ; i--){
	//            if(startrow==endrow){
	//                break;
	//            }

    //             // a[0][p++]=a[endrow][i];	
    //              count++;
    //             if(count==k){
    //                 return a[endrow][i];
    //             }
                           
	//        }
	//        // left
	//        for(int j=endrow-1; j>=startrow+1; j--){
	//            if(startcol==endcol){
	//                break;
	//            }
	//         //    a[0][p++]=a[j][startcol];
    //          count++;
    //         if(count==k){
    //             return a[j][startcol];
    //         }
                
	           
	//        }

    //     startrow++;
	//    endrow--;
	//    startcol++;
	//    endcol--;
	       
	//    }

    //   return 0;   
	   
	   
	   

	// }

	
public static void main (String args[]){
    // int a[][]={{1,2,3},{4,5,6},{7,8,9}};
	int height[] = {4,2,0,3,2,5};



    // System.out.println(findK(a,3,3,5));
	  
	// int leftMax[]=new int[height.length];
	// leftMax[0]=height[0];
	// for(int i=1; i<height.length; i++){
	// 	if(height[i]>leftMax[i-1]){
	// 		leftMax[i]=height[i];

	// 	}
	// 	else{
	// 		leftMax[i]=leftMax[i-1];
	// 	}
	// }
	int rightMax[]=new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            if(height[i]>rightMax[i+1]){
                rightMax[i]=height[i];

            }
            else{
                rightMax[i]=rightMax[i+1];
            }
        }


	for(int i=0; i<rightMax.length; i++){
		 System.out.println(rightMax[i]+" ");

	}

	

    
}

	
}