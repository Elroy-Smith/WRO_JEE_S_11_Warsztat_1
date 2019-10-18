package pl.coderslab.warsztat1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main2 {
    static void correctNumbers(Integer[] tab1, int[] tab2) {
        int count = 0;
        for (int r :tab2) {
            for ( int k:tab1){
                if (r==k){
                    count++;
                }
            }
        }
        if (count >=3) {
            System.out.println(count);
        } else {
            System.out.println("Nie trafiles!!!");
        }
    }

    static int[] userNumbers() {
        Scanner scan = new Scanner(System.in);
        int[] tab2 = new int[6];

        String line;
        int number;
        for (int i = 0; i < tab2.length; i++) {
            System.out.println("Podaj liczbę:");

            line = scan.nextLine();
            try {
                number = Integer.parseInt(line);
                if (number < 1 || number > 49) {
                    i--;
                    System.out.println("Podałeś liczbę poza przedziałem. Wprowadź poprawne liczby z przedziału 1-49");
                    continue;

                }
                for (int number2 : tab2) {
                    if (number == number2) {
                        System.out.println("Podales juz taka liczbe");
                        i--;
                        continue;
                    }
                }
                tab2[i] = number;
            } catch (IllegalArgumentException e) {
                i--;
                System.out.println("To nie jest liczba.");
                continue;
            }
        }
        Arrays.sort(tab2);
        System.out.println(Arrays.toString(tab2));
        return tab2;


    }

    static Integer[] randomNumber() {
        Integer[] arr = new Integer[49];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        Collections.shuffle(Arrays.asList(arr));
        Integer[] tab = Arrays.copyOf(arr, 6);
        Arrays.sort(tab);

        return tab;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(randomNumber()));
        userNumbers();
        correctNumbers(randomNumber(),userNumbers());
    }
}
