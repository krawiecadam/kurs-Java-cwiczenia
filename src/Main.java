
import java.util.*;

public class Main {
    public static void main(String[] args) {

       ArrayList<String> chart = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int dlugoscWyrazu = text.length();
        String letter;
        String pierwszaLiterka;
        String ostatniaLiterka;
        int prawda=-1;
        for (int i=1; i<=text.length(); i++) {
            letter = scanner.next();
            chart.add(letter);

        }

        for (int i1=0; i1<=((text.length()/2)); i1++) {
            dlugoscWyrazu--;
        pierwszaLiterka = chart.get(i1);
        ostatniaLiterka = chart.get((dlugoscWyrazu));
        if (!(pierwszaLiterka.equals(ostatniaLiterka))) {
            break;
        } else {
            prawda++;
        }
}

        if ((text.length()/2) == prawda) {
            System.out.println("ok");

        } else {
            System.out.println("nie ok");
        }
    }
    }








