package main.java.pl.sda.javastart.homework.src;
//15. Należy napisać program przyjmujący dwie liczby (scanner) i wykonujący na nich różne działania w pętli while
// (w zależności od wyboru - "+", "-" itd - tu można użyć if...else lub switch). Program powinien zakończyć
// działanie po wpisaniu "koniec".

import java.util.Scanner;

public class Task15 {
    static double result;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Wpisz pierwszą liczbę i drugą liczbę:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();


String end="";
char sign=scanner.next().charAt(0);;
        while (!(sign=='k')) {
            System.out.println("jeżeli chcesz zakonczyc wpisz \"koniec\"");
            end =scanner.next();
            System.out.println("Podaj znak działania ( +,  -, *, /, ^, \"k\"):");
            sign=scanner.next().charAt(0);

            switch (sign) {
                case '+':
                    result= num1 + num2;
                    break;
                case '-':
                    result= num1 - num2;
                    break;
                default:
                    System.out.println("Spoko");
                    break;

            }
        }
        System.out.println(result);
    }
}