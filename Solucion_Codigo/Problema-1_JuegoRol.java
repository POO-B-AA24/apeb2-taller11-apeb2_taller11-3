public class JuegoRol {}

abstract class Personaje {
    double puntosHP;
    double ataque;
    double defensa;
    String habilidadEsp;
    String tipoCombat;
    double exp;

    abstract void atacar(double daño);
    abstract void defender(double defensa);
}

class Arquero extends Personaje {
    String habilidadesDistancia;
    String precision;

    @Override
    void atacar(double daño) {
        // ImplementaciÃ³n especÃ­fica para Arquero
    }

    @Override
    void defender(double defensa) {
        // ImplementaciÃ³n especÃ­fica para Arquero
    }
}

class Mago extends Personaje {
    String hechizos;
    String ataquesMagicos;

    @Override
    void atacar(double daño) {

    }

    @Override
    void defender(double defensa) {

    }
}

class Guerrero extends Personaje {
    double fuerza;
    String habilidadCuerpo;

    @Override
    void atacar(double daño) {
    
    }

    @Override
    void defender(double defensa) {

    }
}

class NuevoPersonaje {
    void elegirTipoCombate(String tipoCombat) {

    }

    void elegirHabilidades(String habilidadEspecial) {
 
    }
}

class Combate {
    void calcularVentaja(String tipoCombat) {

    }

    void calcularDaño(double daño) {

    }

    void realizarHabEsp(String habilidadEsp) {

    }

    void calcularDañoRecibido(double daño, double defensa) {

    }

    void calcularWinner(double dañoRecibido, double HP) {

    }

    double subirExp() {

        return 0;
    }
}
