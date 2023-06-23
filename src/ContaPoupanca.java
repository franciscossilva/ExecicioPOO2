public class ContaPoupanca implements Tributavel {
    // Outros atributos e métodos da classe

    @Override
    public double calcularTributos() {
        // Conta Poupança não é tributável, retorna 0 de tributos
        return 0;
    }
}
