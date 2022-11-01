import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Witaj w grze Wiedźmin 2 i 3/4! " +
                "Czy jesteś gotowy na stworzenie swojej pierwszej postaci? " +
                "Wpisz 'tak' lub 'nie' aby zakończyć: ");

        String play = sc.nextLine();
        if (play.toLowerCase(Locale.ROOT).equals("nie")) {
            System.out.println("Wróc, kiedy będziesz gotowy! Do widzenia! ");
            System.exit(0);
        }

        System.out.println("Czy będzie to Twoja nowa postać? Wpisz 'tak' lub 'nie':  ");
        String ifNew = sc.nextLine();

        boolean heroIsNew = false;
        if (Objects.equals(ifNew, "tak")) {
            heroIsNew = true;
        }
        else {
            System.out.println("Wczytywanie już utworzonych postaci będzie dostępne w naspnej wersji gry! Do widzenia!");
            System.exit(0);
        }

        System.out.println("Świetnie! Podaj imię swojej postaci: ");
        String heroName = sc.nextLine();

        System.out.println("Podaj klasę swojej postaci - Janusz Biznesu, Kapitan Biegunka czy Człowiek Materac?: ");
        String heroRole = sc.nextLine();

        System.out.println("Podaj wartość punktów siły swojej postaci - tylko wartości całkowite w zakresie 1-20: ");
        int heroStrength = sc.nextInt();

        System.out.println("Podaj wartość punktów many postaci - tylko wartości całkowite w zakresie 1-100: ");
        int heroMana = sc.nextInt();

        Hero hero1 = new Hero(heroName, heroRole, heroStrength, heroMana, heroIsNew);
        double silaCiosu = hero1.power(heroStrength, heroMana);
        System.out.println("Gratulacje! Stworzyłeś swojego pierwszeo bohatera o imieniu " + heroName + ", klasy " +
                heroRole + ", o sile " + heroStrength + " oraz z " + heroMana + " punktami many. " +
                "\nSiła ciosu Twojego bohatera wynosi " + silaCiosu + ". Miłej zabawy! ");

    }
}