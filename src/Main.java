import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wynik: ");
        int score = scanner.nextInt();
        System.out.println();
        System.out.println("Twój wynik to: " + score + "%.");
        if (score >= 90 && score <=100) {
            System.out.println("Twoja ocena to: 5. Gratulacje !");
        } else if ((score >= 80 && score <=89)) {
            System.out.println("Twoja ocena to: 4. Not bad ;)");

        } else if ((score >= 70 && score <=79)) {
            System.out.println("Twoja ocena to: 3. Tak sobie...");
        } else if ((score >= 60 && score <=69)) {
            System.out.println("Twoja ocena to: 2. Oj słabiutko...");
        } else if ((score <= 59)) {
            System.out.println("Twoja ocena to: 1. Do widzenia.");
        }
    }

}
