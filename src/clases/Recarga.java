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
public class Recarga extends Minuto{
    
   private LLamada codop;

    public Recarga(String valor, LLamada codop,String pago) {
        super(valor,pago);
        this.codop = codop;
    }

    public LLamada getCodop() {
        return codop;
    }

    public void setCodop(LLamada codop) {
        this.codop = codop;
    }
    
    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);
    }
}
