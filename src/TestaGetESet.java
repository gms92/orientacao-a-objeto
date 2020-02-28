public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(91729,1281028);

        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        paulo.setNome("paulo silveira");

        conta.setTitular(paulo);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");

        System.out.println(paulo);
        System.out.println(conta.getTitular());
        System.out.println(conta.getTitular().getProfissao());


    }
}
