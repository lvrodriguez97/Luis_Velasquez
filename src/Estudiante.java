public class Estudiante {
    public String nombre = "Maria";
    public double nota = 3.8;
    private double promedioNotas = 0.0;

    public void RegistrarNota(double notaRecibida){
        this.promedioNotas = (notaRecibida + this.nota)/2;
        System.out.println("La nota: " + notaRecibida + " se ha registrado exitosamente \nPromedio: " + promedioNotas);
    }

    public void VerificarEstado(){
        if(this.promedioNotas >= 3.0){
            System.out.println(this.nombre + " aprobo con una nota: " + nota);
        }else{
            System.out.println(this.nombre +  " reprobo con una nota: " + nota);
        }
    }
}
