package rubricaborrosa;

import javax.swing.*;

public class VentanaConfiguracion extends JFrame
{
    public VentanaConfiguracion()
    {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPropiedadesSistema = new javax.swing.JPanel();
        jl1 = new javax.swing.JLabel();
        jl2 = new javax.swing.JLabel();
        jl3 = new javax.swing.JLabel();
        jl4 = new javax.swing.JLabel();
        jbContinuar = new javax.swing.JButton();
        jbAtras = new javax.swing.JButton();
        jcbAND = new javax.swing.JComboBox();
        jcbActivacion = new javax.swing.JComboBox();
        jcbAcumulacion = new javax.swing.JComboBox();
        jcbDefusificacion = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpPropiedadesSistema.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Propiedades", 2, 0, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jl1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl1.setText("Metodo AND");

        jl2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl2.setText("Metodo de Activación");

        jl3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl3.setText("Metodo de Acumulación");

        jl4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl4.setText("Metodo de Defusificación");

        jbContinuar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jbContinuar.setText("Continuar");
        jbContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbContinuarActionPerformed(evt);
            }
        });

        jbAtras.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jbAtras.setText("Atras");

        jcbAND.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jcbAND.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MIN" }));

        jcbActivacion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jcbActivacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MIN" }));

        jcbAcumulacion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jcbAcumulacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MAX" }));

        jcbDefusificacion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jcbDefusificacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "COG" }));

        javax.swing.GroupLayout jpPropiedadesSistemaLayout = new javax.swing.GroupLayout(jpPropiedadesSistema);
        jpPropiedadesSistema.setLayout(jpPropiedadesSistemaLayout);
        jpPropiedadesSistemaLayout.setHorizontalGroup(
            jpPropiedadesSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPropiedadesSistemaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPropiedadesSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbAND, javax.swing.GroupLayout.Alignment.CENTER, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbActivacion, javax.swing.GroupLayout.Alignment.CENTER, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbAcumulacion, javax.swing.GroupLayout.Alignment.CENTER, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbDefusificacion, javax.swing.GroupLayout.Alignment.CENTER, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpPropiedadesSistemaLayout.createSequentialGroup()
                        .addComponent(jbAtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbContinuar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpPropiedadesSistemaLayout.setVerticalGroup(
            jpPropiedadesSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPropiedadesSistemaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbAND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbActivacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jl3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbAcumulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jl4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbDefusificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpPropiedadesSistemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAtras)
                    .addComponent(jbContinuar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPropiedadesSistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPropiedadesSistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbContinuarActionPerformed
        
    }//GEN-LAST:event_jbContinuarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAtras;
    private javax.swing.JButton jbContinuar;
    private javax.swing.JComboBox jcbAND;
    private javax.swing.JComboBox jcbActivacion;
    private javax.swing.JComboBox jcbAcumulacion;
    private javax.swing.JComboBox jcbDefusificacion;
    private javax.swing.JLabel jl1;
    private javax.swing.JLabel jl2;
    private javax.swing.JLabel jl3;
    private javax.swing.JLabel jl4;
    private javax.swing.JPanel jpPropiedadesSistema;
    // End of variables declaration//GEN-END:variables
}
