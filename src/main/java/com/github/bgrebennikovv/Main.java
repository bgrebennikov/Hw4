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

    }
}