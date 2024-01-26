
import java.util.*;

public class Main {
    public static void main(String[] args) {

       ArrayList<String> tablicaZLiterkami = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        text = text.toUpperCase();
        int dlugoscWyrazu = text.length();
        String letter;
        String pierwszaLiterka;
        String ostatniaLiterka;
        int zgodne=-1;
        char a;

        for (int i=0; i<text.length(); i++) {
             a = text.charAt(i);
             String b = Character.toString(a);
             tablicaZLiterkami.add(b);
        }

        for (int i1=0; i1<=((text.length()/2)); i1++) {
            dlugoscWyrazu--;
        pierwszaLiterka = tablicaZLiterkami.get(i1);
        ostatniaLiterka = tablicaZLiterkami.get((dlugoscWyrazu));
        if (!(pierwszaLiterka.equals(ostatniaLiterka))) {
            break;
        } else {
            zgodne++;
        }
}

        if ((text.length()/2) == zgodne) {
            System.out.println();
            System.out.println(text + " to palindrom ;)");

        } else {
            System.out.println();
            System.out.println(text + " to nie palindrom :(");
        }


    }
    }








