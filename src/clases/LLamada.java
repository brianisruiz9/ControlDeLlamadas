/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author SERVIDOR
 */
public class LLamada extends Minuto {

    private String codigo;
    private String operador;
    private String cantidadm;

    public LLamada(String codigo, String operador, String cantidadm, String valor,String pago) {
        super(valor,pago);
        this.codigo = codigo;
        this.operador = operador;
        this.cantidadm = cantidadm;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getCantidadm() {
        return cantidadm;
    }

    public void setCantidadm(String cantidadm) {
        this.cantidadm = cantidadm;
    }

    public void guardar(ObjectOutputStream salida,int i) throws IOException {
        salida.writeObject(this);
    }
    
    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);
    }
}
