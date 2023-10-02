import java.util.Scanner;

public class Numero3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calcoliamo il perimetro di un rettangolo:");
        System.out.println("Inserisci la lunghezza del primo lato");
        double n1 = Double.parseDouble(input.nextLine());
        System.out.println("Inserisci la lunghezza del secondo lato");
        double n2 = Double.parseDouble(input.nextLine());
        System.out.println("Il perimetro del rettangolo è " + perimetroRettangolo(n1, n2));
        System.out.println("Inserisci un numero intero per scoprire se è pari o dispari:");
        int n = Integer.parseInt(input.nextLine());
        if (pariDispari(n) == 0) {
            System.out.println(n + " è pari");
        } else {
            System.out.println(n + " è dispari");
        }
        System.out.println("Adesso calcoliamo l'area del rettangolo usando la formula di Erone:");
        System.out.println("Inserisci la lunghezza del primo lato");
        double l1 = Double.parseDouble(input.nextLine());
        System.out.println("Inserisci la lunghezza del secondo lato");
        double l2 = Double.parseDouble(input.nextLine());
        System.out.println("Inserisci la lunghezza del terzo lato");
        double l3 = Double.parseDouble(input.nextLine());
        System.out.println("L'area del triangolo è " + areaTrinagolo(l1, l2, l3));
        input.close();

    }

    public static double perimetroRettangolo(double n1, double n2) {
        return (n1 + n2) * 2;
    }

    public static int pariDispari(int n) {
        if (n % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static double areaTrinagolo(double l1, double l2, double l3) {
        double p = (l1 + l2 + l3) / 2;
        return Math.sqrt(p * (p - l1) * (p - l2) * (p - l3));
    }
}