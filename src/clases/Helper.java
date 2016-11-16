/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SERVIDOR
 */
public class Helper {

    public static void mensaje(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                break;

        }
    }

    public static void limpiadoTabla(JTable tabla1) {
        int nc, nf;

        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);
            }
        }
    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);

        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);

        }
    }

    public static void llenarTabla(JTable tabla, String ruta) {
        DefaultTableModel tm;
        int nf;
        LinkedList<LLamada> llamadas = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = llamadas.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i + 1, i, 0);
            tabla.setValueAt(llamadas.get(i).getCodigo(), i, 1);
            tabla.setValueAt(llamadas.get(i).getOperador(), i, 2);
            tabla.setValueAt(llamadas.get(i).getCantidadm(), i, 3);
            tabla.setValueAt(llamadas.get(i).getValor(), i, 4);
            tabla.setValueAt(llamadas.get(i).getPago(), i, 5);
        }
    }

    public static void llenarTablaRecargas(JTable tabla, String ruta) {
        DefaultTableModel tm;
        int nf;
        LinkedList<Recarga> recargas = traerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = recargas.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i + 1, i, 0);
            tabla.setValueAt(recargas.get(i).getCodop().getCodigo(), i, 1);
            tabla.setValueAt(recargas.get(i).getCodop().getOperador(), i, 2);
            tabla.setValueAt(recargas.get(i).getValor(), i, 3);
            tabla.setValueAt(recargas.get(i).getPago(), i, 4);
        }
    }

    public static void llenarTabla(JTable tabla, LinkedList<LLamada> llamadas) {
        DefaultTableModel tm;
        int nf;
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = llamadas.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i + 1, i, 0);
            tabla.setValueAt(llamadas.get(i).getCodigo(), i, 1);
            tabla.setValueAt(llamadas.get(i).getOperador(), i, 2);
            tabla.setValueAt(llamadas.get(i).getCantidadm(), i, 3);
            tabla.setValueAt(llamadas.get(i).getValor(), i, 4);
            tabla.setValueAt(llamadas.get(i).getPago(), i, 5);
        }
    }

    public static LinkedList traerDatos(String ruta) {
        FileInputStream archivo;
        ObjectInputStream entrada;
        LinkedList llamadas = new LinkedList();
        Object l;

        try {
            archivo = new FileInputStream(ruta);
            entrada = new ObjectInputStream(archivo);
            while ((l = entrada.readObject()) != null) {
                llamadas.add(l);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return llamadas;
    }

    public static void volcado(ObjectOutputStream salida, LinkedList llamadas) {
        for (int i = 0; i < llamadas.size(); i++) {
            try {
                salida.writeObject(llamadas.get(i));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }

    public static void listadoPorOperador(JTable tabla, String ruta, String operador) {
        LinkedList<LLamada> llamadas = traerDatos(ruta);
        LinkedList<LLamada> llamadasFiltradas = new LinkedList();
        for (int i = 0; i < llamadas.size(); i++) {
            if (llamadas.get(i).getOperador().equals(operador)) {
                llamadasFiltradas.add(llamadas.get(i));
            }

        }
        llenarTabla(tabla, llamadasFiltradas);

    }

    public static boolean buscarLlamadaCodigo(String codigo, String ruta) {
        LinkedList<LLamada> llamadas = traerDatos(ruta);
        for (int i = 0; i < llamadas.size(); i++) {
            if (llamadas.get(i).getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;
    }

    public static boolean buscarRecargaValor(String valor, String ruta) {
        LinkedList<Recarga> recargas = traerDatos(ruta);
        for (int i = 0; i < recargas.size(); i++) {
            if (recargas.get(i).getValor().equals(valor)) {
                return true;
            }
        }
        return false;
    }

    public static LLamada traerLlamadaCodigo(String codigo, String ruta) {
        LinkedList<LLamada> llamadas = traerDatos(ruta);
        for (int i = 0; i < llamadas.size(); i++) {
            if (llamadas.get(i).getCodigo().equals(codigo)) {
                return llamadas.get(i);
            }

        }
        return null;
    }

    public static LinkedList<LLamada> modificarLlamada(String ruta, String codigo, String operador, String valor, String cminutos) {
        LinkedList<LLamada> llamadas = traerDatos(ruta);
        for (int i = 0; i < llamadas.size(); i++) {
            if (llamadas.get(i).getCodigo().equals(codigo)) {
                llamadas.get(i).setOperador(operador);
                llamadas.get(i).setCantidadm(cminutos);
                llamadas.get(i).setValor(valor);

                return llamadas;
            }

        }
        return null;
    }

    public static LinkedList<Recarga> modificarRecarga(String ruta, String valor, LLamada codigo) {
        LinkedList<Recarga> recargas = traerDatos(ruta);
        for (int i = 0; i < recargas.size(); i++) {
            if (recargas.get(i).getCodop().equals(codigo)) {
                recargas.get(i).setValor(valor);

                return recargas;
            }

        }
        return null;
    }

    public static void llenarComboLlamadas(JComboBox combo, String ruta) {
        LinkedList<LLamada> llamadas = traerDatos(ruta);
        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) combo.getModel();
        dcbm.removeAllElements();
        LLamada l;
        for (int i = 0; i < llamadas.size(); i++) {
            l = llamadas.get(i);
            dcbm.addElement(l.getCodigo() + " - " + l.getOperador());
        }
    }

}
