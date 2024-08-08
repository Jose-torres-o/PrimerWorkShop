package SegundoEjercicio;


public class MainSegundoEjercicio {
    public static void main(String[] args) {
        // Crear un capitán
        Capitan capitan1 = new Capitan("Juan", "Pérez", "M123456");

        // Crear un usuario
        Usuario usuario1 = new Usuario("Ana Gómez", "790560", "Calle 13-7B", "555-1234");

        // Crear un velero
        Velero velero1 = new Velero(capitan1, 100000, 5000, 2021, 30, 5);

        // Crear un yate
        Yate yate1 = new Yate(capitan1, 200000, 10000, 2019, 40, 6);

        // Alquilar el velero
        velero1.setUsuario(usuario1);
        System.out.println("Alquiler del velero: " + velero1.calcularAlquiler());

        // Alquilar el yate
        yate1.setUsuario(usuario1);
        yate1.setCantidadAlquileres(); // Incrementa la cantidad de alquileres
        System.out.println("Alquiler del yate: " + yate1.calcularAlquiler());

        // Calcular precio de compra del yate
        System.out.println("Precio de compra del yate: " + yate1.calcularPrecioCompra());

        // Incrementar alquileres del yate para probar los descuentos
        for (int i = 0; i < 60; i++) {
            yate1.setCantidadAlquileres(); // Incrementa la cantidad de alquileres
        }
        System.out.println("Precio de compra del yate después de 60 alquileres: " + yate1.calcularPrecioCompra());
    }
}
