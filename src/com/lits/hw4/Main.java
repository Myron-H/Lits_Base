package com.lits.hw4;
/*
 * Домашнє завдання 18.06.2020
 */

// імпорт необхідних бібліотек

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Перевірка email на валідність, створюєм List з емайлами
        List<String> mails = Arrays.asList(
                "info@lits.ua",
                "kom!@123.com",
                "Marta^@hotmail.com",
                "hanets1973@gmail.com");

        // Перевірка
        for (String string : mails) {
            // ^ - з початку строки, [\w.%+-] - всі латинські букви і цифри і знак _, і .%+-, далі має бути знак @,
            // далі [\w-] - всі латинські букви і цифри і знак _, і знак - ,далі має бути . , далі [a-z] - лат букви,
            // далі $ - кінець строки
            if (string.matches("^[\\w.%+-]+@[\\w-]+.[a-z]+$")) {
                System.out.println("Valid mail: " + string);
            }
        }

        System.out.println();

        // Перевірка міжнародного українського номера телефону, створюєм List з номерами телефонів
        List<String> phone = Arrays.asList(
                "+380-631234567",
                "38050134567",
                "380-971235678",
                "+38063-2845826");

        // Перевірка
        for (String number : phone) {
            // ^ - з початку строки, +? - знак + може бути, (380|\+380) - далі номер має починатись з 380 або +380 ,
            // далі -? може бути знак -, \\d{7,9} - від 7 по 9 символів мають бути цифровими, далі $ - кінець строки
            if (number.matches("^+?(380|\\+380)-?[\\d]{7,9}$")) {
                System.out.println("Valid phone: " + number);
            }
        }

        System.out.println();


        System.out.println(indexChar("Hello Java !!!"));
    }
    // Перевірка на повторюваність символів у строці
    public static String indexChar(String str) {

        char[] chars = str.toCharArray();
        int[] index = new int[255];

        for (int i = 0; i < chars.length; i++) {
            index[chars[i]]++;
        }
        for (int i = 0; i < index.length; i++) {
            if (index[i] != 0)

                System.out.println((char) i + " повторюється " + index[i] + " раз");
        }
        return str;
    }
}