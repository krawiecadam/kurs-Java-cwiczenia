import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int small = 0;
        int biggest = 0;
        int bigger = 0;

        System.out.println("Podaj trzy liczby:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        // badamy jaki jest num1
        if ((num1 > num2) && (num1 > num3)) {
            biggest = num1;
        } else if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
            bigger = num1;
        } else if (num1 < num2 && num1 < num3) {
            small = num1;
        }
        // badamy jaki jest num2
        if ((num2 > num1) && (num2 > num3)) {
            biggest = num2;
        } else if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
            bigger = num2;
        } else if (num2 < num1 && num2 < num3) {
            small = num2;
        }
// badamy jaki jest num3
        if (num3 > num1 && num3 > num2) {
            biggest = num3;
        } else if ((num3 > num1 && num3 < num2) || (num3 < num1 && num3 > num2)) {
            bigger = num3;
        } else if (num3 < num1 && num3 < num2) {
            small = num3;
        }  System.out.println("Największa liczba to " + biggest + " średnia to " + bigger + " najmniejsza to " + small);
    }


        }







