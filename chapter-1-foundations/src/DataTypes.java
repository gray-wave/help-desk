/*
|  Here, we will talk about some very basic
|  data types that should assist you with the
|  week one homework.
|  
|  Be sure to consult "FormatPrint.java" prior
|  to reading through this file.
|  >>> UNDER CONSTRUCTION <<<
|  Note; need to do printf first.
|
|
*/
public class DataTypes{
  public static void main(String[] args){
    int x;                  // Variable declaration (int)
    x = 5;                  // Variable assignment  (assigning value 5 to x)
    int y = 10;             // One line declare/assign
    float avg = (y + x)/2   // You can also do inline math
    
    String message;         //  <---        <-----    // Variable declaration (String)
    message = "The sum of these numbers is: ";               // Variable assignment
    String message2 = "The average of these numbers is: ";   // One line declare/assign
    System.out.println(message, (x + y));                    // Doing in-line math with println
    System.out.printf("%s%.2f%n", message2, avg);            // Using print formatting
  }
}
// I keep forgetting my closing bracers lol
