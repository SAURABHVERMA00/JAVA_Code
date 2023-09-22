package String;
import java.util.*;
//lexicographic order -- 
//  apple, banana, mango


// .compareTo function -- upper case lower case alag alag leta hai  
// time complexity - o(totallength*N);

// if 0: equal
// <0:str1<str2
// >0:str1>str2

//  comparetoignorecase -- sare case same hote hai 






public class Largest_string {
    

    public static void main(String args[]){
        String fruits[]={"apple","mango","banana"};

        String largest =fruits[0];
         for(int i=1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];

            }
         }
         System.out.println(largest);

    } 
}
