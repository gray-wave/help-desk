/*
|
|   >>>   UNDER CONSTRUCTION   <<<
|
*/
import java.util.Scanner;
public class CarClassTest {                  // "Driver Class" contains main method
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        CarClass myCar = new CarClass();     // instantiating class
        // Setting our private variables
        System.out.printf("%s%n", "Enter name of car brand: ");
        String brand = in.nextLine();
        myCar.setMake(brand);               //  brand is our "make"
        
        System.out.printf("%s%n", "Enter name of car model: ");
        String myModel = in.nextLine();
        myCar.setModel(myModel);
        // End set methods, access our private variables with get methods
        System.out.printf("%s%s%n",myCar.getMake(),myCar.getModel());
        // End get methods
    }
}
