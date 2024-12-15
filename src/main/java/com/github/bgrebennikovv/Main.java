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
        } else if (humanAge > 24) {
            System.out.printf("""
                    
                    Если возраст человека равен: %s, то ему пора ходить на работу.
                    """, humanAge);
        }

        // Task 5

        int childAge = 6;
        if (childAge <= 5) {
            System.out.printf("\n\nЕсли возраст ребенка равен %s, то ему нельзя кататься на аттракционе.", childAge);
        } else if (childAge >= 5 && childAge <= 14) {
            System.out.printf("\n\nЕсли возраст ребенка равен %s, то ему можно кататься на аттракционе в сопровождении взрослого.", childAge);
        } else {
            System.out.printf("\n\nЕсли возраст ребенка равен %s, то ему можно кататься на аттракционе без сопровождения взрослого.", childAge);
        }

        // Task 6
        int trainCapacity = 102;
        int sittingPlaces = 60;
        int standingPlaces = trainCapacity - sittingPlaces;

        int passengersCount = 40;

        System.out.printf("""
                \n
                Вместимость поезда: %s чел.
                Сидячих мест: %s, Стоячих: %s.
                Если в вагоне %s пассажиров, то:
                """, trainCapacity, sittingPlaces, standingPlaces, passengersCount);

        if (passengersCount >= trainCapacity) {
            System.out.println("Вагон полностью забит. (Нет мест)");
        } else if (passengersCount < sittingPlaces) {
            System.out.printf("""
                    Есть %s сидячих мест
                    """, sittingPlaces - passengersCount);
        } else {
            System.out.printf("""
                    Есть %s стоячих мест
                    """, trainCapacity - passengersCount);
        }

        // Task 7

        int one = 5;
        int two = 7;
        int three = 1;

        System.out.printf("""
                
                Даны числа: %s, %s, %s
                """, one, two, three);

        int max;

        if (one >= two && one >= three) {
            max = one;
        } else if (two >= one && two >= three) {
            max = two;
        } else {
            max = three;
        }

        System.out.printf("Найбольшее число: %s", max);

    }
}