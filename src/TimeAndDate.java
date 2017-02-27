import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeAndDate {
    private Date date;
    private Calendar calendar;
    private static final String startTime ="09:00"

    public TimeAndDate() {
        date = new Date();

        calendar.setTimeInMillis();


        SimpleDateFormat dateFormat = new SimpleDateFormat("M dd yyyy");

    }

    public int dateToInt() {
        SimpleDateFormat intFormat = new SimpleDateFormat("Md");
        int intDate = Integer.parseInt((intFormat.format(date)));
        return intDate;
    }

}
