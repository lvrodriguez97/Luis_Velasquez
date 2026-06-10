public class CuentaBancaria {
    public String titular = "Luis";
    public double saldo = 5000000;

    public void Depositar (double monto){
        if (this.saldo <= monto){
            System.out.println("Saldo insuficiente para realizar el deposito");
        }else{
            System.out.println("El deposito con valor: " + monto + " se ha realizado exitosamente");
            this.saldo -= monto;
        }
        System.out.println("Saldo actual = " + this.saldo + " $");
    }

    public void MostrarSaldo(){
        System.out.println("Titular de la cuenta: " + titular + "| Saldo: " + saldo);
    }
}
