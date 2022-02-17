package cuentas;
/**
 *
 * @author Fernando Gómez Romano
 */
public class Main {
    
    public static void main(String[] args) {
        CCuenta cuenta1;
        float cantidad = 0;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativaCuenta(cuenta1, cantidad);
    }
    
    public static void operativaCuenta(CCuenta cuenta1, float cantidad){
        double saldoActual;
//        float this.cantidad;

        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}