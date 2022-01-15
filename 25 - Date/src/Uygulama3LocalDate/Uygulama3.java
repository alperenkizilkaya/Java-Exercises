package Uygulama3LocalDate;

import java.time.LocalDate;

public class Uygulama3 {

    public static void main(String[] args) {


        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate myBirthDay = LocalDate.of(1996,1,4);
        System.out.println("my birthday is : " + myBirthDay);

        LocalDate xDayOfYear = LocalDate.ofYearDay(2022,150);
        System.out.println("150th day of 2022 : " + xDayOfYear);

    }
}
