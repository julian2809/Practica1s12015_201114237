/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Julio
 */
public class ListaPlantas {
     public NodoListaPlanta inicio;
    public int tamano;
    
    public ListaPlantas(){
        inicio=null;
        tamano=0;
    }
    public boolean estaVacio(){
        if (inicio==null)
            return true;
        return false;
    }
        
    public void Insertar(NodoListaPlanta planta){
        if (!estaVacio()){
            NodoListaPlanta bandera=inicio;
                while (bandera.siguiente!=null){
                    bandera=bandera.siguiente;
                }
             bandera.siguiente=planta;
         }
        else{
            inicio=planta;
        }
    }
    
    public NodoListaPlanta Buscar(String nombre){
        if (!estaVacio()){
            NodoListaPlanta tmp=inicio;
        while (tmp.siguiente!=null && tmp.nombre.equals(nombre)==false){
            tmp=tmp.siguiente;
        }
        if (tmp.nombre.equals(nombre))
            return tmp;
        }
        return null;
    }
    
    public void Eliminar(String nombre){
        if (!estaVacio()){
            NodoListaPlanta tmp=inicio;
            while (tmp.siguiente!=null){
                if (tmp.siguiente.nombre.equals(nombre)){
                    tmp.siguiente=null;
                    break;
                }
                else
                    tmp=tmp.siguiente;
            }
        }
    }
    
    public void Modificar(String nombre,String nombrenuevo, String defensa, String ataque,String imagen){
        NodoListaPlanta nuevo =new NodoListaPlanta(nombrenuevo,defensa,ataque,imagen);
        if (!estaVacio()){
            NodoListaPlanta tmp=inicio;
            while (tmp.siguiente!=null){
                if (tmp.siguiente.nombre.equals(nombre)){
                    nuevo.siguiente=tmp.siguiente.siguiente;
                    tmp.siguiente=nuevo;
                    break;
                }
                else
                    tmp=tmp.siguiente;
            }
        }
    }
    
    public String Mostrar(){
    return inicio.Mostrar();
    }
}
