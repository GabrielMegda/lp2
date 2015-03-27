package aluno;

/**
 *
 * @author Gabriel Vazi
 */
public class Aluno {
    String nome,matricula;
    int idade;
    
    public void imprimirDadosCadastrais(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Numero da matricula: " + this.matricula);      
    }

    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.nome="Gabriel Megda";
        a.matricula="201118110110";
        a.idade=19;
        
        a.imprimirDadosCadastrais();
    }
    
}
