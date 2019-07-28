package Gra_w_zgadywanie_liczb_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min = 0, max = 1000, count = 1, answer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pomyśl liczbę od 0 do 1000, a ja ją zgadnę w max.10 próbach");

        do {
            int guess = ((max - min) / 2) + min;
            System.out.println("Zgaduję: " + guess);
            answer = getAnswer(scanner);

            if (answer == 1)
                max = guess;
            else if (answer == 2)
                min = guess;

            count++;
            if (count > 10) {
                System.out.println("nie oszukuj!");
                break;
            }
        } while (answer != 3);
        System.out.println("Wygrałem!");
        scanner.close();

    }


    private static int getAnswer(Scanner scanner) {
        int answer;
        System.out.println("Wybierz:\t1.Za dużo\t2.Za mało\t3.Zgadłeś");
        answer = scanner.nextInt();

        return answer;
    }
}
