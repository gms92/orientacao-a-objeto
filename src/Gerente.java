public class Gerente extends FuncionarioAutenticavel {

    private int senha;

    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }

    }
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getBonus() {
        return super.getBonus() + super.getSalario();
    }
}

