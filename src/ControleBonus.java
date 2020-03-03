public class ControleBonus {

    private double soma;

    //POLIMORFISMO -> REFERENCIA GENÉRICA FUNCIONARIOS QUE SERVE
    // PARA TODAS AS CLASSES HERDADAS DE FUNCIONARIOS
    public void registra(Funcionarios f) {
        double boni = f.getBonus(); // O MÉTODO GETBONUS USADO É O DA CLASSE EM QUE O OBJETO FOI CRIADO, E NÃO SEMPRE DE FUNCIONARIOS.
        this.soma = this.soma + boni;
    }

    public double getSoma() {
        return soma;
    }
}
