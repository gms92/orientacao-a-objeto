public class Cliente implements Autenticavel {

    private AutenticadorUtil autenticador;

    public Cliente(){
        this.autenticador =new AutenticadorUtil();
    }

    public void setSenha(int senha){
        this.autenticador.setSenha(senha);
    }

    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }
}


