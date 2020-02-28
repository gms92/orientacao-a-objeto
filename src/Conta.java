public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();

    //Constructor
    public Conta(int agencia,int numero){
        this.agencia=agencia;
        this.numero=numero;
        System.out.println("Criando uma conta...");

    }

    public void deposita(double valor) {
        saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }
    public Double getSaldo(){
        return this.saldo;
    }
    public int getAgencia(){
        return this.agencia;
    }
    public int getNumero(){
        return this.numero;
    }
    public Cliente getTitular(){
        return this.titular;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    public void setAgencia(int agencia){
        this.agencia=agencia;
    }
    public void setNumero(int numero){ this.numero=numero; }
    public void setTitular(Cliente titular){
        this.titular=titular;
    }

    public void mostraSaldo(){System.out.println(this.saldo);}
}
