package rubricaborrosa;

import java.util.*;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class VentanaCriterios extends javax.swing.JFrame {

    ArrayList<String> vectorDatos;

    public VentanaCriterios(ArrayList<String> v) {
        initComponents();

        if (v != null) {
            vectorDatos = v;
        } else {
            vectorDatos = new ArrayList();
        }

        ArrayList<String> datosHetero = new ArrayList();
        ArrayList<String> datosCo = new ArrayList();
        ArrayList<String> datosAuto = new ArrayList();

        for (int i = 2; i < vectorDatos.size(); i = i + 2) {
            switch (vectorDatos.get(i)) {
                case ("Hetero"):
                    datosHetero.add(vectorDatos.get(i + 1));
                    break;
                case ("Co"):
                    datosCo.add(vectorDatos.get(i + 1));
                    break;
                case ("Auto"):
                    datosAuto.add(vectorDatos.get(i + 1));
                    break;
            }

        }

        //------------------------- Nivel 1
        JComboBox combo1 = new JComboBox();
        combo1.setModel(new DefaultComboBoxModel(new Object[]{"Adquirir", "Calcular", "Citar", "Clasificar", "Conocer", "Decir", "Definir", "Describir", "Distinguir", "Enumerar", "Fijar", "Formular", "Hacer listado", "Identificar", "Localizar", "Mostrar", "Nombrar", "Recitar", "Recordar", "Relatar", "Repetir", "Reproducir", "Seleccionar", "Señalar", "Subrayar", "Traducir"}));
        combo1.setSelectedIndex(0);

        String nivel1 = combo1.getSelectedItem().toString();

        //------------------------- Nivel 2
        JComboBox combo2 = new JComboBox();
        combo2.setModel(new DefaultComboBoxModel(new Object[]{"Anular", "Cambiar", "Comentar", "Comparar", "Confeccionar", "Construir", "Decir", "Describir", "Determinar", "Dibujar", "Diferenciar", "Discutir", "Distinguir", "Explicar", "Expresar", "Extraer conclusiones", "Fundamentar", "Generalizar", "Hacer listas", "Identificar", "Ilustrar", "Inferir", "Informar", "Interpretar", "Justificar", "Leer", "Memorizar", "Narrar", "Preparar", "Recitar", "Reconocer", "Recordar", "Relacionar", "Relatar", "Repetir", "Replantear", "Representar", "Resumir", "Traducir", "Transformar", "Ubicar"}));
        combo2.setSelectedIndex(0);

        String nivel2 = combo2.getSelectedItem().toString();

        //------------------------- Nivel 3
        JComboBox combo3 = new JComboBox();
        combo3.setModel(new DefaultComboBoxModel(new Object[]{"Aplicar", "Clasificar", "Comparar", "Demostrar", "Desarrollar", "Descubrir", "Diseñar", "Dramatizar", "Efectuar", "Ejemplificar", "Ejercitar", "Ensayar", "Escoger", "Experimentar", "Fomentar", "Hacer", "Ilustrar", "Interpretar", "Llevar a cabo", "Modificar", "Operar", "Organizar", "Planificar", "Practicar", "Programar", "Realizar", "Reestructurar", "Relacionar", "Resolver", "Sintetizar", "Usar", "Utilizar"}));
        combo3.setSelectedIndex(0);

        String nivel3 = combo3.getSelectedItem().toString();

        //------------------------- Nivel 4
        JComboBox combo4 = new JComboBox();
        combo4.setModel(new DefaultComboBoxModel(new Object[]{"Aclamar", "Analizar", "Calcar", "Comparar", "Constatar", "Criticar", "Debatir", "Desarmar", "Descomponer", "Descubrir", "Desmenuzar", "Determinar", "Diagramar", "Diferenciar", "Distinguir", "Enfocar", "Examinar", "Experimentar", "Inspeccionar", "Inventar", "Investigar", "Observar", "Probar", "Relacionar", "Señalar", "Ver"}));
        combo4.setSelectedIndex(0);

        String nivel4 = combo4.getSelectedItem().toString();

        //------------------------- Nivel 5
        JComboBox combo5 = new JComboBox();
        combo5.setModel(new DefaultComboBoxModel(new Object[]{"Categorizar", "Clasificar", "Coleccionar", "Compilar", "Componer", "Concebir", "Concluir", "Confeccionar", "Constituir", "Crear", "Deducir", "Definir", "Diseñar", "Elaborar", "Escribir", "Especificar", "Esquematizar", "Fabricar", "Formular", "Idear", "Imaginar", "Intuir", "Inventar", "Juntar", "Manejar", "Ordenar", "Organizar", "Planificar", "Preparar", "Producir", "Proponer", "Proyectar", "Reconstruir", "Relatar", "Resumir", "Sintetizar", "Suponer", "Teorizar"}));
        combo5.setSelectedIndex(0);

        String nivel5 = combo5.getSelectedItem().toString();

        //------------------------- Nivel 6
        JComboBox combo6 = new JComboBox();
        combo6.setModel(new DefaultComboBoxModel(new Object[]{"Apreciar", "Aprobar", "Argumentar", "Asignar puntos", "Asignar valor", "Auscultar", "Calcular", "Calificar", "Comparar", "Comprobar", "Considerar", "Constatar", "Criticar", "Decidir", "Discutir", "Elegir", "Escoger", "Estimar", "Jerarquizar", "Juzgar", "Medir", "Preferir", "Rechazar", "Revisar", "Tipificar", "Valorar"}));
        combo6.setSelectedIndex(0);

        String nivel6 = combo6.getSelectedItem().toString();
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        for (int j = 0; j < datosHetero.size(); j++) {

            switch (Integer.parseInt(vectorDatos.get(1))) {
                case (1):
                    model.addRow(new Object[]{datosHetero.get(j), true, nivel1, "", true, nivel1, "", true, nivel1, ""});
                    jTable1.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(combo1));
                    jTable1.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(combo1));
                    jTable1.getColumnModel().getColumn(8).setCellEditor(new DefaultCellEditor(combo1));
                    break;
                case (2):
                    model.addRow(new Object[]{datosHetero.get(j), true, nivel2, "", true, nivel2, "", true, nivel2, ""});
                    jTable1.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(combo2));
                    jTable1.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(combo2));
                    jTable1.getColumnModel().getColumn(8).setCellEditor(new DefaultCellEditor(combo2));
                    break;
                case (3):
                    model.addRow(new Object[]{datosHetero.get(j), true, nivel3, "", true, nivel3, "", true, nivel3, ""});
                    jTable1.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(combo3));
                    jTable1.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(combo3));
                    jTable1.getColumnModel().getColumn(8).setCellEditor(new DefaultCellEditor(combo3));
                    break;
                case (4):
                    model.addRow(new Object[]{datosHetero.get(j), true, nivel4, "", true, nivel4, "", true, nivel4, ""});
                    jTable1.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(combo4));
                    jTable1.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(combo4));
                    jTable1.getColumnModel().getColumn(8).setCellEditor(new DefaultCellEditor(combo4));
                    break;
                case (5):
                    model.addRow(new Object[]{datosHetero.get(j), true, nivel5, "", true, nivel5, "", true, nivel5, ""});
                    jTable1.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(combo5));
                    jTable1.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(combo5));
                    jTable1.getColumnModel().getColumn(8).setCellEditor(new DefaultCellEditor(combo5));
                    break;
                case (6):
                    model.addRow(new Object[]{datosHetero.get(j), true, nivel6, "", true, nivel6, "", true, nivel6, ""});
                    jTable1.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(combo6));
                    jTable1.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(combo6));
                    jTable1.getColumnModel().getColumn(8).setCellEditor(new DefaultCellEditor(combo6));
                    break;
            }
        }

        model = (DefaultTableModel) jTable2.getModel();

        for (int j = 0; j < datosCo.size(); j++) {
            switch (Integer.parseInt(vectorDatos.get(1))) {
                case (1):
                    model.addRow(new Object[]{datosCo.get(j), true, nivel1, "", true, nivel1, "", true, nivel1, ""});
                    jTable2.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(combo1));
                    jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(combo1));
                    jTable2.getColumnModel().getColumn(8).setCellEditor(new DefaultCellEditor(combo1));
                    break;
                case (2):
                    model.addRow(new Object[]{datosCo.get(j), true, nivel2, "", true, nivel2, "", true, nivel2, ""});
                    jTable2.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(combo2));
                    jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(combo2));
                    jTable2.getColumnModel().getColumn(8).setCellEditor(new DefaultCellEditor(combo2));
                    break;
                case (3):
                    model.addRow(new Object[]{datosCo.get(j), true, nivel3, "", true, nivel3, "", true, nivel3, ""});
                    jTable2.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(combo3));
                    jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(combo3));
                    jTable2.getColumnModel().getColumn(8).setCellEditor(new DefaultCellEditor(combo3));
                    break;
                case (4):
                    model.addRow(new Object[]{datosCo.get(j), true, nivel4, "", true, nivel4, "", true, nivel4, ""});
                    jTable2.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(combo4));
                    jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(combo4));
                    jTable2.getColumnModel().getColumn(8).setCellEditor(new DefaultCellEditor(combo4));
                    break;
                case (5):
                    model.addRow(new Object[]{datosCo.get(j), true, nivel5, "", true, nivel5, "", true, nivel5, ""});
                    jTable2.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(combo5));
                    jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(combo5));
                    jTable2.getColumnModel().getColumn(8).setCellEditor(new DefaultCellEditor(combo5));
                    break;
                case (6):
                    model.addRow(new Object[]{datosCo.get(j), true, nivel6, "", true, nivel6, "", true, nivel6, ""});
                    jTable2.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(combo6));
                    jTable2.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(combo6));
                    jTable2.getColumnModel().getColumn(8).setCellEditor(new DefaultCellEditor(combo6));
                    break;
            }
        }

        model = (DefaultTableModel) jTable3.getModel();

        for (int j = 0; j < datosAuto.size(); j++) {
            switch (Integer.parseInt(vectorDatos.get(1))) {
                case (1):
                    model.addRow(new Object[]{datosAuto.get(j), true, nivel1, "", true, nivel1, "", true, nivel1, ""});
                    jTable3.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(combo1));
                    jTable3.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(combo1));
                    jTable3.getColumnModel().getColumn(8).setCellEditor(new DefaultCellEditor(combo1));
                    break;
                case (2):
                    model.addRow(new Object[]{datosAuto.get(j), true, nivel2, "", true, nivel2, "", true, nivel2, ""});
                    jTable3.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(combo2));
                    jTable3.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(combo2));
                    jTable3.getColumnModel().getColumn(8).setCellEditor(new DefaultCellEditor(combo2));
                    break;
                case (3):
                    model.addRow(new Object[]{datosAuto.get(j), true, nivel3, "", true, nivel3, "", true, nivel3, ""});
                    jTable3.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(combo3));
                    jTable3.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(combo3));
                    jTable3.getColumnModel().getColumn(8).setCellEditor(new DefaultCellEditor(combo3));
                    break;
                case (4):
                    model.addRow(new Object[]{datosAuto.get(j), true, nivel4, "", true, nivel4, "", true, nivel4, ""});
                    jTable3.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(combo4));
                    jTable3.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(combo4));
                    jTable3.getColumnModel().getColumn(8).setCellEditor(new DefaultCellEditor(combo4));
                    break;
                case (5):
                    model.addRow(new Object[]{datosAuto.get(j), true, nivel5, "", true, nivel5, "", true, nivel5, ""});
                    jTable3.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(combo5));
                    jTable3.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(combo5));
                    jTable3.getColumnModel().getColumn(8).setCellEditor(new DefaultCellEditor(combo5));
                    break;
                case (6):
                    model.addRow(new Object[]{datosAuto.get(j), true, nivel6, "", true, nivel6, "", true, nivel6, ""});
                    jTable3.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(combo6));
                    jTable3.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(combo6));
                    jTable3.getColumnModel().getColumn(8).setCellEditor(new DefaultCellEditor(combo6));
                    break;
            }
        }

        jTable1.repaint();
        jTable2.repaint();
        jTable3.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Criterios", "SER", "SER VERBO", "Complemento", "SABER", "SABER VERBO", "Complemento", "HACER", "HACER VERBO", "Complemento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1099, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(445, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jTabbedPane1.addTab("Hetero", jScrollPane1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Criterios", "SER", "SER VERBO", "Complemento", "SABER", "SABER VERBO", "Complemento", "HACER", "HACER VERBO", "Complemento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1099, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(452, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel2);

        jTabbedPane1.addTab("Co", jScrollPane2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Criterios", "SER", "SER VERBO", "Complemento", "SABER ", "SABER VERBO", "Complemento", "HACER", "HACER VERBO", "Complemento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1099, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(451, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel3);

        jTabbedPane1.addTab("Auto", jScrollPane3);

        jButton1.setText("Atras");

        jButton2.setText("Continuar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1143, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jButton1)
                        .addGap(202, 202, 202)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VentanaFuncionesP vp = new VentanaFuncionesP();
        vp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
