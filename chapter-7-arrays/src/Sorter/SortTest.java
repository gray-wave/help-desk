/*
| Here is a package containing a simple bubble sort in Java.
| This SortTest class is a driver class containing both a randomly
| generated array (lines 15 - ), the random array printed out 
| (lines 22 - 26), and method calls to the BubbleSort class. 
| 
| The BubbleSort class contains methods for sorting 
| high to low (line 28)
| low to high (line 34) 
*/
package Sorter;
import java.security.SecureRandom;
public class SortTest {
    public static void main(String[] args) {
        SecureRandom r = new SecureRandom();
        int indices = r.nextInt(0,10);
        int elements = 0;   
        int a[] = new int[indices];
        for (int i = 0; i < a.length; i++){
            a[i] = elements = r.nextInt(1,100);
        }
        System.out.println("Unsorted Array:");
        for (int i = 0; i < a.length; i++){
            System.out.printf("%d%s",a[i]," ");
        }
        System.out.println("");
        
        BubbleSort.BubbleSortLargeToSmall(a);
        for (int i = 0; i < a.length; i++){
            System.out.printf("%d%s",a[i]," ");
        }
        System.out.println("");
        
        BubbleSort.BubbleSortSmallToLarge(a);
        for (int i = 0; i < a.length; i++){
            System.out.printf("%d%s",a[i]," ");
        }
    }
}
