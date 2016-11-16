/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;



/**
 *
 * @author Esmeralda
 */
public class Minuto implements java.io.Serializable {
    private String valor;
    private String pago;

    public Minuto(String valor, String pago) {
        this.valor = valor;
        this.pago = pago;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

   
}
