package Gra_w_zgadywanie_liczb;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int random = new Random().nextInt(100)+1; // zakres od 1 do 100;
        int liczba;

        do {
            liczba = getNumber();
            if (liczba < random)
                System.out.println("Za mało!");
            else if (liczba > random)
                System.out.println("Za dużo!");
        }
        while (liczba != random);
        System.out.println("Zgadłeś!");
    }

    private static int getNumber() {
        int liczba;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Zgadnij liczbe: ");
            liczba = scanner.nextInt();
            return liczba;
        } catch (InputMismatchException e) {
            System.out.println("To nie jest liczba");
            return getNumber();
        }

    }

}
