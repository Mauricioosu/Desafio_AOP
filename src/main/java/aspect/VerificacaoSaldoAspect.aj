package aspect;

import model.Conta;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class VerificacaoSaldoAspect {

    @AfterReturning(
        pointcut = "execution(boolean model.Conta+.sacar(..)) && args(valor)",
        returning = "sucesso"
    )
    public void logSaldoInsuficiente(JoinPoint joinPoint, double valor, boolean sucesso) {
        if (!sucesso) {
            Conta conta = (Conta) joinPoint.getTarget();
            System.err.println("[ERRO] Saldo insuficiente na conta " + conta.getNumero() +
                               ". Tentativa de saque: R$" + valor + 
                               ", Saldo atual: R$" + conta.getSaldo());
        }
    }
}
