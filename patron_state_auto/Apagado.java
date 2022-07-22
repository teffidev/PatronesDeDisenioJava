package semana_7.patron_state_auto;

public class Apagado implements StateAuto {

    /*Referencia a la clase de contexto*/
    private Auto v;


    /*Constructor que inyecta la dependencia en la clase actual*/
    public Apagado(Auto v){
        this.v = v;
    }

    /*Métodos*/

    @Override
    public void acelerar() {
        System.out.println("ERROR: El auto esta apagado. Efectúe el contacto para iniciar");
    }

    @Override
    public void frenar() {
        /*Frenar con el auto parado tampoco sirve de mucho*/
        System.out.println("ERROR: El auto esta apagado. Efectúe el contacto para iniciar");
    }

    @Override
    public void contacto() {
        /*Comprobamos que el auto disponga de combustible*/
        if (v.getCombustibleActual() > 0) {
            /*El auto arranca en -> Cambio de estado
            *                       estado = PARADO*/
            v.setEstado(new Parado(v));
            System.out.println("El auto se encuentra PARADO");
            v.setVelocidadActual(0);
        }else {
            /*El auto no arranca -> Sin combustible
            *                   estado= SIN COMBUSTIBLE*/
            v.setEstado(new SinNafta(v));
            System.out.println("El auto se encuentra SIN COMBUSTIBLE");
        }
    }
}