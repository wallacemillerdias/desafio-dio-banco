import org.banco.*;

public class Main {
    public static void main(String[] args) {

        Cliente wallace = new Cliente();
        wallace.setNome("Wallace");

        Cliente joao = new Cliente();
        joao.setNome("joao");

        Cliente denise = new Cliente();
        denise.setNome("denise");

        ContaPoupanca poupanca  = new ContaPoupanca(wallace);
        ContaCorrente cc = new ContaCorrente(wallace);

        ContaPoupanca poupanca1  = new ContaPoupanca(joao);
        ContaCorrente cc1 = new ContaCorrente(joao);

        ContaPoupanca poupanc2  = new ContaPoupanca(denise);
        ContaCorrente cc2 = new ContaCorrente(denise);

        cc.depositar(100);
        poupanca.transferir(80, cc);
        cc.transferir(70, poupanca);
        cc.transferir(20, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Banco banco = new Banco();
        System.out.println(banco.listarClientes());
    }
}
