/*
|  Literally the exact same code as class Rando
|  except using array methods present in class ArrayList
|
|  Time to play video games and ignore my studies.
*/
import java.util.ArrayList;
import java.security.SecureRandom;
public class Rando2 {
    public static void main(String[] args) {
        SecureRandom r = new SecureRandom();
        ArrayList<Integer> arr1 = new ArrayList<>();
        
        int arrSize = r.nextInt(1,11);
        System.out.printf("Randomly generating array of size: %d%n",arrSize);
        for (int i = 0; i < arrSize; i++){
            int rando = r.nextInt(1,99);
            arr1.add(rando);
        }
        System.out.println("Array generated... Looping through array");
        System.out.printf("%s\t%s%n%n","Index","Element");
        for (int i = 0; i < arr1.size(); i++){
            int intToPrint = arr1.get(i);
            System.out.printf("%d\t%d%n",i,intToPrint);
        }
    }
}
