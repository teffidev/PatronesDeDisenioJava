package semana_7.patron_state_semaforo;

public class Amarillo implements StateSemaforo {
    /*Atributos*/
    private Semaforo semaforo;


    /*Constructor*/
    public Amarillo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }


    /*Métodos*/
    @Override
    public void mostrarAviso() {
        System.out.println("El semáforo esta en AMARILLO ten cuidado!");
    }

    @Override
    public void cambiarEstado() {
        semaforo.setEstado(new Rojo(semaforo));
    }
}
