package Pessoa;

/**
 *
 * @author Carlos
 */
public class geraPessoa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        
        p1.nome = "Herança";
        p1.idade = 16;
        p1.fazAniversario();
        p1.fazAniversario();
        System.out.println(p1.nome + " " + p1.idade + "Anos");
    }    
}