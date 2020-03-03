public class Administrador extends Funcionarios implements Autenticavel {

    private AutenticadorUtil autenticador;

    public Administrador(){
        this.autenticador =new AutenticadorUtil();
    }

    public void setSenha(int senha){
        this.autenticador.setSenha(senha);
    }

    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }

    public double getBonus() {
        return 50;
    }
}
