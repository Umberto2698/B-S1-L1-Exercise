import java.util.Scanner;

public class Numero2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci una parola: ");
        String word1 = input.nextLine();
        System.out.println("Inserisci una seconda parola: ");
        String word2 = input.nextLine();
        System.out.println("Inserisci una terza parola: ");
        String word3 = input.nextLine();
        System.out.println("Hai inserito " + word1 + " " + word2 + " " + word3 + " in questo ordine.");
        System.out.println("Qui sono in ordine inverso " + word3 + " " + word2 + " " + word1 + ".");
        input.close();
    }
}
