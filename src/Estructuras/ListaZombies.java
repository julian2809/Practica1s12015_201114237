/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Julio
 */
public class ListaZombies {
    public NodoListaZombie inicio;
    public int tamano;
    
    public ListaZombies(){
        inicio=null;
        tamano=0;
    }
    public boolean estaVacio(){
        if (inicio==null)
            return true;
        return false;
    }
        
    public void Insertar(NodoListaZombie planta){
        if (!estaVacio()){
            NodoListaZombie bandera=inicio;
                while (bandera.siguiente!=null){
                    bandera=bandera.siguiente;
                }
             bandera.siguiente=planta;
             planta.anterior=bandera;
         }
        else{
            inicio=planta;
        }
    }
    
    public NodoListaZombie Buscar(String nombre){
        if (!estaVacio()){
            NodoListaZombie tmp=inicio;
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
            NodoListaZombie tmp=inicio;
            while (tmp.siguiente!=null && tmp.nombre.equals(nombre)==false){
                    tmp.siguiente=tmp.siguiente.siguiente;
            } 
            if (tmp.nombre.equals(nombre)){
                if (tmp==inicio){
                    inicio=tmp.siguiente;
                }
                else if (tmp.siguiente==null){
                    tmp.anterior.siguiente=null;
                }
                else{
                    tmp.anterior.siguiente=tmp.siguiente;
                    tmp.siguiente.anterior=tmp.anterior;
                }
            }
        }
    }
    
    public void Modificar(String nombre,String nombrenuevo, String defensa, String ataque,String imagen){
        NodoListaZombie nuevo =new NodoListaZombie(nombrenuevo,defensa,ataque,imagen);
        if (!estaVacio()){
            NodoListaZombie tmp=inicio;
            while (tmp.siguiente!=null && tmp.nombre.equals(nombre)==false){
                    tmp.siguiente=tmp.siguiente.siguiente;
            } 
            if (tmp.nombre.equals(nombre)){
                if (tmp==inicio){
                    inicio=nuevo;
                }
                else if (tmp.siguiente==null){
                    tmp.anterior.siguiente=nuevo;
                }
                else{
                    tmp.anterior.siguiente=nuevo;
                    tmp.siguiente.anterior=nuevo;
                    nuevo.siguiente=tmp.siguiente;
                    nuevo.anterior=tmp.anterior;
                }
            }
        }
    }
    
    public String Mostrar(){
    return inicio.Mostrar();
    }
}
