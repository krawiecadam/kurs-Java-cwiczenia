import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 10;

        System.out.println("Podaj swój wynik: ");
            score = scanner.nextInt();
        while (score > 100 || score <0) {

            System.out.println("Podałeś wynik spoza zakresu 0-100. Podaj wynik jeszcze raz:");
            score = scanner.nextInt();
        }
        System.out.println("Twój wynik to: " + score + "%.");
        if (score >= 90) {
            System.out.println("Twoja ocena to: 5. Gratulacje !");
        } else if ((score >= 80 )) {
            System.out.println("Twoja ocena to: 4. Not bad ;)");

        } else if ((score >= 70 )) {
            System.out.println("Twoja ocena to: 3. Tak sobie...");
        } else if ((score >= 60 )) {
            System.out.println("Twoja ocena to: 2. Oj słabiutko...");
        } else  {
            System.out.println("Twoja ocena to: 1. Do widzenia.");
        }
    }

}
