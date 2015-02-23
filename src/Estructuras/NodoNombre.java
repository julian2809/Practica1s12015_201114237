/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Julio
 */
public class NodoNombre {
    String nombre;
    public NodoCantidad cantidad;
    String nombreGraphviz;
    
     public NodoNombre(String nom){
        cantidad=null;
        nombreGraphviz="nombre:"+nom;
        nombre=nom;
    }
     
     public String getNodoGraphviz(){
        return nombreGraphviz+";\n";
    }
     
     public String Mostrar(){
    String texto=this.getNodoGraphviz();
    if (this.cantidad!=null){
        texto=texto+"\""+this.nombreGraphviz+"\" -> \""+this.cantidad.nombreGraphviz+"\";\n";
        texto=texto+this.cantidad.Mostrar();
    }
    return texto;
    }
}
