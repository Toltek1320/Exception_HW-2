package org.example.hw_2_4;

import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class HW_4 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Введите строку: ");
            input = scanner.nextLine();
        } while (!input.isEmpty());
        System.out.println(input);
        scanner.close();
        throw new NullPointerException("Пустые строки вводить нельзя.");

    }
}


