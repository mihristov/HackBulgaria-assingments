import java.util.Date;

public class Time {

    private int hours;
    private int mins;
    private int secs;
    private int day;
    private int month;
    private int year;

    public static void main(String[] args) {
        System.out.println(Time.now().toString());
    }

    public Time(int hours, int mins, int secs, int day, int month, int year) {
        this.hours = hours;
        this.mins = mins;
        this.secs = secs;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static Time now() {
        Date d = new Date();
        return new Time(d.getHours(), d.getMinutes(), d.getSeconds(), d.getDay(), d.getMonth(), d.getYear());
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d %02d:%02d:%04d", this.hours, this.mins, this.secs, this.day, this.month,
                this.year + 1900);
    }

}
