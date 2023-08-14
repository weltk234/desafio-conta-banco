import java.util.Scanner;

public class ContaTerminal {

    int contaNumero =  1021 ;
    String agencia  = " 067-8" ;
    String nomeCliente = "MARIO ANDRADE";
    double saldo = 237.48 ;


    /**
     * @param args
     */
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da agência");
        String agencia = scanner.next();
        
        System.out.println("Por favor digite o nome do cliente");
        String nomeCliente = scanner.next();

        System.out.println("Por favor digite seu numero de cuenta");
        int contaNumero = scanner.nextInt();
        
        System.out.println("Digite sue Saldo");
        double saldo= scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta Numero: " + contaNumero + " e seu saldo " + saldo + " já está disponivel para saque");
        
}

}