import java.util.ArrayList;
import java.util.List;


public class Cuenta {
    private String nombreCliente;
    private List<Menu> menus;
    private double subtotal;
    private double iva;
    private double valorTotal;

    public Cuenta(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.menus = new ArrayList<>();
    }
public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("Juan Perez");

        Menu menuDia = new MenuDia("Pollo a la brasa", 8.00, 2.00, 1.50);
        Menu menuNinos = new MenuNinios("Hamburguesa", 5.00, 1.00, 1.50);
        Menu menuCarta = new MenuCarta("Bistec", 12.00, 3.00, 2.00, 10.0);
        Menu menuEconomico = new MenuEconomico("Ensalada", 7.00, 15.0);

        cuenta.agregarMenu(menuDia);
        cuenta.agregarMenu(menuNinos);
        cuenta.agregarMenu(menuCarta);
        cuenta.agregarMenu(menuEconomico);

        cuenta.calcularValorTotal(12);  // Asumiendo un IVA del 12%

        System.out.println(cuenta);
    }

    public void agregarMenu(Menu menu) {
        this.menus.add(menu);
        this.subtotal += menu.calcularValorMenu();
    }

    public void calcularValorTotal(double porcentajeIVA) {
        this.iva = this.subtotal * porcentajeIVA / 100;
        this.valorTotal = this.subtotal + this.iva;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Cliente: %s\n", nombreCliente));
        sb.append("Menús solicitados:\n");
        for (Menu menu : menus) {
            sb.append(menu.toString()).append("\n");
        }
        sb.append(String.format("Subtotal: %.2f\n", subtotal));
        sb.append(String.format("IVA: %.2f\n", iva));
        sb.append(String.format("Valor Total: %.2f\n", valorTotal));
        return sb.toString();
    }
}

