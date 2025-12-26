/* 
| This class has two methods. BubbleSortLargeToSmall and
| BubbleSortSmallToLarge.
| 
| The inner loop of each compares each element based upon
| a temporary integer value tmp, which is reset by the 
| loop after each comparison.
| 
| The outer loop guarantees that the sort has completed
| properly by comparing the elements multiple times. For
| small inputs, this should suffice. However, due to the
| O log of n squared time complexity (caused by nested fors),
| large inputs will be inefficient.
| 
| These methods have been declared static so as to avoid headaches.
| Recall that array datatypes are always passed by reference.
*/
package Sorter;
public class BubbleSort {
    public static void BubbleSortLargeToSmall(int [] arr){
        // O log (n ^ 2)
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - 1; j++){
                int tmp = arr[j];
                if (tmp < arr[j+1]){
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    public static void BubbleSortSmallToLarge(int [] arr){
        // O log (n ^ 2)
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - 1; j++){
                int tmp = arr[j];
                if (tmp > arr[j+1]){
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}
