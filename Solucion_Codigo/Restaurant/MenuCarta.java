public class MenuCarta extends Menu {
    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeServicio;

    public MenuCarta(String nombrePlato, double valorInicial, double valorGuarnicion, double valorBebida, double porcentajeServicio) {
        super(nombrePlato, valorInicial);
        this.valorGuarnicion = valorGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeServicio = porcentajeServicio;
    }

    @Override
    public double calcularValorMenu() {
        return valorInicial + valorGuarnicion + valorBebida + (valorInicial * porcentajeServicio / 100);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Valor Guarnicion: %.2f, Valor Bebida: %.2f, Porcentaje Servicio: %.2f%%, Valor Total: %.2f",
                valorGuarnicion, valorBebida, porcentajeServicio, calcularValorMenu());
    }
}