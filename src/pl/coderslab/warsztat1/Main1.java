package pl.coderslab.warsztat1;


import java.util.Random;
import java.util.Scanner;

public class Main1 {
    static int randomNumber() {
        Random random = new Random();
        int number = random.nextInt(10) + 1;
        System.out.println(number);
        return number;
    }

    static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zgadnij liczbę:");
        int number;
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("To nie jest liczba");
        }
        number = scanner.nextInt();
        return number;
    }

        static boolean check(int randomNumber) {

        int getNumber = getNumber();


        if ( getNumber< randomNumber){
            System.out.println("Za mało");
            return false;
        } else if (getNumber>randomNumber) {
            System.out.println("Za dużo");

            return false;
        }else {
            System.out.println("Zgadłeś");
            return true;
        }

        }

    public static void main(String[] args) {
       int randomNumber=randomNumber();
       while (!check(randomNumber));

    }



}
