/*
|  In java, there are 3 types of System.out
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
|  >>>     UNDER CONSTRUCTION     <<<
|
*/
public class FormatPrint {
  public static void main(String[] args){
    String name = "Gray Wave";
    double grade = 72.8735;
    double hourlyWage = 12.45;
    System.out.print("Hello world! ");
    System.out.printf("%s%s%n", "Hello, my name is ",name); 
    System.out.printf("%s%.2f%n", "My hourly wage is ",hourlyWage);
    System.out.println(); //brb
  }
}
