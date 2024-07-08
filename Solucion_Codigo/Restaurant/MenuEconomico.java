public class MenuEconomico extends Menu {
    private double porcentajeDescuento;

    public MenuEconomico(String nombrePlato, double valorInicial, double porcentajeDescuento) {
        super(nombrePlato, valorInicial);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularValorMenu() {
        return valorInicial - (valorInicial * porcentajeDescuento / 100);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Porcentaje Descuento: %.2f%%, Valor Total: %.2f",
                porcentajeDescuento, calcularValorMenu());
    }
}