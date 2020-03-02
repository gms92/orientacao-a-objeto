public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        // TODO Auto-generated method stub
        double valorsacar=valor + 0.5;
        return super.saca(valorsacar);
    }
    public void deposita(double valor){
        super.saldo += valor;
    }
}
