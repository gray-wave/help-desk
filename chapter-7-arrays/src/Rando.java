/*
|  Commented code below.
|
|  Also, totally won $10 off a two dollar scratcher.
|  Never quit on a hot streak.
|
|  ~~~   gray-wave   ~~~
*/
import java.security.SecureRandom;
public class Rando {
    public static void main(String[] args){
        SecureRandom r = new SecureRandom();// instantiating securerandom
        int len = r.nextInt(1,11);          // create an array of 2-10 members
        int arr[] = new int[len];           // declaring array of random ints
        int idx = 0;                        // index variable for enhanced for
        // gray-wave note: probably a better way to do this than what I've done
        // standard for loop for loading the array
        for (int i = 0; i < len; i++){
            int member = r.nextInt(0,99);   // creating a two digit number every iteration
            arr[i] = member;                // loading array with members
        }
        
        // Table "heading" for pretty printing
        System.out.printf("%s\t%s%n","Index","Element");
        System.out.println();
        // enhanced for loop
        for (int num : arr){
            System.out.printf("%d\t%d%n",idx,num);
            idx++;      // possibly excessive variable
        }
    }
}
