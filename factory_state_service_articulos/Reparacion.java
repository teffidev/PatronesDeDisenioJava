package semana_7.factory_state_service_articulos;

public class Reparacion implements StateArticulo{
    /*Atributos*/
    private Articulo articulo;


    /*Constructor*/
    public Reparacion(Articulo articulo) {
        this.articulo = articulo;
    }



    /*Métodos*/
    @Override
    public void valorPresupuesto() {
        //handle error
    }

    @Override
    public void sumaRepuesto() {
        articulo.agregarValorRepuesto(222.3);

    }

    @Override
    public void cambiarDireccion() {
        //handle error
    }

    @Override
    public void pasarSiguientePaso() {
        articulo.setEstadoArticulo(new ParaEnvio(articulo));
    }
}
