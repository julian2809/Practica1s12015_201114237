/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Julio
 */
public class NodoCabecera {
    public NodoPlanta plantas;
    public NodoZombie zombies;
    String nombreGraphviz;
    
     public NodoCabecera(){
        plantas=null;
        zombies=null;
        nombreGraphviz="nodocabecera";
    }
     
     public String getNodoGraphviz(){
        return nombreGraphviz+";\n";
    }
     
     public String Mostrar(){
    String texto="";
    if (this.plantas!=null){
        texto=texto+"\""+this.nombreGraphviz+"\":f0 -> \""+this.plantas.nombreGraphviz+"\":f0;\n";
        texto=texto+this.plantas.Mostrar();
    }
    if (this.zombies!=null){
        texto=texto+"\""+this.nombreGraphviz+"\":f1 -> \""+this.zombies.nombreGraphviz+"\":f0;\n";
        texto=texto+this.zombies.Mostrar();
    }
    return texto;
    }
     
     public void CrearPlanta(String nombre, String cantidad){
         NodoPlanta nuevo = new NodoPlanta();
         plantas=nuevo;
         NodoNombre nuevoNombre=new NodoNombre(nombre);
         plantas.nombre=nuevoNombre;
         NodoCantidad nuevaCantidad=new NodoCantidad(cantidad);
         plantas.nombre.cantidad=nuevaCantidad;
     }
     
     public void AdicionalesPlanta(String adicional){
         NodoExtra nuevo= new NodoExtra(adicional);
         plantas.nombre.cantidad.AgregarExtra(nuevo);
     }
     
     public void CrearZombie(String nombre,String cantidad){
         NodoZombie nuevo = new NodoZombie();
         zombies=nuevo;
         NodoNombre nuevoNombre=new NodoNombre(nombre);
         zombies.nombre=nuevoNombre;
         NodoCantidad nuevaCantidad=new NodoCantidad(cantidad);
         zombies.nombre.cantidad=nuevaCantidad;
     }
     
     public void AdicionalesZombie(String adicional){
         NodoExtra nuevo= new NodoExtra(adicional);
         zombies.nombre.cantidad.AgregarExtra(nuevo);
     }
}
