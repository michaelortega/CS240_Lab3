
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeAndDate {
    private Calendar calendar;
    private final String startDate = "03012017 09:00";
    private final String endDate = "41"; // feb 1
    private final String closingTime = "21:00";
    private Date date;
    private DateFormat dateFormat;
    private DateFormat intFormat;
    private DateFormat timeFormat;
    private DateFormat halfDateFormat;


    public TimeAndDate() {
        dateFormat = new SimpleDateFormat("MMddyyyy HH:mm");
        halfDateFormat = new SimpleDateFormat("MMddyyyy");
        intFormat = new SimpleDateFormat("Md");
        timeFormat = new SimpleDateFormat("HH:mm");
        calendar = Calendar.getInstance();
        try {
            date = dateFormat.parse(startDate);
            calendar.setTime(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public void nextHour() {
        calendar.add(Calendar.HOUR,1);
        date = calendar.getTime();
    }

    public void nextDay() {
        calendar.add(Calendar.DATE, 1);
        String resetTime = halfDateFormat.format(calendar.getTime())+" 09:00";
        try {
            date = dateFormat.parse(resetTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    public int dateToInt() {
        int intDate = Integer.parseInt((intFormat.format(date)));
        return intDate;
    }

    public boolean isEndOfMarch() {
        return endDate.equals(this.getDate());
    }

    public boolean isOpen() {
        return closingTime.equals(timeFormat.format(date));
    }


    public void print() {
        //System.out.println(dateFormat.format(date));
        //calendar.setTime(date);
        System.out.println(dateToInt());
    }

    public String getDate() {
        return intFormat.format(date);
    }

public static void main(String[] args) {
    TimeAndDate t = new TimeAndDate();
    t.print();
    t.print();
    t.print();
}

    public boolean isRestockTime(){
        return timeFormat.format(date).equals("09:00");

    }

}
