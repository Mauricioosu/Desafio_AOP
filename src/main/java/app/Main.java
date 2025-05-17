package app;

import model.*;
import service.BancoService;

public class Main {
    public static void main(String[] args) {
        BancoService banco = new BancoService();

        banco.adicionarConta(new ContaCorrente("001", 500));
        banco.adicionarConta(new ContaPoupanca("002", 100));
        banco.adicionarConta(new ContaInvestimento("003", 50));

        banco.sacarDeTodasAsContas(150);
    }
}
// 