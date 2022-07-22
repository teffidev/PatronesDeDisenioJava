package semana_7.factory_state_service_articulos;

public class Presupuesto implements StateArticulo{
    /*Atributos*/
    private Articulo articulo;



    /*Constructor*/
    public Presupuesto(Articulo articulo) {
        this.articulo = articulo;
    }



    /*Métodos*/
    @Override
    public void valorPresupuesto() {
        //El presupuesto inicial es por defecto
        articulo.setValorPresupuesto(1000.0);
    }

    @Override
    public void sumaRepuesto() {
        //handle error
    }

    @Override
    public void cambiarDireccion() {
        //handle error
    }

    @Override
    public void pasarSiguientePaso() {
        articulo.setEstadoArticulo(new Reparacion(articulo));
    }
}
