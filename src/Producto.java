public class Producto {
    private String nombre = "Camisa";
    private double precio = 80000;

    public void AplicarDescuento(double precio, double descuento){
        double precioConDescuento = precio - (precio*descuento/100);
        System.out.println("El precio del producto con el descuento aplicado es: " + precioConDescuento);
    }

    public void MostrarInfo(){
        System.out.println("Producto: " + this.nombre + "\nPrecio: " + precio );
    }
}
