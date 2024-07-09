public class JuegoRol {}

abstract class Personaje {
    double puntosHP;
    double ataque;
    double defensa;
    String habilidadEsp;
    String tipoCombat;
    double exp;

    abstract void atacar(double da�o);
    abstract void defender(double defensa);
}

class Arquero extends Personaje {
    String habilidadesDistancia;
    String precision;

    @Override
    void atacar(double da�o) {
        // Implementación específica para Arquero
    }

    @Override
    void defender(double defensa) {
        // Implementación específica para Arquero
    }
}

class Mago extends Personaje {
    String hechizos;
    String ataquesMagicos;

    @Override
    void atacar(double da�o) {

    }

    @Override
    void defender(double defensa) {

    }
}

class Guerrero extends Personaje {
    double fuerza;
    String habilidadCuerpo;

    @Override
    void atacar(double da�o) {
    
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

    void calcularDa�o(double da�o) {

    }

    void realizarHabEsp(String habilidadEsp) {

    }

    void calcularDa�oRecibido(double da�o, double defensa) {

    }

    void calcularWinner(double da�oRecibido, double HP) {

    }

    double subirExp() {

        return 0;
    }
}
