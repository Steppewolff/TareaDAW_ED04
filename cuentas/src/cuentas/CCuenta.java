package cuentas;
/**
 *Recibe valores para calcular estado de una cuenta y devuelve el resultado
 *@author Fernando Gómez Romano
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

 /**
 *método getter para encapsular variable nombre
 *@return this.nombre
 */    
    public String getNombre() {
        return this.nombre;
    }
 
/**
 *método setter para encapsular variable nombre
 *@param name
 */    
    public void setNombre(String name) {
        this.nombre = name;
    }

/**
 *método getter para encapsular variable cuenta 
 *@return this.cuenta
 */    
    public String getCuenta() {
        return this.cuenta;
    }

/**
 * método setter para encapsular variable cuenta 
 * @param count
 */    
    public void setCuenta(String count) {
        this.cuenta = count;
    }

/**
 * método getter para encapsular variable saldo 
 * @return this.saldo
 */    
    public double getSaldo() {
        return this.saldo;
    }

/**
 * método setter para encapsular variable cuenta 
 * @param balance
 */    
    public void setSaldo(double balance) {
        this.saldo = balance;
    }

/**
 * método getter para encapsular variable tipoInterés 
 * @return tipoInterés
 */    
    public double getTipoInterés() {
        return this.tipoInterés;
    }

/**
 * método setter para encapsular variable tipoInterés 
 * @param rateInterest
 */    
    public void setTipoInterés(double rateInterest) {
        this.tipoInterés = rateInterest;
    }
    
/**
 * Inicializa varibles
 * @param nom, cue, sal, tipo
 */    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

/**
 * Devuelve el saldo de la cuenta
 * @return saldo
 */    
    public double estado()
    {
        return saldo;
    }

/**
 * Calcula el saldo, produce Exception si la cantidad ingresada es negativa
 * @param cantidad
 * @throws Exception
 */    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

/**
 * 
 * @param cantidad
 * @throws Exception
 */    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}