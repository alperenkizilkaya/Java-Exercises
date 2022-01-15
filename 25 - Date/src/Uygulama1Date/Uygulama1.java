package Uygulama1Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Uygulama1 {

    public static void main(String[] args) {

        Date date = new Date();

        System.out.println(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        //DateFormat DateFormat = new SimpleDateFormat("dd/MM/yyyy");

        String newFormat = simpleDateFormat.format(date);

        System.out.println(newFormat);
    }
}
