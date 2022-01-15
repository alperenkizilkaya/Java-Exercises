package Uygulama2Calendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Uygulama2 {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance(); // it's an abstract class so we cant use "new Calendar()" to create

        calendar.set(2022,0,25);

        Date date = calendar.getTime();

        System.out.println(date);

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("after change format : " + dateFormat.format(date));


        Calendar calendar2 = Calendar.getInstance();

        calendar2.set(2022,0,30);

        System.out.println("is calendar before from calendar2" + calendar.before(calendar2));
        /*
                DIFFERENT WAY TO SET
        calendar.set(Calendar.YEAR,2023);
        calendar.set(Calendar.MONTH,2);
        calendar.set(Calendar.DAY_OF_MONTH,18);

        Date date = calendar.getTime();

        System.out.println(date);*/



    }
}
