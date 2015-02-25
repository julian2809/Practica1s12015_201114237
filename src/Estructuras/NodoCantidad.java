/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Julio
 */
public class NodoCantidad {
    String cantidad;
    public NodoExtra extra;
    String nombreGraphviz;
    
     public NodoCantidad(String cant){
        extra=null;
        nombreGraphviz="cantidad:"+cant;
        cantidad=cant;
    }
     
     public String getNodoGraphviz(){
        return nombreGraphviz+";\n";
    }
     
     public void AgregarExtra(NodoExtra info){
         if (extra==null)
             extra=info;
         else{
             NodoExtra bandera=extra;
             while (bandera.extra!=null){
                 bandera=bandera.extra;
             }
             bandera.extra=info;
         }
     }
     
     public String Mostrar(){
    String texto="";
    if (this.extra!=null){
        texto=texto+"\""+this.nombreGraphviz+"\" -> \""+this.extra.nombreGraphviz+"\";\n";
        texto=texto+this.extra.Mostrar();
    }
    return texto;
    }
}
