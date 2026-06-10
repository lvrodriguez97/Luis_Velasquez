public class Automovil {
    public String marca = "Ford";
    public String color;
    public String modelo;
    public boolean encendido;

    public void ImprimirInformacionVehiculo(String marca){
        System.out.println("Marca: " + marca);
    }

    public void ImprimirInformacionVehiculoV2(){
        System.out.println("Marca: " + this.marca);
    }
}
