/*
|  **Driver Class to be used in conjunction with
|  class NameAndNumber**
|  
|  Here we have our driver class for NameAndNumber.
|  This class contains our main method. Our main
|  is able to access the methods of NameAndNumber
|  when we instantiate an object from it.
|
|  In this class, we have temporary variables
|  that are overwritten by Java's built-in
|  Scanner class, which is our way to access stdin. 
|
|  Our person2 object is instantiated, but never used.
|  It will have default values printed from it [which
|  without a constructor method with defaults], which
|  will default to Null.
|
|  A fun exercise would be to set a first name, last
|  name, and number for our object "person2".
|
|  A difficult exercise would be to separate the area code
|  and last 7 digits of the phone number!
|
*/

import java.util.Scanner;

public class NameNumTest {
    public static void main(String[] args){
        NameAndNumber person = new NameAndNumber();     // Creating a NEW object of our class NameAndNumber
        NameAndNumber person2 = new NameAndNumber();    // Another new object of our class NameAndNumber
        String tmp;
        int temp;
        Scanner in = new Scanner(System.in);
        System.out.printf("%s\t\t","Enter First Name: ");
        tmp = in.nextLine();
        person.setFirstName(tmp);
        System.out.printf("%s\t\t","Enter Last Name: ");
        tmp = in.nextLine();
        person.setLastName(tmp);
        System.out.printf("%s\t","Enter Phone Number, no dashes: ");
        temp = in.nextInt();
        person.setNumber(temp);
        System.out.println(person.getFirstName());      // Will return whatever user sets
        System.out.println(person.getLastName());       // Will return whatever user sets
        System.out.println(person.getNumber());         // Will return whatever user sets
        System.out.println(person2.getFirstName());     // Should return "null"
    }
}
