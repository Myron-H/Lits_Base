package com.lits.second;

public class Test {

    public void goo() {
        // Конвертування String в Boolean
//        String str1 = "true";
//        String str2 = "ok";
//        String str3 = "false";
//        boolean b1 = Boolean.parseBoolean(str1); // метод Boolean.parseBoolean конвертує String в Boolean
//        boolean b2 = Boolean.parseBoolean(str2);
//        boolean b3 = Boolean.parseBoolean(str3);
//        System.out.println(b1);     // true
//        System.out.println(b2);     // false
//        System.out.println(b3);     // false

        //        String s ="Hello";
        //        for (int i = 0; i < s.length(); i++) {
        //        System.out.print(i);

        int[] arr = {1, 2, 3};
        System.out.println("Завдання 2: ");
        System.out.print("Масив: ");
        for (int value : arr) {
            System.out.print(value + " ");             // Вивід даних масиву по індексу
        }
        System.out.print("Масив у реверсі: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");             // Вивід даних масиву реверсом
        }
        // Результат: 1 2 3 3 2 1
    }
}
