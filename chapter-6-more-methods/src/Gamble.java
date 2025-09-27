/*
|  Alright class, here is an example of using the
|  SecureRandom class to generate lottery ticket numbers.
|  
|  As you may or may not be aware, I have a crippling 
|  gambling addiction that causes me great stress almost daily.
|  Both my FanDuel and Stake accounts are thousands of dollars 
|  in the red. However, this is not important to learning Java,
|  so I digress.
|
|  To further expand on the difficult-to-follow secure-random.txt
|  in the notes/ directory, here is some example code that generates
|  lottery ticket numbers, then consequently displays them in a pretty
|  format.
|  
|  This java program is also a demonstration of the public 
|  and static keywords. We can do all of these things among multiple
|  class files, or alternatively, just somewhere in our file containing
|  main. For this example, class Gamble is also a driver class.
|
|  Read the commented code for an explanation. I'm going to buy some
|  scratchers and 5 o'clock after this, if you must know.
|  If you catch me out in Quahog, say "hi," but if you meet me at 
|  the Clam I'm a talkative guy.
|
|   [gray wave note to self: surely I won't regret posting this to 
|   a relatively professional github account]
*/

import java.security.SecureRandom;  // here is the secure random import statement
import java.util.Scanner;           // don't know if I'll need this
public class Gamble {               // our class that has attributes and methods
    // Below is a method to generate a random number 1-70. We will call this
    // method multiple times using a for loop later.
    
    public static int generateWhiteNumber(){          
        SecureRandom r = new SecureRandom();    // Instantiating SecureRandom object as variable r
        int randomNumber = r.nextInt(70);       // Using the inherited method nextInt() from class random
        return randomNumber;                    // Method declaration has a datatype. It must return.
    }
    
    // Below is a method to generate a random number 1-24. This method will only be invoked once.
    public static int generateMegaBall(){
        SecureRandom r = new SecureRandom();    // Instantiation of object of class SecureRandom
        int rando = r.nextInt(24);              // create a number, store in rando variable
        return rando;                           // our classic return statement.
    }
    
    // Below is the method to actually print the lottery numbers.
    // Everything present in this method except for two lines is expected
    // prior knowledge.
    
    public static void printNumbers(){
        System.out.println("-----------------------------");
        System.out.printf("%8s%s%8s%n"," ", "Mega Millions"," ");
        System.out.println("-----------------------------");
        System.out.println();
        System.out.print("  ");
        for (int i = 1; i <= 5; i++){
            // this is a so-called "worker node" of "boss node" printNumbers.
            int num = generateWhiteNumber();    // Method invocation stacking
            System.out.printf("%s%d%s"," ",num," ");
        }
        // this is a so-called "worker node" of "boss node" printNumbers.
        int lastNum = generateMegaBall();       // Method invocation stacking
        System.out.printf("%s%d"," ",lastNum);
        System.out.println();
    }
    
    // Driver class. Asks the user to gamble
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.printf("Would you like to gamble? (Y/N):\t");
        String user = in.nextLine();
        if (user.toLowerCase().equals("y") || user.toLowerCase().equals("yes")){
            printNumbers();
            System.out.println();
            System.out.println("Better luck next time, bud.");
        } else if (user.toLowerCase().equals("n") || user.toLowerCase().equals("no")){
            System.out.println("You made the right choice.");
            System.out.println("Your wallet will thank you!");
        }
    } 
}
