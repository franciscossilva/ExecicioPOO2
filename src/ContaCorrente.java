public class ContaCorrente implements Tributavel {
    // Outros atributos e métodos da classe

    @Override
    public double calcularTributos() {
        // Calcula 1% do valor da conta como tributos
        return getValorConta() * 0.01;
    }
}