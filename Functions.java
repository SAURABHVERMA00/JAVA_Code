import java.util.*;
public class Functions {
    public static boolean isPrime(int n){
        if (n==2){
            System.out.println("Prime Number");
        }
        boolean isPrime = true;
        for (int i=2 ; i<n ; i++){
            if(n%i==0){
                isPrime = false;
                break;
               
            
            } 
           
        } 
        return isPrime;
   }
   
   public static boolean isPrime1(int n){
    if (n==2){
        System.out.println("Prime Number ");
    }
    else {
        for (int i =2; i<= Math.sqrt(n); i++){
            if (n%i==0){
                return false;
            }
        }

    }
    return true;
   }

   public static void primerange( int n){
        for (int i=2; i<n ; i++){
            if(isPrime1(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
       
       
   }
   public static void binTodec(int n){
        int digit , dec = 0 , pow1 = 0;
        while (n>0){
            digit = n % 10;
            dec = dec + (digit * (int)Math.pow(2 , pow1));
            pow1++;
            n = n/10;
        }
        System.out.println(dec);
        

   }
   public static void decTobin(int n){
        int pow1=0;
        int bin =0;
        while (n>0){
            int rem = n%2;
            bin = bin + rem * (int)Math.pow( 10 , pow1);
            pow1++;
            n= n/2;



        }
        System.out.print(bin + " ");
   }

   public static void average (int a, int b,int c){
    int avg = (a+b+c)/3;
    System.out.println(avg);
    
   }
   public static void isEven(int n){
    if ( n%2==0){
        System.out.println("true");
    }
    else {
        System.out.println("false");

    }
   }
   public static int  isPallindrome(int n ,int num){
        
        while (n>0){
            int digit = n%10;
            num =(num*10)+digit;
            n=n/10;
        }
        return num;
        
        

      
   }
    public static void main (String args[]){
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        int num=0;
        isPallindrome(n,num);
       
        if (isPallindrome(n, num)==n){
        System.out.println("is Pallindrome");

       }
       else {
        System.out.println("Not is Pallindrome");
       }
       




    
    }


    }

