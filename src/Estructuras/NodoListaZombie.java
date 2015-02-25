/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Julio
 */
public class NodoListaZombie {
    String nombre;
    String puntos;
    String ataque;
    String imagen;
    public NodoListaZombie siguiente;
    public NodoListaZombie anterior;
    String nombreGraphviz;
    
     public NodoListaZombie(String nom,String pts,String atk, String ima){
        siguiente=null;
        anterior=null;
        nombreGraphviz="nombre:"+nom;
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
