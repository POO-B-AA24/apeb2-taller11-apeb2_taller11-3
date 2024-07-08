public class MenuDia extends Menu {
    private double valorPostre;
    private double valorBebida;

    public MenuDia(String nombrePlato, double valorInicial, double valorPostre, double valorBebida) {
        super(nombrePlato, valorInicial);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
    }

    @Override
    public double calcularValorMenu() {
        return valorInicial + valorPostre + valorBebida;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Valor Postre: %.2f, Valor Bebida: %.2f, Valor Total: %.2f",
                valorPostre, valorBebida, calcularValorMenu());
    }
}






