package SegundoEjercicio;

public class Velero extends  Embarcacion{
    private int cantidadMastiles;

    public Velero(Capitan capitan,double precioBase,double valoAdicional,int anioFabricacion,double eslora,int cantidadMastiles) {
        super(capitan,precioBase,valoAdicional,anioFabricacion,eslora);
        this.cantidadMastiles = cantidadMastiles;
    }
    public int getCantidadMastiles(){
        return cantidadMastiles;
    }
    public void setCantidadMastiles(int cantidadMastiles){
        this.cantidadMastiles=cantidadMastiles;
    }
    public boolean esGrande(){
        return cantidadMastiles > 4;
    }
    @Override
    public double calcularAlquiler(){
        double alquiler = super.getPrecioBase();
        if (super.getAnioFabricacion() > 2020){
            alquiler += 20000;
        }
        if (esGrande()){
            alquiler += alquiler * 0.1;
        }
        return alquiler;
    }
}
