public class Numero3 {
    public static void main(String[] args) {
        System.out.println(perimetroRettangolo(10, 12.5));
        System.out.println(pariDispari(22));
        System.out.println(areaTrinagolo(12.5, 8, 5));

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