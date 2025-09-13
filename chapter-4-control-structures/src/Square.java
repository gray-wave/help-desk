/*
|
|  Here we have an example of nested control structures.
|  Nested control structures include, but are not limited
|  to a decision structure within a repetition structure,
|  a loop within a loop (AKA repetition within repetition),
|  and so on.
|
|  The best way I've found to think about nested loops is 
|  that your inner loop will be:
|  A) The loop that completes FIRST
|  B) Like an X variable on a graph
|  
|  Likewise, the outer loop wil be:
|  A) The loop that completes LAST
|  B) Similar to the Y variable on a graph.
|
|  Below is some code demonstrating nested
|  while loops. However, this problem is more
|  easily solved by for loops as we will see
|  in the next chapter.
|
*/
public class Square {
    public static void main(String[] args){
        // Variables (not all declared here)
        int l=0;
        int length=5;
        int width=5;
        
        // Nested Control Structures
        while (l <= length){            // "l" increments once as our
            int w = 0;                  // "w" gets to five, and then "w" resets.
            while (w <= width){
                System.out.print("*");
                w++;                    // This will increment to five
                }
            System.out.printf("*%n");   // Prints newline after w == 5
            l++;
        }
    }
}
