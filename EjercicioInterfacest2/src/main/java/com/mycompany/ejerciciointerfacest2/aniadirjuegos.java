/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ejerciciointerfacest2;
import static com.mycompany.ejerciciointerfacest2.Steam_biblioteca.actualizar;
import java.util.HashMap;
import javax.swing.JButton;
/**
 *
 * @author tanuk
 */
public class aniadirjuegos extends javax.swing.JFrame {
private HashMap biblioteca;
private JButton[] botoneslibres;
    /**
     * Creates new form aniadirjuegos
     * 
     */
     public aniadirjuegos() {
        initComponents();
    }
    public aniadirjuegos(HashMap biblioteca,JButton[] botoneslibres) {
        initComponents();
        this.biblioteca = biblioteca;
        this.botoneslibres = botoneslibres;
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        gamename = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        nameauthor = new javax.swing.JTextField();
        genero = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        aniopubli = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        Imagen = new javax.swing.JLabel();
        img = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 5, 20, 0));
        jPanel1.setLayout(new java.awt.GridLayout(5, 2, 0, 10));

        jLabel1.setText("Nombre Del Juego");
        jPanel1.add(jLabel1);

        gamename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamenameActionPerformed(evt);
            }
        });
        jPanel1.add(gamename);

        nombre.setText("Nombre Del Autor");
        jPanel1.add(nombre);
        jPanel1.add(nameauthor);

        genero.setText("Genero");
        jPanel1.add(genero);

        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel1.add(gender);

        aniopubli.setText("Año De Publicación");
        jPanel1.add(aniopubli);
        jPanel1.add(year);

        Imagen.setText("Imagen");
        jPanel1.add(Imagen);

        img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgActionPerformed(evt);
            }
        });
        jPanel1.add(img);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jButton1.setText("Añadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void gamenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gamenameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int check = 0;
        if(gamename.getText()==null || gamename.getText().equals("")){
            
        }
        else{
        check++;
        }
        if(gender.getText()==null || gender.getText().equals("")){
            
        }
        else{
        check++;
        }
        
        if(year.getText()==null || year.getText().equals("")){
            
        }
        else{
        try{
        int y = Integer.parseInt(year.getText());
        check++;
        }
        catch(Exception e){
        year.setText("");
        
        }
       }
        
        if(nameauthor.getText()==null || nameauthor.getText().equals("")){
            
        }
        else{
        check++;
        }
        
        
        if(check==4){
            if(biblioteca.containsKey(gamename.getText())){
            // Mostrar un error
            }
            else{
            biblioteca.put(gamename.getText(),new Juego(gamename.getText(),"",nameauthor.getText(),gender.getText(),Integer.parseInt(year.getText()))); 
                
                actualizar(botoneslibres, gamename.getText());
             dispose();
            }
            
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void imgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imgActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(aniadirjuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aniadirjuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aniadirjuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aniadirjuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aniadirjuegos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen;
    private javax.swing.JLabel aniopubli;
    private javax.swing.JTextField gamename;
    private javax.swing.JTextField gender;
    private javax.swing.JLabel genero;
    private javax.swing.JTextField img;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nameauthor;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
