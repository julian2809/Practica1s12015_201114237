/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import Estructuras.*;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Julio
 */
public class PantallaSeleccion extends javax.swing.JFrame {
    //ventanaJugadorPlantas
    JFrame vjugadores = new JFrame();
    JButton agregar = new JButton();
    JButton finalizar = new JButton();
    JLabel jlnombre = new JLabel("Nombre:");
    JLabel jlcantidad = new JLabel("Cantidad");
    JLabel jlextra = new JLabel("Dato extra");
    JTextField jtnombre= new JTextField();
    JTextField jtcantidad= new JTextField();
    JTextField jtextra=new JTextField();
    JLabel Fondo2 = new JLabel();
    //variables
    private boolean plantaZombie=false;
    private boolean camposAgregados=false;
    //estructuras
    NodoCabecera usuario = new NodoCabecera();
    public PantallaSeleccion() {
        initComponents();
        iniciar_componentes();
        
         //acciones para el boton de la ventana de jugadores
    agregar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
            	//acciones
              if (camposAgregados==false){
                  if (jtnombre.getText().isEmpty()==false && jtcantidad.getText().isEmpty()==false){
                        jlextra.setVisible(true);
                        jtextra.setVisible(true);
                        camposAgregados=true;
                        if (plantaZombie)
                            usuario.CrearPlanta(jtnombre.getText(), jtcantidad.getText());
                        else
                            usuario.CrearZombie(jtnombre.getText(), jtcantidad.getText());
                  }
                  else{
                      //mensaje de error
                  }
              } 
              else{
                  if (jtextra.getText().isEmpty()==false){
                      if (plantaZombie)
                            usuario.AdicionalesPlanta(jtextra.getText());
                        else
                            usuario.AdicionalesZombie(jtextra.getText());
                      jtextra.setText("");
                  }
              }
            }
        });
     finalizar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
            	//acciones
              if (camposAgregados==false){
                  if (jtnombre.getText().isEmpty()==false && jtcantidad.getText().isEmpty()==false){
                        jlextra.setVisible(true);
                        jtextra.setVisible(true);
                        if (plantaZombie)
                            usuario.CrearPlanta(jtnombre.getText(), jtcantidad.getText());
                        else
                            usuario.CrearZombie(jtnombre.getText(), jtcantidad.getText());
                        vjugadores.dispose();
                        jtnombre.setText("");
                        jtcantidad.setText("");
                        jtextra.setText("");
                        Dibujar();
                  }
                  else{
                      //mensaje de error
                  }
              } 
              else{
                  if (jtextra.getText().isEmpty()==false){
                      if (plantaZombie)
                            usuario.AdicionalesPlanta(jtextra.getText());
                        else
                            usuario.AdicionalesZombie(jtextra.getText());
                  }
                  vjugadores.dispose();
                  camposAgregados=false;
                  jtnombre.setText("");
                  jtcantidad.setText("");
                  jtextra.setText("");
                  Dibujar();
              }
            }
                        
        });
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Jugador Plantas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Jugador Zombies");
        jButton2.setActionCommand("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Comenzar Juego");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar Datos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  
        if (usuario.plantas!=null && usuario.zombies!=null){
            CreacionPlantas vplantas = new CreacionPlantas();
            vplantas.show();
        }
        else{
            //mensaje error
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //this.iniciar_componentes();
        vjugadores.setVisible(true);
        vjugadores.setTitle("Plantas");
        plantaZombie=true;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.iniciar_componentes();
        vjugadores.setVisible(true);
        vjugadores.setTitle("Zombies");
        plantaZombie=false;
    }//GEN-LAST:event_jButton2ActionPerformed

    public void Dibujar(){
        String texto="digraph g {\n node [shape = record,height=.1];\n"+usuario.Mostrar()+"}";
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("C:\\Archivos\\grafoUsuario.txt");
            pw = new PrintWriter(fichero);
            pw.println(texto);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para
                // asegurarnos que se cierra el fichero.
                if (null != fichero)
                fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        try{
            String dotPath ="C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
            String fileInputPath = "C:\\Archivos\\grafoUsuario.txt";
            String fileOutputPath = "C:\\Archivos\\grafoUsuario.jpg";

            String tParam = "-Tjpg";
            String tOParam = "-o";

            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;

            Runtime rt = Runtime.getRuntime();

            rt.exec( cmd );

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaSeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaSeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaSeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaSeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaSeleccion().setVisible(true);
            }
        });
        
    }
   
    
    public void iniciar_componentes(){
        agregar.setText("Agregar mas campos");
        finalizar.setText("Finalizar");
        //Fondo2.setIcon(new ImageIcon(getClass().getResource("/imagenes/fondo2.jpg")));
    	vjugadores.getContentPane().add(agregar);
        vjugadores.getContentPane().add(finalizar);
    	vjugadores.getContentPane().add(jlnombre);
    	vjugadores.getContentPane().add(jlcantidad);
    	vjugadores.getContentPane().add(jtnombre);
    	vjugadores.getContentPane().add(jtcantidad); 	
        vjugadores.getContentPane().add(Fondo2);
        vjugadores.getContentPane().add(jlextra);
        vjugadores.getContentPane().add(jtextra);
        agregar.setOpaque(true);
        finalizar.setOpaque(true);
        jlnombre.setOpaque(true);
        jlcantidad.setOpaque(true);
        jlextra.setOpaque(true);
        jlnombre.setBackground(Color.white);
        jlcantidad.setBackground(Color.white);
        jlextra.setBackground(Color.white);
    	agregar.setBounds(50,420,175,40);
        finalizar.setBounds(250,420,175,40);
    	jlnombre.setBounds(5,5,150,30);
    	jtnombre.setBounds(5,55,150,20);
    	jlcantidad.setBounds(5,80,150,30);
    	jtcantidad.setBounds(5,121,150,20);
        jlextra.setBounds(5,150,150,30);
        jtextra.setBounds(5,190,150,20);
        jtextra.setVisible(false);
        jlextra.setVisible(false);
        Fondo2.setBounds(0,0,500,500);
    	vjugadores.setResizable(false);
    	vjugadores.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    	vjugadores.setLayout(null);
    	vjugadores.setVisible(false);   
    	vjugadores.setSize(500,500);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}
