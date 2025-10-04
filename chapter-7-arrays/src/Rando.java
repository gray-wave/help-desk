/*
|  --- under construction ---
|  Check this. 
|  Also I just learned like a bunch of Rage Against the Machine basslines.
|  
|  Might purchase a 6-string bass today... depends on whether or not my
|  scratch-off lottery tickets are winners. Still have yet to learn 
|  audacity for a stupid music project I've been putting off for months.
|  Once again, has nothing to do with Java. None of this block comment does.
|  
|  Alright what sort of nonsensical brainrot should I reference
|  here? Time to take copious amounts of benadryl and talk to
|  the hat man, just in time for Halloween! Diphenhydramine abuse yippie!
|  
|  This has never been a drill. Instagram reels are eating up my time,
|  and so are the scratchers.
| 
|  500 cigarettes.
|  White monster drinkin' white monster until it creates another white monster.
|  Commented code below.
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
            arr[i] = member;                // loading array with members (tee hee, lmao)
        }
        
        // Table "heading" for pretty printing
        System.out.printf("%s\t%s%n","Index","Element");
        System.out.println();
        // enhanced for loop
        for (int num : arr){
            System.out.printf("%d\t%d%n",idx,num);
            idx++;      // possibly unneeded variable
        }
    }
}
