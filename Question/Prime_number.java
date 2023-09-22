package Question;

public class Prime_number {
    public static boolean isPrime(int n){
    //     boolean isPrime=true;
    //     for(int i=2; i<=n-1; i++){
    //            if(n%i==0){
    //             return false;
                
    //            }
    //     }
    //     return true;
    // }
    

    // 2: optimized code 
    if(n==2){
        return true;
    }

    for(int i=2; i<=Math.sqrt(n); i++){
        if(n%i==0){
            return false;
        }


    }
    return true;
}

    public static void main(String args[]){

        int x=5;
        // int sum=0;
        // for(int i=1; i<=x; i++){
        //     if(isPrime(i)){
        //         sum+=i;

        //     }
        // }
        System.out.println(isPrime(5));

    }
}
