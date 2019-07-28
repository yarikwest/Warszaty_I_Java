package Symulator_LOTTO;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        isWin(getUserNumbers(), getWinNumbers());
    }

    //pobieranie liczb od usera
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

        Arrays.sort(numbers);
        return numbers;
    }

    //losowanie wygranych
    private static Integer[] getWinNumbers() {
        Integer[] numbers = new Integer[49];
        Integer[] winNumbers;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        Collections.shuffle(Arrays.asList(numbers));
        winNumbers = Arrays.copyOf(numbers, 6);
        return winNumbers;
    }

    //sprawdzanie trafienia
    private static void isWin(Integer[] userNumbers, Integer[] winNumbers) {
        int count = 0;

        for (int userNumber : userNumbers) {
            for (int winNumber : winNumbers) {
                if (userNumber == winNumber)
                    count++;
            }
        }
        switch (count) {
            case 1:
                System.out.println("trafiłeś 1 liczbę");
                break;
            case 2: case 3: case 4:
                System.out.println("trafiłeś " + count + " liczby");
                break;
            case 5: case 6:
                System.out.println("trafiłeś " + count + " liczb");
                break;
            default:
                System.out.println("nie trafiłeś");
        }
    }
}
