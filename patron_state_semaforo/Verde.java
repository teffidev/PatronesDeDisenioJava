package semana_7.patron_state_semaforo;

public class Verde implements StateSemaforo {
    /*Atributos*/
    private Semaforo semaforo;


    /*Constructor*/
    public Verde(Semaforo semaforo) {
        this.semaforo = semaforo;
    }


    /*Métodos*/
    @Override
    public void mostrarAviso() {
        System.out.println("El semáforo esta en VERDE avanza!");
    }

    @Override
    public void cambiarEstado() {
        semaforo.setEstado(new Amarillo(semaforo));
    }
}
