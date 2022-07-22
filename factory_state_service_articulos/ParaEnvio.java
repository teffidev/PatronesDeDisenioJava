package semana_7.factory_state_service_articulos;

public class ParaEnvio implements StateArticulo{
    /*Atributos*/
    private Articulo articulo;



    /*Constructor*/
    public ParaEnvio(Articulo articulo) {
        this.articulo = articulo;
    }



    /*Métodos*/
    @Override
    public void valorPresupuesto() {
        //handle error
    }

    @Override
    public void sumaRepuesto() {
        //handle error
    }

    @Override
    public void cambiarDireccion() {
        articulo.setDireccion("Cortez 2021");
    }

    @Override
    public void pasarSiguientePaso() {
        articulo.setEstadoArticulo(new Finalizado(articulo));
    }
}
