import org.apache.commons.lang.time.DateUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.parse("1970-01-01T12:34:56");

        //display
        DateTimeFormatter timeColonFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(timeColonFormatter.format(ldt));

        /// //
//        for(var l:DateFormat.getAvailableLocales()){
//            System.out.println(l);
//        }

        Locale loc = new Locale("en", "US");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, loc);

        String dateInString = "12/31";
        try {
            Date date = DateUtils.parseDate(dateInString, new String[] { "yyyy-MM-dd HH:mm:ss", "dd/MM" });
            System.out.println(date.toString());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}