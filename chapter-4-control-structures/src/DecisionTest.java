/*
|  
|  This file is to be used in conjunction with Decision.java. It is where our
|  main method resides to set and get attributes. If we wanted to interact
|  with the user, we would import the Scanner class. 
|
|  Also, it is always good programming practice to close the Scanner
|  when your procedure is done.
|
|  This is just a sequence demonstrating constructor overloading,
|  how to set default parameters, and multi-alternative if structures
|  in the Decision class file.
|  
|  
*/
import java.util.Scanner;
public class DecisionTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        Decision defaultEmployee = new Decision();
        Decision grayWave = new Decision("Gray Wave",46500.57);
        
        System.out.println(defaultEmployee.getEmpName());
        System.out.println(defaultEmployee.getSalary());
        System.out.println(grayWave.getEmpName());
        System.out.println(grayWave.getSalary());
        
        System.out.println("Congratulations! You're hired!!!");
        System.out.printf("Please enter first and last name:\t");
        String name = in.nextLine();
        System.out.printf("Enter your desired salary:\t");
        double sal = in.nextDouble();
        
        defaultEmployee.setEmpName(name);
        defaultEmployee.setSalary(sal);
        defaultEmployee.determineTaxRate();
    }
}
