package BitManipulation;
/*
 a ki power n means a*a*a*a... n TC is O(n)
 but we can doo in logn 
 like 3 ki power 5
 5=101
 associte - 101
 1-a
 0-a(square)
 1-a(4)
 1-a(8)
 .
 .
 .
 101 
 (1*a(4)*(1)*(1*a))=a kipow(5); jo ki start wali cheez hai
 example 
 3pow(101);
 a=3; ans=1;

first - ans= ans*a=3*1=3; a=apow(2)3*3=9;
second- wale mw zero aa rha to multiply karenge 1 se  ans=3*1=3 ; a=a(4)=3(a(2))=81;
third- ans=3*81=243; a=81(2);
return ans=243;



 */

public class Fast_Exponenetation {
    public static long fast_ep( int a,int n){
        long ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;


            }
            a=a*a;
            n=n>>1;
        }
        return ans;



    }
    public static void main(String args[]){
        System.out.println(fast_ep(3, 10000));


    }
    
}
