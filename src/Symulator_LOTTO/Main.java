package Symulator_LOTTO;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(getWinNumbers()));
        System.out.println(Arrays.toString(getUserNumbers()));
    }


    private static Integer[] getUserNumbers() {
        Integer[] numbers = new Integer[6];
        Scanner scanner = new Scanner(System.in);
        boolean flag, flag1, flag2;

        System.out.println("Podaj swoje liczby:");
        for (int i = 0, number; i < 6; i++) {
            flag = true;
            while (flag) {
                number = scanner.nextInt();
                flag1 = number >= 1 && number <= 49;
                flag2 = Arrays.asList(numbers).contains(number);

                if (flag1 && !flag2) {
                    numbers[i] = number;
                    flag = false;
                } else {
                    if (!flag1) {
                        System.out.println("Liczba ma być w przedziale od 1 do 49");
                    }
                    if (flag2) {
                        System.out.println("Już podawałeś taką liczbę");
                    }
                }
            }

        }


        return numbers;
    }

    private static Integer[] getWinNumbers() {
        Integer[] nubmers = new Integer[49];

        for (int i = 0; i < nubmers.length; i++) {
            nubmers[i] = i + 1;
        }

        Collections.shuffle(Arrays.asList(nubmers));
        return nubmers;
    }
}
