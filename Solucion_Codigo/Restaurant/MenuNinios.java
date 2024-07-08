public class MenuNinios extends Menu {
    private double valorHelado;
    private double valorPastel;

    public MenuNinios(String nombrePlato, double valorInicial, double valorHelado, double valorPastel) {
        super(nombrePlato, valorInicial);
        this.valorHelado = valorHelado;
        this.valorPastel = valorPastel;
    }

    @Override
    public double calcularValorMenu() {
        return valorInicial + valorHelado + valorPastel;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Valor Helado: %.2f, Valor Pastel: %.2f, Valor Total: %.2f",
                valorHelado, valorPastel, calcularValorMenu());
    }
}