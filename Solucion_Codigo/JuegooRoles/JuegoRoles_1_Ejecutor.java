public class Juego {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("Arthur", 100, 1, 10, 5);
        Mago mago = new Mago("Merlin", 80, 1, 5, 3, 20);
        Arquero arquero = new Arquero("Robin", 90, 1, 8, 4, 15);

        System.out.println("Inicio de la batalla:");
        System.out.println(guerrero);
        System.out.println(mago);
        System.out.println(arquero);

        guerrero.atacar(mago);
        mago.atacar(arquero);
        arquero.atacar(guerrero);

        System.out.println("\nDespués de la primera ronda de ataques:");
        System.out.println(guerrero);
        System.out.println(mago);
        System.out.println(arquero);

        // Continúa la batalla, simula más ataques, defensas, etc.
    }
}
