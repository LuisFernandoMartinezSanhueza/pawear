/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Ventana extends javax.swing.JFrame {
private DefaultComboBoxModel<Persona> modelo = new DefaultComboBoxModel<Persona>();
private DefaultTableModel modeloTabla = new DefaultTableModel();
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        llenarModeloComboBox();
        agregarModeloTabla();
        initComponents();
        setLocationRelativeTo(null);//ventana en el centro
        
    }
    private void llenarModeloComboBox(){
        modelo.addElement(new Persona("Juan","Perez","juanperez@gmail.com","4234234","Ala chu"));
        modelo.addElement(new Persona("Pedro","Guzman Manzano","pedroMan@gmail.com","2342345","San Jorge"));
        modelo.addElement(new Persona("Samuel","Nandez","smalz@gmail.com","434534","Los Quitos"));
            modelo.addElement(new Persona("Juan","Larrain","junLarrin@gmail.com","23443234","Santiago"));
    }
    private void agregarModeloTabla(){
        modeloTabla.addColumn("Nombres");
        modeloTabla.addColumn("Apellidos");
        modeloTabla.addColumn("Email");
        modeloTabla.addColumn("Celular");
        modeloTabla.addColumn("Direccion");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        etiquetaPersona = new javax.swing.JLabel();
        comboPersonas = new javax.swing.JComboBox<>();
        insertarPersona = new javax.swing.JButton();
        panelTabla = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        Separador = new javax.swing.JSeparator();
        EtiquetaDatos = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        etiquetaApellido = new javax.swing.JLabel();
        cajaApellidos = new javax.swing.JTextField();
        etiquetaEmail = new javax.swing.JLabel();
        etiquetaCelular = new javax.swing.JLabel();
        cajaEmail = new javax.swing.JTextField();
        cajaCelular = new javax.swing.JTextField();
        etiquetaDireccion = new javax.swing.JLabel();
        cajaDireccion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaPersona.setFont(new java.awt.Font("DejaVu Sans", 1, 11)); // NOI18N
        etiquetaPersona.setText("Persona");

        comboPersonas.setModel(modelo);
        comboPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPersonasActionPerformed(evt);
            }
        });

        insertarPersona.setText("Insertar Persona");
        insertarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarPersonaActionPerformed(evt);
            }
        });

        tablaDatos.setModel(modeloTabla
        );
        tablaDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        //interface
        ListSelectionListener oyenteSeleccion = new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e){
                if(e.getValueIsAdjusting()){//seleccion de la fila, evento
                    int filaSeleccionada = tablaDatos.getSelectedRow();//retorna un entero

                    String nombre = (String) modeloTabla.getValueAt(filaSeleccionada,0);//obtener los datos
                    String apellidos = (String) modeloTabla.getValueAt(filaSeleccionada,1);
                    String email = (String) modeloTabla.getValueAt(filaSeleccionada,2);
                    String celular = (String) modeloTabla.getValueAt(filaSeleccionada,2);
                    String direccion = (String) modeloTabla.getValueAt(filaSeleccionada,4);

                    //pasar datos a las cajas

                    cajaNombre.setText(nombre);
                    cajaApellidos.setText(apellidos);
                    cajaCelular.setText(celular);
                    cajaEmail.setText(email);
                    cajaDireccion.setText(direccion);
                }
            }
        } ;
        tablaDatos.getSelectionModel().addListSelectionListener(oyenteSeleccion);//oyente de seleccion
        panelTabla.setViewportView(tablaDatos);

        EtiquetaDatos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        EtiquetaDatos.setText("Datos de la persona");

        etiquetaNombre.setText("Nombre");

        etiquetaApellido.setText("Apellido");

        cajaApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaApellidosActionPerformed(evt);
            }
        });

        etiquetaEmail.setText("Email");

        etiquetaCelular.setText("Celular");

        cajaEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaEmailActionPerformed(evt);
            }
        });

        cajaCelular.setText("                                     ");
        cajaCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaCelularActionPerformed(evt);
            }
        });

        etiquetaDireccion.setText("Direccion");

        cajaDireccion.setText("                                                                    ");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(etiquetaPersona)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(comboPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insertarPersona)
                        .addGap(42, 42, 42))))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Separador)))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaDireccion)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(etiquetaNombre)
                                    .addComponent(etiquetaEmail)
                                    .addComponent(etiquetaDireccion)
                                    .addComponent(cajaEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                    .addComponent(cajaNombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(etiquetaApellido)
                                        .addComponent(cajaApellidos)
                                        .addComponent(cajaCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                                    .addComponent(etiquetaCelular))
                                .addGap(12, 12, 12))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(EtiquetaDatos)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaPersona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertarPersona))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EtiquetaDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaCelular)
                    .addComponent(etiquetaEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPersonasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_comboPersonasActionPerformed

    private void cajaApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaApellidosActionPerformed

    private void cajaEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaEmailActionPerformed

    private void cajaCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaCelularActionPerformed

    private void insertarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarPersonaActionPerformed
            //saber que objeto 
            Persona p = (Persona) comboPersonas.getSelectedItem();//retorna el objeto seleccionado
            
            String nombres = p.getNombre();
            String apellidos = p.getApellidos();
            String email = p.getEmail();
            String celular = p.getCelular();
            String direccion = p.getDireccion();
            
            //AGREGAR A LA TABLA
            
            String [] persona = {nombres,apellidos,email,celular,direccion};//arreglo de sring
            
            modeloTabla.addRow(persona);
    }//GEN-LAST:event_insertarPersonaActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtiquetaDatos;
    private javax.swing.JPanel Panel;
    private javax.swing.JSeparator Separador;
    private javax.swing.JTextField cajaApellidos;
    private javax.swing.JTextField cajaCelular;
    private javax.swing.JTextField cajaDireccion;
    private javax.swing.JTextField cajaEmail;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JComboBox<Persona> comboPersonas;
    private javax.swing.JLabel etiquetaApellido;
    private javax.swing.JLabel etiquetaCelular;
    private javax.swing.JLabel etiquetaDireccion;
    private javax.swing.JLabel etiquetaEmail;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaPersona;
    private javax.swing.JButton insertarPersona;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JScrollPane panelTabla;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}