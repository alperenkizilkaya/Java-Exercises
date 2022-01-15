package Uygulama4LocalTime;

import java.time.LocalTime;

public class Uygulama4 {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();

        System.out.println(localTime);

        LocalTime xTime = LocalTime.of(22,15);

        System.out.println(xTime);
    }
}
