// Of course the obvious "   ---UNDER CONSTRUCTION---   " still applies.
// This code was a happy accident while attempting to do homework.
// It's awfully cool if you download and run it (:
// 
/*
|
|  All I know about this program is that I didn't print enough stars.
|  The inner loop completes first, and functions as our y-variable
|  for our hypothetical, yet nonexistent 2 dimensional array that we are...
|  printing.
| 
|  Couldn't explain to you how to decrement a loop with an incrementing
|  iterator... We'll come back to this, for certain... since it's due
|  tomorrow. Been stuck on problems like this for a hot minute.
|
|  Could I find some function f(x) that explains when we print a star,
|  and when we print a space? I tried to figure it out, but boy am I 
|  stuck for this evening. Also, it cannot be a function, as it fails
|  the vertical line test... hmmmm.
|
|  Also, I usually prefer to use int i and int j in my for loops. 
|  However, I am attempting to truly understand what is occuring each 
|  iteration of each loop. And it is more easily demonstrated when
|  we know rows versus columns.
|  
*/
public class Stairs {
    public static void main(String[] args){
        int a = 9;
        char st = '*';
        char sp = ' ';
        
        for (int row = 1; row <= (2*a); row++){
            int stars = 2 * row - 1;
            System.out.println();
            for (int col = 1; col <= row; col++){
                
                int spaces = (2 * row - 1) / 2;   // semantic error here. Likely should be done in outer loop.
                    if (spaces >= col){           // also this if statement should likely be rewritten.
                        System.out.print(sp);
                        spaces--;
                    } else {
                        System.out.print(st);
                    }
            }
        } System.out.println();
    }
