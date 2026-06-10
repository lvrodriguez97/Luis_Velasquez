public class Persona {
    public String nombre = "Ana";
    public int edad = 25;

    public void Saludar(String nombre) {
        System.out.println("Hola me llamo " + nombre);
    }

    public void Presentarse() {
        System.out.println("Hola mi nombre es " + this.nombre + " tengo " + this.edad + " años");
    }
}
