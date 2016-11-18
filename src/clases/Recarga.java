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
 * @author Esmeralda
 */
public class Recarga extends Minuto {

    private LLamada codop;
    private String pago;

    public Recarga(String valor, LLamada codop, String pago) {
        super(valor);
        this.codop = codop;
        this.pago = pago;
    }

    public LLamada getCodop() {
        return codop;
    }

    public void setCodop(LLamada codop) {
        this.codop = codop;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);
    }
}
