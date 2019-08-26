package Teste_LOCALE;
/**
 *
 * @author Carlos
 */
public class Locale {

    public static void main(String[] args) {
        int x = 10000;
        java.util.Locale brasil = new java.util.Locale ("pt", "BR");
        System.out.println (String.format (brasil, "%,d", x)); // prints 10.000
        System.out.println (String.format (java.util.Locale.US, "%,d", x)); // prints 10,000
        double y = 1234567.890123;
        System.out.println (String.format (brasil, "%,.6f", y)); // prints 1.234.567,890123
        System.out.println (String.format (java.util.Locale.US, "%,.6f", y)); // prints 1,234,567.890123
    }    
}