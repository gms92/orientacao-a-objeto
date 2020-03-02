public class MostraSaldo {
    public static void main(String[] args) {

        Conta conta = new Conta(1220,1220021);
        conta.setSaldo(1000);
        conta.deposita(500);
        conta.saca(200);
        conta.mostraSaldo();
    }
}
