package org.example.hw_2_3;

//Дан следующий код, исправьте его там, где требуется
// (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

public class HW_3 {
        public static void main(String[] args) {
            try {
                int a = 90;
                int b = 3;
                System.out.println(a / b);
                printSum(23, 234);
                int[] abc = {1, 2};
                abc[1] = 9;
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Индекс вне размера массива!");
            } catch (NullPointerException ex) {
                System.out.println("Аргумент не может указывать на null!");
            } catch (ArithmeticException ex) {
                System.out.println("Ошибка! Деление на ноль недопустимо!");
            } catch (Throwable ex) {
                System.out.println("Что-то пошло не так...");
            }
        }
        public static void printSum(int a, int b) {
            System.out.println(a + b);
        }
}
