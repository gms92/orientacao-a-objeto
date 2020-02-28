public class MostraSaldo {
    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.setSaldo(1000);
        conta.deposita(500);
        conta.saca(200);
        conta.mostraSaldo();
    }
}
