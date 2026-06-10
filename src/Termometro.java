public class Termometro {
    private double celsius = 25.0;

    public void ConvertirFarenheit(double c){
        double gradosFarenheit = (c*9/5) + 32;
        System.out.println( c + "°C = " + gradosFarenheit + "°F");
    }
    public void MostrarTemperatura(){
        System.out.println("La temperatura actual es de " + this.celsius + "°C");
    }
}
