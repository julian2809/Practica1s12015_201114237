/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Julio
 */
public class NodoExtra {
    String dato;
    public NodoExtra extra;
    String nombreGraphviz;
    
     public NodoExtra(String info){
        extra=null;
        nombreGraphviz="extra:"+info;
        dato=info;
    }
     
     public String getNodoGraphviz(){
        return nombreGraphviz+";\n";
    }
     
     public String Mostrar(){
    String texto=this.getNodoGraphviz();
    if (this.extra!=null){
        texto=texto+"\""+this.nombreGraphviz+"\" -> \""+this.extra.nombreGraphviz+"\";\n";
        texto=texto+this.extra.Mostrar();
    }
    return texto;
    }
}
