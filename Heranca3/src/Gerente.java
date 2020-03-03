public class Gerente extends Funcionarios implements Autenticavel{

    private AutenticadorUtil autenticador;

    public Gerente(){                                   //instancia outra classe no constructor
        this.autenticador =new AutenticadorUtil();      //isso se chama composição e serve para
                                                        //reutilização de código.
    }

    public void setSenha(int senha){
        this.autenticador.setSenha(senha);
    }

    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }

    public double getBonus() {
        return super.getBonus() + super.getSalario();
    }
}

