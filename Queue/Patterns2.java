package Queue;
import java.util.*;
public class Patterns2 {

    //  Hollow rectangle.......
    public static void hollowrect(int row , int cols){
        for (int i=1 ; i <= row ; i++){
            //  inner loop
            for ( int j=1 ; j<= cols ; j++ ){
                if ( i==1 || i==row|| j==1 || j==cols ){
                    // boundary cells
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

//  Inverted Half Pyramid
public static void inverted (int row , int cols){
    // outer loop
    for (int i=1; i<=row ; i++){
        //  inner loop
        //  spaces
        for (int spaces = 1 ; spaces <= row-i ; spaces++){
            System.out.print(" ");
        
        }
        //  stars
        for (int stars =1; stars <= i; stars++){
            System.out.print("*");
        } 
        System.out.println();
    }
   
}

public static void halfInverted(int row, int cols){
    for (int i=1; i<=row; i++){
        // numbers
        for (int j=1; j<=row-i+1 ; j++){
            System.out.print(j);

        }
        System.out.println();

    }
}
public static void floyds(int row, int cols){
     int k=1;
    for (int i=1; i<=row ; i++){
       
        for(int j=1; j<=i ; j++){
            System.out.print(k);
            k++;
        }
        System.out.println();
    }

}
public static void triangle_0_1 (int row, int cols){
    for (int i=1 ; i<= row ; i++){
        // inner loop
        for (int j=1 ; j<=i ; j++){
            if ( (i+j)%2==0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }
        System.out.println();
    }

}
public static void butterfly(int row , int cols){
    //  first half
    for (int i=1 ; i<=row ; i++) {
        //  inner loop
        // stars;
        for (int stars=1; stars<=i ; stars++ ) {
            System.out.print("*");
        }
        // spaces
        for (int spaces=1 ; spaces<=2*(row-i) ; spaces++ ){
            System.out.print(" ");
        }
        // stars
        for (int stars=1; stars<=i ; stars++ ) {
            System.out.print("*");
        }
        System.out.println();
    }
    //     second half
    for ( int i = row ; i>=1 ; i-- ){
        // inner loop

        for (int stars=1; stars<=i; stars++) {
            System.out.print("*");
        }
    // spaces
        for (int spaces=1 ; spaces<=2*(row-i) ; spaces++ ){
            System.out.print(" ");
        }
    // stars
        for (int stars=1; stars<=i ; stars++ ) {
            System.out.print("*");
        }
        System.out.println();

    }


    }


           
        
   

    public static void solid_rhombus(int n){
        // outer loop
        for (int i=1; i<=n; i++){
            // inner loop
            //  spaces
            for(int j=1; j<=n-i ; j++){
                System.out.print(" ");

            }
            // stars
            for (int j=1; j<=n; j++){
                System.out.print("*");

            }

            System.out.println();

        }

    }

    public static void hollow_rhombus(int n){
        //  outer loop
        for ( int i=1; i<=n; i++){
            // inner loop
            //  spaces
            for ( int j=1; j<=n-i ; j++){
                    System.out.print(" ");
            } 
            //  stars
            for (int j=1; j<=n ; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                    
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int n){
        
        for (int i=1; i<=n; i++){
            //  inner loop
            //  spaces
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
            //  stars
            for (int stars=1; stars<=2*i-1; stars++){
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i=n; i>=1; i--){
            //  inner loop
            //  spaces
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
            //  stars
            for (int stars=1; stars<=2*i-1; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void number_pyramids(int n){
        for (int i=1; i<=n ; i++){
        //  inner loop
        // spaces
            for (int space=1; space<=n-i; space++){
                System.out.print(" ");

            }
        // number
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();

}
}
    public static void pallindromic_pattern(int n){
        for (int i=1; i<=n; i++){
            //  inner loop
            // spaces
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
         // number
            for(int num=i; num>=1; num--){
                System.out.print(num);

            }
            //  ascending 
            for(int num=2; num<=i; num++){
                System.out.print(num);
            }
            System.out.println();

}

}
    public static void main (String args[]){
        Scanner sc = new Scanner ( System.in);
        int n= sc.nextInt();
        // int cols =sc.nextInt();
       pallindromic_pattern(n);


    }
    
}
