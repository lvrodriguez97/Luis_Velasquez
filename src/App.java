public class App {
    public static void main(String[] args) {
       Persona persona = new Persona();
       Calculadora calculadora = new Calculadora();
       Rectangulo rectangulo = new Rectangulo();
       CuentaBancaria cb = new CuentaBancaria();
       Estudiante estudiante = new Estudiante();
       Termometro termometro = new Termometro();
       Producto producto = new Producto();

       persona.Saludar("Luis");
       persona.Presentarse();
       calculadora.Sumar(12.56, 3.0);
       calculadora.SumaInterna();
       rectangulo.CalcularArea(6.0,4.0 );
       rectangulo.CalcularPerimetro();
       cb.Depositar(1000000);
       cb.MostrarSaldo();
       estudiante.RegistrarNota(3.9);
       estudiante.VerificarEstado();
       termometro.ConvertirFarenheit(45.2);
       termometro.MostrarTemperatura();
       producto.AplicarDescuento(80000, 10);
       producto.MostrarInfo();
    }

}
