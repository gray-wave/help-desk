/*
|  
|  **To be used in conjunction with class NameNumTest**
|  
|  Here we have an example of code with multiple
|  setter and getter methods. They are also referred
|  to as simply "set" and "get" methods, due to
|  convention.
|
|  We first must declare these instance variables 
|  for our class. We do not assign any data to
|  these variables, because that is what the
|  set method's purpose is; they are there for
|  instance variable assignment.
|
|  It is important to note that there is no main
|  class present in this file. This is just to 
|  construct an object of class "NameAndNumber".
|
*/
public class NameAndNumber {
    // Necessary Instance Variables
    private String firstName;
    private String lastName;
    private int number;
    // Begin Setters || Set Methods
    void setFirstName(String fName){
        this.firstName = fName;     // Here is an example of "this" keyword
    }
    void setLastName(String lName){
        lastName = lName;           // Works the same with or without "this" keyword
    }
    void setNumber(int num){
        number = num;
    }
    // End Setters || Set Methods
    // Begin Getters || Get Methods
    public String getFirstName(){   // Specified return type in method header
        return firstName;
    }
    public String getLastName(){    // Specified return type in method header
        return lastName;
    }
    public int getNumber(){         // Specified return type in method header
        return number;
    }
    // End Getters || Get Methods
}
