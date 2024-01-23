package com.homework.fourthModule;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        ClientGetCard firstClient = new ClientGetCard("Ivan Ivanov", new GregorianCalendar(1990, 1, 1), new GregorianCalendar(2020, 1, 1));

        System.out.println(firstClient.calculateExpirationDate());

    }
}
