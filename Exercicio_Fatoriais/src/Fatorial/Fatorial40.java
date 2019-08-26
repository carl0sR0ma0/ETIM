package Fatorial;

/**
 *
 * @author Carlos
 */
public class Fatorial40 {

    public static void main(String[] args) {
        double n = 1;
        double f = 1;
        
        while (n <= 40) {
            System.out.println(f);
            n = n + 1;
            f = f * n;
        }
    }   
}