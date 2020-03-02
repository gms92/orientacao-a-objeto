public class Cliente {
    String nome;
    String cpf;
    String profissao;

    public String getNome(){
        return this.nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    public String getProfissao(){
        return this.profissao;
    }
    public void setNome(String NOME){
        this.nome=NOME;
    }
    public void setCpf(String CPF){
        this.cpf=CPF;
    }
    public void setProfissao(String PROFISSAO){
        this.profissao=PROFISSAO;
    }
}
