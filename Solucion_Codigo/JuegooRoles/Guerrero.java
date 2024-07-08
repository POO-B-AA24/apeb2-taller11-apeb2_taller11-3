public class Guerrero extends Personajes {
    public Guerrero(String nombre, int puntosDeVida, int nivel, int fuerza, int defensa) {
        super(nombre, puntosDeVida, nivel, fuerza, defensa);
    }

    @Override
    public void atacar(Personajes oponente) {
        int danio = this.fuerza - oponente.defensa;
        if (danio > 0) {
            oponente.recibirDanio(danio);
        }
    }

    @Override
    public void defender() {
        this.defensa += 5; // Ejemplo de incremento de defensa
    }

    public void habilidadCuerpoACuerpo() {
        // Implementación específica
    }
}
