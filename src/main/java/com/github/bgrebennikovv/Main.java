package com.github.bgrebennikovv;

public class Main {
    public static void main(String[] args) {

        // Task 1
        int humanAge = 25;
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
            System.out.printf("\nЕсли скорость %s км/ч, придется заплатить штраф\n", driverSpeed);
        } else {
            System.out.printf("\nЕсли скорость %s км/ч, можно ездить спокойно\n", driverSpeed);
        }

        // Task 4
        if (humanAge >= 2 && humanAge <= 6) {
            System.out.printf("""
                    
                    Если возраст человека равен: %s, то ему нужно ходить в детский сад.
                    
                    """, humanAge);
        } else if (humanAge >= 7 && humanAge <= 17) {
            System.out.printf("""
                    
                    Если возраст человека равен: %s, то ему нужно ходить в школу.
                    """, humanAge);
        } else if (humanAge >= 18 && humanAge <= 24) {
            System.out.printf("""
                    
                    Если возраст человека равен: %s, то ему нужно ходить в университет.
                    """, humanAge);
        }
        else if (humanAge > 24) {
            System.out.printf("""
                    
                    Если возраст человека равен: %s, то ему пора ходить на работу.
                    """, humanAge);
        }

    }
}