/* Basic Calendar Problem */

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
 
public class MyCalendar {
 
    public String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return dateFormat.format(date);
    }
    
    public String getTime() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }
}