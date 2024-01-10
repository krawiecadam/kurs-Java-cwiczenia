import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 4;
        int b = 100;
        int c = 400;
        System.out.println("Podaj rok: ");
        int year = scanner.nextInt();
        System.out.println("Podany przez Ciebie rok to: "+ year + ".");
        int year1= year % a;
        int year2= year % b;
        int year3= year % c;
        System.out.println(year1);
        System.out.println(year2);
        if ((year1 == 0 && year2 > 0) || (year3 == 0))  {
            System.out.println("Podany rok jest przestępny.");
        } else {
            System.out.println("Podany rok nie jest przestępny.");
        }
        }
        }



