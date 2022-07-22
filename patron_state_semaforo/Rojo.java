package semana_7.patron_state_semaforo;

public class Rojo implements StateSemaforo {
    /*Atributos*/
    private Semaforo semaforo;


    /*Constructor*/
    public Rojo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }


    /*Métodos*/
    @Override
    public void mostrarAviso() {
        System.out.println("¡Alto el semáforo esta en ROJO no avances!");
    }

    @Override
    public void cambiarEstado() {
        semaforo.setEstado(new Verde(semaforo));
    }
}
