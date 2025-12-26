/*
| This class demonstrates parallel processing of
| arrays. It is important to note that the only significant
| factor of parallel arrays is that they are two or more
| arrays related by a common index. 
| 
| In this class ParallelArrays, the common index is declared
| as a constant. This helps to avoid array index out of bound
| errors and repetitive typing.
| 
| This class allows the user to input ten total
| String objects representing a name and a time.
*/
import java.util.Scanner;
public class ParallelArrays {
    public static void main(String[] args) {
        final int IDX = 5;
        Scanner in = new Scanner(System.in);
        String [] names = new String[IDX];
        String [] times = new String[IDX];
        for (int i = 0; i < IDX; i++){
            System.out.printf("%s%d\t","Enter name ",i+1);
            names[i] = in.nextLine();
            System.out.printf("%s%d\t","Enter time ",i+1);
            times[i] = in.nextLine();
        }
        for (int i = 0; i < IDX; i++){
            System.out.printf("%s\t%s%n",names[i],times[i]);
        }
    }
}
