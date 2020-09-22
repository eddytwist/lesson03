package com.company;

import java.util.Scanner;

public class TheGame {
    Scanner scanner = new Scanner(System.in);

    public void guessTheNumber() {
        System.out.print("Please, enter the number from 1 to 10: ");
        int userNumber = scanner.nextInt();
        int computerNumber = (int) (Math.random() * 9 + 1);
        if (computerNumber < userNumber)
            System.out.println("My number is less, it is: " + computerNumber);
        else if (computerNumber > userNumber)
            System.out.println("My number is more, it is: " + computerNumber);
        else
            System.out.println("Bingo! I've guessed your number! It is: " + computerNumber);
    }
}
