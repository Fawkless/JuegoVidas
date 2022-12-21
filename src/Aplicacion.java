public class Aplicacion {

    public static void main(String[] args) {

        Juego jugador1 = new Juego(5,5);
        Juego jugador2 = new Juego(5,5);

        System.out.println("JUEGO 1 \n");
        jugador1.VidasRestantes();
        jugador1.quitarVida();
        jugador1.quitarVida();
        jugador1.quitarVida();
        jugador1.VidasRestantes();
        jugador1.recordNuevo();
        jugador1.mostrarRecord();
        jugador1.reiniciarJuego();
        System.out.println("\n");

        System.out.println("JUEGO 2 \n");
        jugador2.VidasRestantes();
        jugador2.quitarVida();
        jugador2.quitarVida();
        jugador2.quitarVida();
        jugador2.quitarVida();
        jugador2.quitarVida();
        jugador2.recordNuevo();
        jugador2.reiniciarJuego();
        jugador2.VidasRestantes();


    }
}
