/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Julio
 */
public class NodoListaPlanta {
    String nombre;
    String puntos;
    String ataque;
    String imagen;
    public NodoListaPlanta siguiente;
    public NodoListaPlanta anterior;
    String nombreGraphviz;
    
     public NodoListaPlanta(String nom,String pts,String atk, String ima){
        siguiente=null;
        anterior=null;
        nombreGraphviz="nombre:"+nom+"\n imagen:"+ima+"\n ataque:"+atk+"\n vida:"+pts;
        nombre=nom;
        puntos=pts;
        ataque=atk;
        imagen=ima;
    }
     
     public String getNodoGraphviz(){
        return nombreGraphviz+";\n";
    }
     
     public String Mostrar(){
    String texto="";
    if (this.siguiente!=null){
        texto=texto+"\""+this.nombreGraphviz+"\" -> \""+this.siguiente.nombreGraphviz+"\";\n";
        texto=texto+this.siguiente.Mostrar();
    }
    return texto;
     }
}
