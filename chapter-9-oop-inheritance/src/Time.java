/*
|  Same as whatever previous class time with some deleted/changed
|  comments and whatnot.
|  Added some extra stuff about concepts covered in this chapter,
|  like method overriding.
*/
public class Time {
    // private instance variables of class time
    private int hours;      // 0-23
    private int minutes;    // 0-59
    private int seconds;    // 0-59
    
    // default constructor
    public Time(){
        this.hours = 0; 
        this.minutes = 0; 
        this.seconds = 0;  // setting defaults
        // NetBeans 25 was pitching a fit about "flexible constructors,"
        // so this "structure of constructor" will have to do
    }
    // begin overload
    public Time(int hours){
        if (hours < 0 || hours > 23){   // argument validation
        // throwing an exception, must be prefaced by new
        throw new IllegalArgumentException("Hours must be 0-23");
        }
        this.hours = hours;
        this.minutes = 0;
        this.seconds = 0;
    }
    public Time(int hours, int minutes){
        if (hours < 0 || hours > 23){
            throw new IllegalArgumentException("Hours must be 0-23");
        }
        if (minutes < 0 || minutes > 59){
            throw new IllegalArgumentException("Minutes must be 0-59");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = 0;
    }
    public Time(int hours, int minutes, int seconds){
        if (hours < 0 || hours > 23){
            throw new IllegalArgumentException("Hours must be 0-23");
        }
        if (minutes < 0 || minutes > 59){
            throw new IllegalArgumentException("Minutes must be 0-59");
        }
        if (seconds < 0 || seconds > 59){
            throw new IllegalArgumentException("Seconds must be 0-59");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    // copy constructor
    public Time(Time t){
        this(t.hours, t.minutes, t.seconds);
    }
    // end overload, begin modifier methods
    public void setHours(int a){
        if (a < 0 || a > 23){
            throw new IllegalArgumentException("Invalid hours. (0-23)");
        }
        this.hours = a;
    }
    public void setMinutes(int a){
        if (a < 0 || a > 59){
            throw new IllegalArgumentException("Invalid minutes. (0-59)");
        }
        this.minutes = a;
    }
    public void setSeconds(int a){
        if (a < 0 || a > 59){
            throw new IllegalArgumentException("Invalid seconds. (0-59)");
        }
        this.seconds = a;
    }
    // end modifier methods, begin accessor methods
    public int getHours(){
        return this.hours;
    }
    public int getMinutes(){
        return this.minutes;
    }
    public int getSeconds(){
        return this.seconds;
    }
    // end accessor methods.
    
    // demonstration of overriding class Object's toString() method.
    @Override
    public String toString(){
        // formats each parameter to 2 digit places separated by colons
        String universalTime = String.format("%2d:%2d:%2d", hours, minutes, seconds);
        return universalTime;
    }
    public String toTimeString(){
        String timeFormatted = String.format("%d:%02d:%02d %s",
                // ternary if operator "?:" a one-line if statement
                ((hours == 0 || hours == 12) ? 12 : hours % 12),
                minutes, seconds, (hours < 12 ? "AM" : "PM"));
        return timeFormatted;
    }
    // pretty printing methods
    public static void displayTime(Time t){
        System.out.println(t.toTimeString());
    }
    public static void displayUniversalTime(Time t){
        System.out.println(t.toString());
    }
}
