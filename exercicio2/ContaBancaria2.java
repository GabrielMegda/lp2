package contabancaria2;
/**
 *
 * @author Gabriel Vazi
 */
public class ContaBancaria2 {

    int agencia, contaCorrente;
    double saldo, limiteExtra;
    String titularConta;
    
    public void imprimirTitular(){
        System.out.println("O titular da conta é: "+this.titularConta);
    }
    
    public void imprimirAgencia(){
        System.out.println("A Agencia é: " + this.agencia);
    }
    
    public void imprimirContaCorrente(){
        System.out.println("conta-corrente: " + this.contaCorrente);
    }
            
    public void imprimirSaldo(){
        System.out.println("saldo: " +this.saldo);
    }
    
    public void imprimirSaldoTotal(){
        double soma = this.saldo + this.limiteExtra;
        System.out.println("Saldo com limite extra: " + soma);
    }
    
    public void DeixarEspaco(){
        System.out.println(" ");
    }


    
    public static void main(String[] args) {

    ContaBancaria2 cb0 = new ContaBancaria2();
        cb0.titularConta = "alguem";
        cb0.agencia = 3610;
        cb0.contaCorrente = 15766; 
        cb0.saldo=35.54;
        cb0.limiteExtra=50;
        
        cb0.imprimirTitular();
        cb0.imprimirAgencia();
        cb0.imprimirContaCorrente();
        cb0.imprimirSaldo();
        cb0.imprimirSaldoTotal();
        cb0.DeixarEspaco();
        
    ContaBancaria2 cb1 = new ContaBancaria2();
        cb1.titularConta = "Stormaggedon Dark Lord of all quote";
        cb1.agencia = 666;
        cb1.contaCorrente=26684;
        cb1.saldo=5890.89;
        cb1.limiteExtra=200;
        
        cb1.imprimirTitular();
        cb1.imprimirAgencia();
        cb1.imprimirContaCorrente();
        cb1.imprimirSaldo();
        cb1.imprimirSaldoTotal();
    }
    
    
}
