/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Julio
 */
public class NodoZombie {
    public NodoNombre nombre;
    String nombreGraphviz;
    
     public NodoZombie(){
        nombre=null;
        nombreGraphviz="zombie";
    }
     
     public String getNodoGraphviz(){
        return nombreGraphviz+";\n";
    }
     
     public String Mostrar(){
    String texto="";
    if (this.nombre!=null){
        texto=texto+"\""+this.nombreGraphviz+"\" -> \""+this.nombre.nombreGraphviz+"\";\n";
        texto=texto+this.nombre.Mostrar();
    }
    return texto;
    }
}
