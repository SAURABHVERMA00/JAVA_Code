import java.util.*;
public class JavaBasic{




 public static void main(String args[]) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        
        if(n==2){
            System.out.println("Prime Number");
        }
        else{
            boolean isPrime=true;
            for (int i=2; i<n; i++){
                if (n%i==0){
                    isPrime=false;
                }
                

            }
            if (isPrime==true){
                System.out.println("n is a Prime Number");

            }
            else{
                System.out.println("n is Not Prime Number");
            }
        }
      
    }
}
