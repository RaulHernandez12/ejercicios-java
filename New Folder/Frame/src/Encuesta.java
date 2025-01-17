
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raul
 */
public class Encuesta extends javax.swing.JFrame {

    /**
     * Creates new form Encuesta
     */
    public Encuesta() {
        initComponents();
        GrupoBotones.add(windows);
        GrupoBotones.add(linux);
        GrupoBotones.add(mac);
        windows.setActionCommand("Windows");
        mac.setActionCommand("mac");
        linux.setActionCommand("linux");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBotones = new javax.swing.ButtonGroup();
        windows = new javax.swing.JRadioButton();
        linux = new javax.swing.JRadioButton();
        mac = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chProgramacion = new javax.swing.JCheckBox();
        chBase = new javax.swing.JCheckBox();
        chSistemas = new javax.swing.JCheckBox();
        Shoras = new javax.swing.JSlider();
        lhoras = new javax.swing.JLabel();
        bmostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        windows.setText("Windows");

        linux.setText("Linux");
        linux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linuxActionPerformed(evt);
            }
        });

        mac.setText("Mac");
        mac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                macActionPerformed(evt);
            }
        });

        jLabel1.setText("Sistema operativo");

        jLabel2.setText("Especialidad");

        chProgramacion.setText("Programación");

        chBase.setText("Base de Datos");

        chSistemas.setText("Sistemas informaticos");

        Shoras.setMaximum(10);
        Shoras.setToolTipText("");
        Shoras.setValue(5);
        Shoras.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                ShorasAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Shoras.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ShorasStateChanged(evt);
            }
        });

        lhoras.setText("Horas");
        lhoras.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                lhorasComponentMoved(evt);
            }
        });

        bmostrar.setText("Mostrar selección");
        bmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(windows)
                        .addComponent(linux, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mac, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 435, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(chProgramacion)
                    .addComponent(chBase)
                    .addComponent(chSistemas))
                .addGap(367, 367, 367))
            .addGroup(layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(lhoras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Shoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addComponent(bmostrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(windows)
                    .addComponent(chProgramacion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linux)
                    .addComponent(chBase))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mac)
                    .addComponent(chSistemas))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Shoras, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(lhoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(bmostrar))
                .addContainerGap(219, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void linuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linuxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_linuxActionPerformed

    private void macActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_macActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_macActionPerformed

    private void ShorasAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ShorasAncestorMoved
        
    }//GEN-LAST:event_ShorasAncestorMoved

    private void ShorasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ShorasStateChanged
       
        lhoras.setText("" + Shoras.getValue());
        
    }//GEN-LAST:event_ShorasStateChanged

    private void lhorasComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_lhorasComponentMoved
        
    }//GEN-LAST:event_lhorasComponentMoved

    private void bmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmostrarActionPerformed
        String marcado="";
        String marcado1 = "";
        String marcado2= "";
        String marcado3= "";
        if(windows.isSelected()){
            marcado = "Windows";
        }else if (linux.isSelected()){
            marcado = "Linux";
        }else{
            marcado = "Mac";
        }
        
        if (chProgramacion.isSelected()){
            marcado1="Programación";
        }else{
            marcado1="";
        }
        if (chBase.isSelected()){
            marcado2="Base de datos";
        }else{
            marcado2="";
        }
        if (chSistemas.isSelected()){
            marcado3="Sistemas";
        }else{
            marcado3="";
        }
        
        
        String mensaje = "El sistema operativo es: " + marcado + " la especialidad es: " + marcado1 + " " + marcado2 + " " + marcado3 + " y las horas son: " + Shoras.getValue()  ;                       
        JOptionPane.showMessageDialog(this, mensaje);
        
    }//GEN-LAST:event_bmostrarActionPerformed

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
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoBotones;
    private javax.swing.JSlider Shoras;
    private javax.swing.JButton bmostrar;
    private javax.swing.JCheckBox chBase;
    private javax.swing.JCheckBox chProgramacion;
    private javax.swing.JCheckBox chSistemas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lhoras;
    private javax.swing.JRadioButton linux;
    private javax.swing.JRadioButton mac;
    private javax.swing.JRadioButton windows;
    // End of variables declaration//GEN-END:variables

    private void parseInt(int value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
