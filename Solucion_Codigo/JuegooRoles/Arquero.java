public class Arquero extends Personajes {
    private int precision;

    public Arquero(String nombre, int puntosDeVida, int nivel, int fuerza, int defensa, int precision) {
        super(nombre, puntosDeVida, nivel, fuerza, defensa);
        this.precision = precision;
    }

    @Override
    public void atacar(Personajes oponente) {
        int danio = (this.fuerza + this.precision) - oponente.defensa;
        if (danio > 0) {
            oponente.recibirDanio(danio);
        }
    }

    @Override
    public void defender() {
        this.precision += 5; // Ejemplo de aumento de precisión
    }

    public void dispararFlecha() {
        // Implementación específica
    }
}
