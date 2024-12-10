package com.github.bgrebennikovv;

public class Main {
    public static void main(String[] args) {

        // Task 1
        int humanAge = 24;
        if (humanAge >= 18) {
            System.out.printf("""
                    Если возраст человека равен %s, то он совершеннолетний
                    """, humanAge);
        } else {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
        }

        // Task 2
        int temperature = 1;
        System.out.printf("\nНа улице %s градусов\n", temperature);
        if (temperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

        // Task 3
        int driverSpeed = 65;

        if (driverSpeed > 60) {
            System.out.printf("\nЕсли скорость %s км/ч, придется заплатить штраф", driverSpeed);
        } else {
            System.out.printf("\nЕсли скорость %s км/ч, можно ездить спокойно\n", driverSpeed);
        }

    }
}