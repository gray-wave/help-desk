/*
|  In Java, there are 3 types of System.out
|  printing things that we can do. Each different
|  print method has its benefits and drawbacks.
|
|  The most commonly used output method is 
|  System.out.println(), which can print multiple
|  datatypes and appends a newline character to
|  the end of whatever arguments specified.
|
|  Next, there is System.out.print(), which also
|  can print multiple datatypes; however, it does
|  not append the newline character to the end of
|  arguments specified.
|
|  Last, but certainly not least, is System.out.printf().
|  printf allows for the usage of "format specifiers,"
|  which allow the programmer to hard-code which datatype
|  arguments are to be specified, and in which order they
|  appear. 
|  
|  UNDER CONSTRUCTION (very close to being done!!)
*/
public class FormatPrint {
  public static void main(String[] args){
    // Variable declaration and assignment
    String name = "Gray Wave";
    double grade = 72.8735;
    double hourlyWage = 12.45;
    // End variable declaration and assignment
    System.out.print("Hello world! ");                              //print example
    System.out.printf("%s%s%n", "Greetings, my name is ",name);     //printf example with just strings
    System.out.printf("%s%.2f%n", "My hourly wage is ",hourlyWage); //printf example with decimal numbers and strings.
    System.out.println(grade + "% is my current grade.");           //println example
  }
}
