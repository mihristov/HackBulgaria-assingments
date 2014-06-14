import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateLogger extends Logger {

    public DateLogger() {
        super();
    }

    public DateLogger(int level) {
        super(level);
    }

    @Override
    public void log(int level, String message) {
        if (level < 1) {
            throw new NumberFormatException("Integer out of range (<1)!");
        }

        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
        Calendar d = Calendar.getInstance();

        if (level <= this.level) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("|%s| ", dateFormat.format(d.getTime())));
            sb.append(String.format("%d => %s", level, message));

            System.out.println(sb.toString());
        }

    }

    @Override
    public void log(String message) {
        int defaultLevel = 3;

        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
        Calendar d = Calendar.getInstance();

        if (defaultLevel <= this.level) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("|%s| ", dateFormat.format(d.getTime())));
            sb.append(String.format("%d => %s", level, message));

            System.out.println(sb.toString());
        }
    }
}
