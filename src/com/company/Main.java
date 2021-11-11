package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] argsl) {
        System.out.println(winter(generateRandomAge(), 12));
        System.out.println(winter(generateRandomAge(), 23));
        System.out.println(winter(generateRandomAge(),7));
        System.out.println(winter(generateRandomAge(), 11));
        System.out.println(winter(generateRandomAge(), 21));

    }


    public static String winter(int age, int temerature) {
        if (age >= 20 && age <= 45 && temerature <= -20 && temerature >= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temerature >= 0 && temerature < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temerature >= -10 && temerature >= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        Random rand = new Random();
        int int_random = rand.nextInt(290);
        return int_random;

    }
}

