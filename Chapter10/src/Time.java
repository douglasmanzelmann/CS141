import java.util.Calendar;

/**
 * Created by dmanzelmann on 1/17/14.
 */
public class Time {
    public int hour, minute, second;

    public Time() {
        hour = Calendar.HOUR_OF_DAY;
        minute = Calendar.MINUTE;
        second = Calendar.SECOND;
    }

    public static void main(String[] args) {
        Time t = new Time();

        System.out.println("Time: " + t.hour + ":" + t.minute + ":" + t.second);
    }
}
