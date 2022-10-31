import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Witaj w grze Wiedźmin 2 i 3/4! " +
                "Czy jesteś gotowy na stworzenie swojej pierwszej postaci? " +
                "Wpisz 'tak' lub 'nie' aby zakończyć: ");

        String play = sc.nextLine();
        if (play.toLowerCase(Locale.ROOT) == "nie") {
            System.exit(0);
        }

        boolean heroIsNew = true;

        System.out.println("Świetnie! Podaj imię swojej postaci: ");
        String heroName = sc.nextLine();

        System.out.println("Podaj klasę swojej postaci - Janusz Biznesu, Kapitan Biegunka czy Człowiek Materac?: ");
        String heroRole = sc.nextLine();

        System.out.println("Podaj wartość punktów siły swojej postaci - tylko wartości całkowite w zakresie 1-20: ");
        int heroStrength = sc.nextInt();

        System.out.println("Podaj wartość punktów many postaci - tylko wartości całkowite w zakresie 1-100: ");
        int heroMana = sc.nextInt();


    }
}