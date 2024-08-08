package SegundoEjercicio;

public class Yate extends Embarcacion {
    private int cantidadCamarotes;
    private int cantidadAlquileres;
    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantidadCamarotes) {
        super(capitan,precioBase,valorAdicional,anioFabricacion,eslora);
        this.cantidadCamarotes = cantidadCamarotes;
        this.cantidadAlquileres = 0;// inicialmente no se ha alquilado ningún yate.
    }
     public int getCantidadCamarotes() {
        return cantidadCamarotes;
     }
     public void setcantidadCamarotes(){
        this.cantidadCamarotes = cantidadCamarotes;
     }
     public int getCantidadAlquileres(){
        return cantidadAlquileres;
     }
     public void setCantidadAlquileres(){
        this.cantidadAlquileres++;
     }
     @Override
    public double calcularAlquiler(){
        double alquiler = super.getPrecioBase();
        if (super.getAnioFabricacion() > 2020){
            alquiler+= 20000;
        }
        return alquiler;
     }
    public double calcularPrecioCompra() {
        double precio = super.getPrecioBase();
        if (cantidadAlquileres > 50) {
            precio *= (cantidadCamarotes > 8) ? 0.95 : 0.8;
        } else if (cantidadAlquileres > 20) {
            precio *= (cantidadCamarotes > 8) ? 1.0 : (cantidadCamarotes > 5) ? 0.9 : 0.9;
        }
        return precio;
    }
}