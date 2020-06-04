package com.lits.second;

public class WorkClass {

    public void ArrayReverse() {

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

    public static Boolean Polindrom(String str) { // приймаємо слово яке хочимо перевірити

        int i = 0, j = str.length() - 1;  // змінна i на початкову букву, j на кінцеву

        while (i < j) {          // працює поки i<j

            if (str.charAt(i) != str.charAt(j)) // змінюємо букву з стрінга на символ в char
                return false;                   // якщо символи не однакові то вертаємо false
            i++;
            j--;

        }
        return true;                       //  якщо є співпадіння вертаємо true
    }
}
