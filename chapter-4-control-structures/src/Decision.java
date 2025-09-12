/*
|  This is to be used in conjunction with class DecisionTest, which is our
|  driver class containing our main method.
|  
|  We will notice in this class Decision that it contains instance variables,
|  setter, and getter methods for each of these private variables.
|
|  These attributes are encapsulated in class Decision.
|  
|  This class Decision also demonstrates an overloaded constructor, which
|  is a way to set default parameters if no arguments are passed to an
|  instantiation of object of class decision.
*/
public class Decision {
    // Instance variables
    private String empName;
    private double salary;
    
    // Begin constructor
    public Decision(){
        this.empName = "Default Name";
        this.salary = 0.0;
    }
    public Decision(String name){
        this.empName = name;
    }
    public Decision(String name,double money){
        this.empName = name;
        this.salary = money;
    }
    // End constructor
    // Begin set methods
    public void setEmpName(String name){
        this.empName = name;
    }
    public void setSalary(double a){
        // here is an example of a decision structure
        // a dual-alternative if decision structure.
        if (a >= 0.0){
            this.salary = a;
        } else {
            System.out.println("Invalid salary. Defaulting to 0.0");
            this.salary = 0.0;
        }
    }
    // End set methods
    // Begin get methods
    public String getEmpName(){
        return this.empName;
    }
    public double getSalary(){
        return this.salary;
    }
    // End get methods
    public void determineTaxRate(){
        // here is a multi-alternative decision structure
        // Also, to toot my own horn, check out these gnarly
        // formatted print streams.
        if (this.salary<=13000){
            System.out.printf("%s%s%n%s%.2f%n%s%n",
                    "Employee:\t", this.getEmpName(),   // function within a function
                    "Salary:\t", this.getSalary(),      
                    "You are part of the low tax bracket.");
        } else if (this.salary>13000 && this.salary<=67000) {
            System.out.printf("%s%s%n%s%.2f%n%s%n",
                    "Employee:\t", this.getEmpName(),
                    "Salary:\t", this.getSalary(),
                    "You are part of the middle tax bracket.");
        } else {
            System.out.printf("%s%s%n%s%.2f%n%s%n",
                    "Employee:\t", this.getEmpName(),
                    "Salary:\t", this.getSalary(),
                    "You are part of the high tax bracket.");
        }
    }
}
