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
        return nombreGraphviz+"[label = \"<f0>|<f1>\"];\n";
    }
     
     public String Mostrar(){
    String texto=this.getNodoGraphviz();
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
}
