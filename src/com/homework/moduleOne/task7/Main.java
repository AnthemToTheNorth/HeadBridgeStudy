package com.homework.moduleOne.task7;

public class Main {

    /*Перевод числа из арабской системы в римскую*/
    /*Списано*/

    public static void main(String[] args) {

        int num = 2024;
        System.out.println(intToRoman(num));

    }

    public static String intToRoman(int num) {

        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[num/1000] + hundreds[(num%1000)/100] + tens[(num%100)/10] + ones[num%10];

    }

}
