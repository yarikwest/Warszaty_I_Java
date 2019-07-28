package Kostka_do_gry;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(dropCubs("D12-1"));
    }

    static int dropCubs(String str) {
        int result = 0;
        int amount, cub;
        Random random = new Random();
        String[] tab = {"1", "0", "0"};
        String[] drop = str.split("[D,+,-]");

        for (int i = 0; i < drop.length; i++) {
            if (!"".equals(drop[i])) {
                tab[i] = drop[i].trim();
            }
        }
        amount = Integer.parseInt(tab[0]);
        cub = Integer.parseInt(tab[1]);

        while (amount > 0) {
            result += random.nextInt(cub)+1;
            amount--;
        }
        if (str.contains("+"))
            result += Integer.parseInt(tab[2]);
        else if (str.contains("-"))
            result -= Integer.parseInt(tab[2]);

        return result;
    }
}
