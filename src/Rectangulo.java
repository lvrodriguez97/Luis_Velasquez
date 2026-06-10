public class Rectangulo {
    public double base = 8.0;
    public double altura = 4.0;

    public void CalcularArea (double a, double b){
        double area = a*b;
        System.out.println("El area del rectangulo es: " + area);
    }

    public void CalcularPerimetro(){
        double perimetro = 2*(this.altura + this.base);
        System.out.println("El perimetro del rectangulo es = " + perimetro);
    }
}
