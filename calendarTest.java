/* Basic calendar test */

import org.junit.Test;
import org.junit.Assert;
 
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
 
public class Evaluate {
    MyCalendar calendar = new MyCalendar();
 
    @Test
    public void testGetDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        Assert.assertEquals("getDate() is not returning today's date!", 
                dateFormat.format(date), calendar.getDate());
    }
 
    @Test
    public void testGetTime() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        Assert.assertEquals("getTime() is not returning current time!", 
                dateFormat.format(date), calendar.getTime());
    }
}