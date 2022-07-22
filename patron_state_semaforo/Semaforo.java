package semana_7.patron_state_semaforo;

public class Semaforo {
    /*Estado del semáforo (verde, amarillo, rojo)*/
    private StateSemaforo estado;


    public Semaforo(){
        this.setEstado(new Verde(this));
    }


    public StateSemaforo getEstado() {
        return estado;
    }

    public void setEstado(StateSemaforo estado) {
        this.estado = estado;
    }
}
