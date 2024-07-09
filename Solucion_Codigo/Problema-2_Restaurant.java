public class Restaurant {}

abstract class Menú {
    String nombrePlato;
    double valorMen;
    double valorIncMen;

    abstract void calcularValorMen(double valores);
}

class ACarta extends Menú {
    double valorGuar;
    double valorBebida;
    double porcentajeAdd;

    @Override
    void calcularValorMen(double valorIncMen, double valorGuar, double valorBebida, double porcentajeAdd) {
        
    }
}

class DelDía extends Menú {
    double valorPostre;
    double valorBebida;

    @Override
    void calcularValorMen(double valorIncMen, double valorPostre, double valorBebida) {
     
    }
}

class DeNiños extends Menú {
    double valorHelado;
    double valorPastel;

    @Override
    void calcularValorMen(double valorIncMen, double valorHelado, double valorPastel) {
        
    }
}

class Económico extends Menú {
    double porcentajeDesc;

    @Override
    void calcularValorMen(double valorIncMen, double porcentajeDesc) {
        
    }
}

class Cuenta {
    String nombreCli;
    String menuOrd;
    double precioMen;
    double iva;

    void calcularTotal(double precioMen, double iva) {
 
    }
}
