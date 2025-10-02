public class Cuenta {
    double consultarSaldo () {
        return saldo;
    }
    void consignar (double valor){
        saldo += valor;
    }
    boolean retirar (double valor) {}
        if (valor >= saldo){
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    

