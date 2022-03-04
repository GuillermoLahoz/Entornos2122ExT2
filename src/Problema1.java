
public class Problema1 {
    public static String cadena_de_texto_1_20() {
        String cadena = "1";
        for (int i = 2; i <= 20; i++) {
            cadena += i;
        }
        return cadena;
    }

    private boolean esNumeroPar(Integer n) {
        return n % 3 == 0;
    }

    public static String cadena_de_texto_fizz_Buzz() {
        String cadena = "1";
        for (int i = 2; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                cadena += "fizzbuzz";
            else if (i % 3 == 0) {
                cadena += "fizz";
            } else if (i % 5 == 0) {
                cadena += "Buzz";
            }
        }
        return cadena;
    }
}
