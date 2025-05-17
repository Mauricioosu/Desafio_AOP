package service;

import model.Conta;
import java.util.ArrayList;
import java.util.List;

public class BancoService {
    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void sacarDeTodasAsContas(double valor) {
        for (Conta conta : contas) {
            boolean sucesso = conta.sacar(valor);
            if (sucesso) {
                System.out.println("Saque realizado na conta " + conta.getNumero() +
                                   ". Novo saldo: R$" + conta.getSaldo());
            }
        }
    }
}
