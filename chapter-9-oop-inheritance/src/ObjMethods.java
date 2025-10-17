/*
|  To be used in conjunction with class Time
}  
|  Here is an example of the equals object method.
|  Note that it is utilized with the member access
|  operator "."/"period"/thing that comes before a
|  file extension (e.g. ".txt" or ".java".)
|  
|  To have .equals return true, omit the new
|  keyword upon instantiation of an object.
|  Keyword new allocates a different portion of memory
|  for the so-called new object to exist. This can
|  also be achieved via the clone method of class Object.
|  
|  Clone implementation is a massive PITA, so it will be
|  omitted here and left as an exercise for the reader. It
|  requires overriding the regular clone method.
|
|  Instead, this file will demonstrate a string representation
|  of an object of class Time using the toString() method.
*/
public class ObjMethods {
    public static void main(String[] args) {
    Time t1 = new Time();
    Time t2 = t1;
    Time t3 = new Time();
    Time t4 = new Time(6,7,21);
    boolean isTrue = t1.equals(t2);
    // two truths and a lie
    System.out.println(isTrue);
    isTrue = t4.equals(t5);
    System.out.println(isTrue);
    boolean isFalse = t1.equals(t3);
    System.out.println(isFalse);
    System.out.println();       // just to separate our two truths and a lie
    String funnyTime = t4.toString();
    System.out.println(funnyTime);  // gives us the class and memory address
    Time.displayTime(t4);       
    } 
}
