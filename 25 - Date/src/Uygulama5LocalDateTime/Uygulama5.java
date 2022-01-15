package Uygulama5LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Uygulama5 {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);


        LocalDate localDate = LocalDate.of(2022,1,20);

        LocalTime localTime = LocalTime.of(22,00);

        LocalDateTime localDateTime2 = LocalDateTime.of(localDate,localTime);

        System.out.println(localDateTime2);
    }
}
