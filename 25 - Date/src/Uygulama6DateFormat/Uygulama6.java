package Uygulama6DateFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Uygulama6 {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String newFormat = localDateTime.format(dateTimeFormatter);

        System.out.println(newFormat);


    }
}
