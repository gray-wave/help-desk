import java.util.Scanner;
public class TimeTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // This is when I finished programming this, no other reason why I picked this time.
        Time t1 = new Time(15,31,39);
        Time.displayTime(t1);
        Time t2 = new Time();
        
        System.out.println("Enter the current hours (0-23):");
        int hr = in.nextInt();
        String sc = in.nextLine();
        System.out.println("Enter the current minutes (0-59):");
        int mi = in.nextInt();
        sc = in.nextLine();
        System.out.println("Enter the current seconds (0-59)");
        int se = in.nextInt();
        sc = in.nextLine();
        t2.setHours(hr);
        t2.setMinutes(mi);
        t2.setSeconds(se);
        Time.displayUniversalTime(t2);
        in.close();
    }
}
