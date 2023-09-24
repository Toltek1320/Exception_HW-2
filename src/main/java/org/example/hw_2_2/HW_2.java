package org.example.hw_2_2;

// Если необходимо, исправьте данный код
// (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

public class HW_2 {
    public static void main(String[] args) {
        try {
            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int d = 8;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка! Деление на ноль недопустимо!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Введенный индекс находится вне длины массива!");
        }
    }
}

