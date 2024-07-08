public abstract class Personajes {
    protected String nombre;
    protected int puntosDeVida;
    protected int nivel;
    protected int fuerza;
    protected int defensa;

    public Personajes(String nombre, int puntosDeVida, int nivel, int fuerza, int defensa) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.nivel = nivel;
        this.fuerza = fuerza;
        this.defensa = defensa;
    }

    public abstract void atacar(Personajes oponente);

    public abstract void defender();

    public boolean estaVivo() {
        return puntosDeVida > 0;
    }

    public void recibirDanio(int danio) {
        puntosDeVida -= danio;
        if (puntosDeVida < 0) {
            puntosDeVida = 0;
        }
    }

    @Override
    public String toString() {
        return nombre + " [HP: " + puntosDeVida + ", Nivel: " + nivel + "]";
    }
}
