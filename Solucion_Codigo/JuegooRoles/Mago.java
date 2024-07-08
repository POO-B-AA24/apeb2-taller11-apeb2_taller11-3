public class Mago extends Personajes {
    private int mana;

    public Mago(String nombre, int puntosDeVida, int nivel, int fuerza, int defensa, int mana) {
        super(nombre, puntosDeVida, nivel, fuerza, defensa);
        this.mana = mana;
    }

    @Override
    public void atacar(Personajes oponente) {
        int danio = this.fuerza + this.mana - oponente.defensa;
        if (danio > 0) {
            oponente.recibirDanio(danio);
        }
        this.mana -= 10; // Ejemplo de uso de mana al atacar
    }

    @Override
    public void defender() {
        this.mana += 5; // Ejemplo de regeneración de mana
    }

    public void lanzarHechizo() {
        // Implementación específica
    }
}
