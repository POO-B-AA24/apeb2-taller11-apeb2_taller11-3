public abstract class Menu {
    protected String nombrePlato;
    protected double valorInicial;

    public Menu(String nombrePlato, double valorInicial) {
        this.nombrePlato = nombrePlato;
        this.valorInicial = valorInicial;
    }

    public abstract double calcularValorMenu();

    @Override
    public String toString() {
        return String.format("Plato: %s, Valor Inicial: %.2f", nombrePlato, valorInicial);
    }
}
