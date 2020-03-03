public class TestaReferencias {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.0);

        Funcionarios f = new Funcionarios();
        f.setSalario(2000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        ControleBonus controle = new ControleBonus();
        controle.registra(g1);
        controle.registra(f);
        controle.registra(ev);

        System.out.println("A Soma dos bonus é:");
        System.out.println(controle.getSoma());

    }

}
