import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rok: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))  {
            System.out.println("Podany rok jest przestępny.");
        } else {
            System.out.println("Podany rok nie jest przestępny.");
        }
        }
        }



