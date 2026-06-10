public class Calculadora {
    public double num1 = 10.0;
    public double num2 = 5.0;

    public void Sumar (double a, double b){
        double total = a + b;
        System.out.println("Suma: " + total);
    }

    public void SumaInterna (){
        double total = this.num1 + this.num2;
        System.out.println("Suma interna = " + total);
    }
}
