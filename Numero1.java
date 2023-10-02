import java.util.Arrays;

public class Numero1 {
    public static void main(String[] args) {
        System.out.println(Moltiplica(12, 3));
        System.out.println(Concatena("ciao ", 2));
        String[] Arr = {"Ciao", "il", "mio", "nome", "è", ""};
        System.out.println(Arrays.toString(inserisciInArray(Arr, "Umberto")));
    }

    public static int Moltiplica(int n1, int n2) {
        return n1 * n2;
    }

    public static String Concatena(String str, int n) {
        return str + " " + n;
//        if (str.charAt(str.length()) != "b") {}
    }

    public static String[] inserisciInArray(String[] arr, String str) {
        arr[5] = arr[4];
        arr[4] = arr[3];
        arr[3] = arr[2];
        arr[2] = str;
        return arr;
    }
}