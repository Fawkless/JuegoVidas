public class Juego {

    private Integer numVidas;
    private final Integer vidasIniciales;
    public static int record = 0;

    public Juego(Integer numVidas, Integer vidasIniciales) {
        this.numVidas = numVidas;
        this.vidasIniciales = vidasIniciales;
    }

    public void VidasRestantes() {
        System.out.println(numVidas + " vidas restantes");
    }

    public boolean quitarVida(){
        this.numVidas--;
        System.out.println("Has muerto");
        if (numVidas>0) {
            return true;
        } else {
            System.out.println("GAME OVER-- (cof cof que malo cof cof)");
            return false;
        }
    }

    public void reiniciarJuego () {
        this.numVidas = vidasIniciales;
        System.out.println("Esta bien, reiniciamos. Espero que esta vez juegues mejor");
    }

    public void recordNuevo () {
        if (this.numVidas > record) {
            System.out.println("NUEVO RECORD!!!!");
            record=this.numVidas;
        }
        if (this.numVidas==0){
            System.out.println("Record? Esto no es un record, es un chiste");
        }
    }

    public void mostrarRecord () {
        System.out.println("El record es: " + record);


        }
}
