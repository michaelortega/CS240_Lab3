import java.text.SimpleDateFormat;
import java.util.Date;

public class SimulatedTime {
    private Date date;
    public SimulatedTime(){
         date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM dd yyyy");
    }

    public int dateToInt(){
        SimpleDateFormat intFormat = new SimpleDateFormat("MMdd");
        int intDate =Integer.parseInt((intFormat.format(date)));
        return intDate;
    }

}
