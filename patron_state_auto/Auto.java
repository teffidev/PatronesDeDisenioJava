package semana_7.patron_state_auto;

public class Auto {
    /*Estado del auto (apagado, parado, en marcha, sin combustible)*/
    private StateAuto estado;
    private int velocidadActual = 0;
    private int combustibleActual = 0;

    public Auto(int combustible) {
        /*Estado inicial (Apagado)*/
        this.setVelocidadActual(combustible);
        this.setEstado(new Apagado(this));
    }


    public void acelerar(){
        getEstado().acelerar();
        System.out.println("Velocidad actual: " + getVelocidadActual() + " Combustible restante: "
        + getCombustibleActual());
    }

    public void frenar(){
        getEstado().frenar();
    }

    public void contacto(){
        getEstado().contacto();
    }

    public void modificarVelocidad(int kmh){
        setVelocidadActual(getVelocidadActual() + kmh);
    }

    public void modificarCombustible(int decilitros){
        setCombustibleActual(getCombustibleActual() + decilitros);
    }

    public StateAuto getEstado() {
        return estado;
    }

    public void setEstado(StateAuto estado) {
        this.estado = estado;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getCombustibleActual() {
        return combustibleActual;
    }

    public void setCombustibleActual(int combustibleActual) {
        this.combustibleActual = combustibleActual;
    }
}
