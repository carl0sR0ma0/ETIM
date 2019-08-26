package Exec05;

/**
 *
 * @author Carlos
 */
public class Exec05 {

    public static void main(String[] args) {
        int a = 1;
        double e = 12.89;
        boolean h = true;
        
        if (h == true) {
            System.out.println("OK");
        }else {
            System.out.print(h);
        }
        
        for (int a1 = 1; a1 <= 10; ++a1) {
            System.out.print(a);
            a = a + 1;
        }
        
        System.out.println();
        System.out.println(e);
    } 
}